package fragments.objects

object e_lists extends App {
  val fruit = List("apples", "oranges", "pears")
  
  val moreFruit = "apples" :: "oranges" :: "pears" :: Nil
  
  // list is immutable
  val bonusFruit = fruit :+ "bananas"
  
  val updatedFruit = fruit.updated(0, "kumquats")
  
  // Output results
  println("fruit        = " + fruit)
  println("moreFruit    = " + moreFruit)
  println("head         = " + fruit.head)
  println("tail         = " + fruit.tail)
  println("bonusFruit   = " + bonusFruit)
  println("fruit        = " + fruit)
  println("updatedFruit = " + updatedFruit)
  println("fruit        = " + fruit)
}