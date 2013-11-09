package fragments.objects

object c_functionReturningAFunction extends App {

  def adder = (n: Int) => { (x: Int) => x + n }

  def add3 = adder(3)
  def add10 = adder(10)

  val twoAdd3 = add3(2)
  val fifteenAdd3 = add3(15)
  val twoAdd10 = add10(2)

  // Output results
  println("2 add 3 = " + twoAdd3)
  println("15 add 3 = " + fifteenAdd3)
  println("2 add 10 = " + twoAdd10)
}