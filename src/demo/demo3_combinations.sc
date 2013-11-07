package demo
import demo.Anagrams.{occurrenceCombinations, characterOccurrencesInWord}
object demo3_combinations {

  // combinations of occurrences
  characterOccurrencesInWord("is")

  occurrenceCombinations(
    characterOccurrencesInWord("is")
  )

  characterOccurrencesInWord("Ernie")

  occurrenceCombinations(
    characterOccurrencesInWord("Ernie")
}