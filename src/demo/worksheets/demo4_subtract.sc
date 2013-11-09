package demo
import demo.Anagrams.{ CharacterOccurrences, characterOccurrencesInWord,
                       characterOccurrencesInSentence, subtractOccurrences }

object demo4_subtract {

  // subtract
  characterOccurrencesInSentence(List("Ernie", "is", "evil"))

  characterOccurrencesInWord("leer")

  subtractOccurrences(
    characterOccurrencesInSentence(List("Ernie", "is", "evil")),
    characterOccurrencesInWord("leer")
  )
}