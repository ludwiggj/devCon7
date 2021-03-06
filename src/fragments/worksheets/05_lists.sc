// 05 - lists

object lists {

  val fruit = List("apples", "oranges", "pears")

  val moreFruit = "apples" :: "oranges" :: "pears" :: Nil

  fruit.head

  fruit.tail

  fruit.tail.tail

  fruit.tail.tail.tail

  // list is immutable
  fruit :+ "bananas"

  fruit

  fruit.updated(0, "kumquats")

  fruit
}