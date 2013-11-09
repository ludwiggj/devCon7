package demo.objects

object a_characterOccurrences extends App {

  type Word = String
  type Sentence = List[Word]
  type CharacterOccurrences = List[(Char, Int)]

  val characterOccurrenciesStep1 = "Ernie".toLowerCase groupBy ((ch: Char) => ch)

  // Function - characterOccurrencesInWord
  def characterOccurrencesInWord(w: Word) = {
    {
      (w.toLowerCase groupBy ((ch: Char) => ch)) map {
        case (key, value) => (key, value length)
      }
      
    }.toList.sorted
  }

  val ernieCharOccurrencies = characterOccurrencesInWord("Ernie")

  // Function - characterOccurrencesInSentence
  def characterOccurrencesInSentence(s: Sentence) =
    characterOccurrencesInWord(s mkString)

  val ernieIsEvilCharOccurrencies
    = characterOccurrencesInSentence(List("Ernie", "is", "Evil"))
  
  // Output results
  println("ernie ...        " + characterOccurrenciesStep1)
  println("ernie          = " + ernieCharOccurrencies)
  println("Ernie is evil  = " + ernieIsEvilCharOccurrencies)
}