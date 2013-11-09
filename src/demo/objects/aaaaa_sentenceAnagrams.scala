package demo.objects

import demo.Anagrams.{Sentence, CharacterOccurrences, occurrenceCombinations,
                      wordsForOccurrences, characterOccurrencesInSentence,
                      subtractOccurrences}

object aaaaa_sentenceAnagrams extends App {

  // Function - sentenceAnagrams
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

  // sentence anagrams
  val anagrams = sentenceAnagrams(List("Ernie", "is", "evil"))

  val anagramsReel = anagrams.filter(_.contains("reel"))

  val longAnagrams = anagrams.filter(_.forall(_.length() >= 4))
  
  println("anagrams of ErnieIsEvil = " + anagrams)
  println()
  println("anagrams containing reel = " + anagramsReel)
  println()
  println("anagrams with long words = " + longAnagrams)
  

}