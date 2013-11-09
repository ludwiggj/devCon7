package fragments.objects

object a_typeInference extends App {
  val x = 10
  
  val y = "Hello I am " + 43 + " years old"
  
  def greeting(age: Int) = {
    "Hello I am " + age + " years old"
  }

  def recurse(count: Int): Int = {
    if (count > 0) recurse(count - 1) else 0
  }

  // Output results...
  println("x^2 = " + (x * x))
  println("y = " + y)
  println("greeting = " + greeting(43))
  println("recurse = " + recurse(12))
}