package fragments.objects

object b_functions extends App {
  def double(x: Int) = { 2 * x }
  
  val double12 = double(12)

  // A function literal (anonymous function)
  // (<List of fn parameters>) => { ... fn body as  a block ...}

  (x: Int) => { 2 * x }

  // Assign function literal

  val doubler = (x: Int) => { 2 * x }

  // Output results...
  println("double 12 = " + double12)
  println("double 24 = " + doubler(24))
}