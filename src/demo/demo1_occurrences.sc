package demo

object demo1_occurrences {
  type Word = String
  type Sentence = List[Word]
  type CharacterOccurrences = List[(Char, Int)]

  // Word occurrencies - step 1
  "Ernie".toLowerCase groupBy ((ch: Char) => ch)

  // Function - characterOccurrencesInWord
  def characterOccurrencesInWord(w: Word) = {
    {
      (w.toLowerCase groupBy ((ch: Char) => ch)) map {
        case (key, value) => (key, value length)
      }
    }.toList.sorted
  }

  wordOccurrences("Ernie")

  // Function - characterOccurrencesInSentence
  def characterOccurrencesInSentence(s: Sentence) =
    characterOccurrencesInWord(s mkString)

  characterOccurrencesInSentence(
    List("Ernie", "is", "Evil")
  )

}