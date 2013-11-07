package demo
import demo.Anagrams.{Sentence, CharacterOccurrences, occurrenceCombinations,
                      wordsForOccurrences, characterOccurrencesInSentence,
                      subtractOccurrences}

object demo5_sentenceAnagrams {

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
  lazy val anagrams =
    sentenceAnagrams(List("Ernie", "is", "evil"))

  anagrams.filter(_.contains("reel"))

  anagrams.filter(_.forall(_.length() >= 4))

}