package labs
import labs.Lab6
import scala.annotation.tailrec
import scala.collection.mutable.{ArrayBuffer, Stack}

object lab5{


  @tailrec
  final def get_stack_rec(s: Stack[Int]): Int =
    if (s.length == 2)  s.pop()
    else {
      s.pop()
      get_stack_rec(s)
    }

  def get_stack(s: Stack[Int]): Int = {
    val temp = s.clone()
    while(temp.length>2)
    {
      temp.pop()
    }
    temp.pop()
  }

  def get_ind(seq:Seq[Int]): Int =
  {
    //  val seq = Seq( 1, 2 , 3 , 4 , 5 , 6)
    val d = ArrayBuffer.empty[Int]
    for(j <- 0 until seq.length)
      d+=1

    for (i <- 1 until seq.length) {

      if(seq(i)>seq(i-1))
      {
        d(i) = d(i-1)+1
      }

    }
    // получаем наибольшее значение в массиве длинн последовательностей
    d.indexOf(d.max) - d.max + 1
  }

  def get(seq:Seq[Int] , i:Int , d:ArrayBuffer[Int] , j:Int): ArrayBuffer[Int] = {

    if (j == i) d
    else {
      if (seq(j) < seq(i)) {
        d(i) = scala.math.max(d(i), 1 + d(j))
      }
      get(seq, i, d, j + 1)
    }
  }

  @tailrec
  final def get_ind_rec(seq:Seq[Int]  ,d:ArrayBuffer[Int] , i:Int):Int =
  {
    if(i==seq.length)  d.indexOf(d.max) - d.max + 1
    else
    {
      if(seq(i)>seq(i-1))
      {
        d(i) = d(i-1)+1
      }
      get_ind_rec(seq ,d , i+1)
    }
  }
}
