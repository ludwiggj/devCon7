package demo.objects
import demo.Anagrams.{occurrenceCombinations, characterOccurrencesInWord}

object aaa_combinations extends App {

  // combinations of occurrences
  val charsInIs = characterOccurrencesInWord("is")

  val combinationsOfCharsInIs = occurrenceCombinations(charsInIs)

  val charsInErnie = characterOccurrencesInWord("Ernie")

  val combinationsOfCharsInErnie = occurrenceCombinations(charsInErnie)
  
  // output values
  println("charsInIs = " + charsInIs)
  println("combinations = " + combinationsOfCharsInIs)
  println("charsInErnie = " + charsInErnie)
  println("combinations = " + combinationsOfCharsInErnie)
}