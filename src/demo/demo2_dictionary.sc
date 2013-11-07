package demo
import demo.Anagrams.{dictionary, characterOccurrencesInWord}

object demo2_dictionary {

  // Function - dictionaryByOccurrences
  val wordsForOccurrences =
    dictionary groupBy characterOccurrencesInWord withDefaultValue List()

    wordsForOccurrences(
      characterOccurrencesInWord("leer")
    )
}