package demo

import common._
import scala.language.postfixOps

class Anagrams {}

object Anagrams {

  /** A word is simply a `String`. */

  type Word = String

  /** A sentence is a `List` of words. */
  
  type Sentence = List[Word]

  /** `Occurrences` is a `List` of pairs of characters and positive integers saying how often the character appears. */
  
  type CharacterOccurrences = List[(Char, Int)]

  /** Dictionary is a sequence of words. */
  
  val dictionary: List[Word] = loadDictionary

  /** Converts a word into its character occurrence list. */
  
  def characterOccurrencesInWord(w: Word): CharacterOccurrences = {
    val countMap = (w.toLowerCase groupBy ((ch: Char) => ch)) map {
      case (ch, occurrences) => (ch, occurrences length)
    }
    countMap.toList.sorted
  }

  /** Converts a sentence into its character occurrence list. */
  
  def characterOccurrencesInSentence(s: Sentence): CharacterOccurrences = characterOccurrencesInWord(s mkString)

  /** The `dictionaryByOccurrences` is a `Map` from different occurrences to a sequence of all
    * the words that have that occurrence count.                                               */
  
  lazy val wordsForOccurrences: Map[CharacterOccurrences, List[Word]] =
    dictionary groupBy characterOccurrencesInWord withDefaultValue List()

  /** Returns all the anagrams of a given word. */
  
  def wordAnagrams(word: Word): List[Word] =
    wordsForOccurrences(characterOccurrencesInWord(word))

  /** Returns the list of all subsets of the occurrence list.
    * This includes the occurrence itself, i.e. `List(('k', 1), ('o', 1))`
    * is a subset of `List(('k', 1), ('o', 1))`. It also include the empty subset `List()`. */
    
  def occurrenceCombinations(occurrences: CharacterOccurrences): List[CharacterOccurrences] = {
    occurrences match {
      case Nil => List(List())
      case (headCh, headCount) :: tail => {
        val combis = for {
          chosenCount <- 0 to headCount
          tailSolution <- occurrenceCombinations(tail)
        } yield if (chosenCount > 0) ((headCh, chosenCount) :: tailSolution) else tailSolution
        combis.toList
      }
    }
  }

  /** Subtracts occurrence list `y` from occurrence list `x`, where `y` is a subset of `x` */

  def subtractOccurrences(x: CharacterOccurrences, y: CharacterOccurrences): CharacterOccurrences = {
    y.toMap.foldLeft(x.toMap) {
      case (xMap, (char, currentCount)) => {
        val newCount = xMap(char) - currentCount
        if (newCount == 0) (xMap - char) else xMap.updated(char, newCount)
      }
    }.toList.sorted
  }

  /** Returns a list of all anagram sentences of the given sentence. */
  
  def sentenceAnagrams(sentence: Sentence): List[Sentence] = {
    def findAnagram(occurrences: CharacterOccurrences): List[Sentence] = {
      occurrences match {
        case Nil => List(List())
        case _ => for {
          chosenOccurrencies <- occurrenceCombinations(occurrences)
          word <- wordsForOccurrences(chosenOccurrencies)
          restOfSentence <- findAnagram(
                              subtractOccurrences(
                                  occurrences,
                                  chosenOccurrencies
                              )
                            )
        } yield (word :: restOfSentence)
      }
    }
    findAnagram(characterOccurrencesInSentence(sentence))
  }
}