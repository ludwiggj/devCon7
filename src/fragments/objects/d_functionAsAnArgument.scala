package fragments.objects

object d_functionAsAnArgument extends App {

  def apply(f: (Int) => (Int), value: Int) = {
    f(value)
  }

  def add5(x: Int) = { x + 5 }

  def subtract3(x: Int) = { x - 3 }
  
  val twoAdd5 = apply(add5, 2)
  
  val sevenSubtract3 = apply(subtract3, 7)

  // Output results
  println("2 add 5 = " + twoAdd5)
  println("7 subtract 3 = " + sevenSubtract3)
}