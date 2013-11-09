package fragments.objects

object h_patternMatch extends App {

  val numberList = List(9, -7, 2)

  //  9 :: -7 :: 2 :: Nil

  def doubleList(xs: List[Int]): List[Int] = xs match {
    case Nil => Nil
    case y :: ys => (2 * y) :: doubleList(ys)
  }

  val doubled = doubleList(numberList)
  
  println(doubled)
}
  /*
           => doubleList(List(9, -7, 2))

 [step 1]  => doubleList(9 :: -7 :: 2 :: Nil)           // case y :: ys => (2 * y) :: doubleList(ys)

 [step 2]  => case (9 :: (-7 :: 2 :: Nil))             

 [step 3]  => (2 * 9) :: doubleList(-7 :: 2 :: Nil)

 [step 4]  => 18 :: case (-7 :: (2 :: Nil))

 [step 5]  => 18 :: (2 * -7) :: doubleList(2 :: Nil)    // case y :: ys => (2 * y) :: doubleList(ys)

 [step 6]  => 18 :: -14 :: case (2 :: Nil)

 [step 7]  => 18 :: -14 :: (2 * 2) :: doubleList(Nil)   // case Nil => Nil

 [step 8]  => 18 :: -14 :: 4 :: Nil

 [step 9]  => List(18, -14, 4)

  */