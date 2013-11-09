package demo.objects

import demo.Anagrams.{characterOccurrencesInWord, characterOccurrencesInSentence, subtractOccurrences}

object aaaa_subtract extends App {

  // subtract
  val charsInErnieIsEvil = characterOccurrencesInSentence(List("Ernie", "is", "evil"))

  val charsInReel = characterOccurrencesInWord("reel")

  val remainingChars = subtractOccurrences(charsInErnieIsEvil, charsInReel)
  
  // output
  println("originalChars     = " + charsInErnieIsEvil)
  println("chars to subtract = " + charsInReel)
  println("remaining chars   = " + remainingChars)
}