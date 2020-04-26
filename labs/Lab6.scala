package labs

import scala.collection.mutable.ArrayBuffer

object Lab6 {

  def rev(list:List[Int]):List[Int] = {
      val new_list = list.reverse.map((i: Int) => i * 2)
      println(new_list(3))
      new_list
  }

  def find_min(list : List[Int]): Int =
  {
    list.foldLeft(list(0))
    {case (min, x) =>
      if (x < min) x
      else min
    }
  }


  def fibonacci(n: Int): Int =
    if (n < 3) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  def form_fib(): ArrayBuffer[Int] =
  {
    val fib = ArrayBuffer[Int]()
    for(i <- 1 until 16)
    {
      fib+=fibonacci(i)
    }
    fib
  }

  def remove_from(list:List[Int]): List[Int] =
  {
    val fib = form_fib()
    list.filter((item: Int)=> fib.contains(item))
  }
}
