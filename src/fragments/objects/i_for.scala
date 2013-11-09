package fragments.objects

object i_for extends App {
  for (i <- 1 to 10) print(i + " ")
  println()

  for (i <- 1 to 10; if i % 2 == 0) print(i + " ")
  println()

  val oneToTen = for (i <- 1 to 10) yield i

  val tuples = for (i <- 1 to 3; j <- 1 to 3) yield (i, j)

  val integerFactorsOf20 = for {
    i <- 1 to 20
    j <- 1 to 20
    if (i * j == 20)
  } yield (i, j)

  val uniqueIntegerFactorsOf20 = for {
    i <- 1 to 20
    j <- 1 to 20
    if (i <= j)
    if (i * j == 20)
  } yield (i, j)
  
  // Output results
  println("oneToTen       = " + oneToTen)
  println("tuples         = " + tuples)
  println("factors        = " + integerFactorsOf20)
  println("unique factors = " + uniqueIntegerFactorsOf20)
}