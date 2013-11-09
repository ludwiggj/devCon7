package demo.objects
import demo.Anagrams.{ dictionary, characterOccurrencesInWord }

object aa_dictionary extends App {

  // Function - dictionaryByOccurrences
  val wordsForOccurrences =
    dictionary groupBy characterOccurrencesInWord withDefaultValue List()

  val anagramsOfAmbler = wordsForOccurrences(characterOccurrencesInWord("ambler"))

  // Output results
  println(wordsForOccurrences.filter({ case (occurrencies, wordList) => wordList.length > 3 }).head)
  println("Anagrams of ambler = " + anagramsOfAmbler)
}