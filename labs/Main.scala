package labs
import org.scalatest._
import labs.lab5.{get_ind, get_ind_rec, get_stack, get_stack_rec}

import scala.collection.mutable.{ArrayBuffer, Stack}

object main {
  def main(args: Array[String]): Unit = {
    //Testing
    val s = Stack[Int]()
    s.push(5 , 2 , 3 , 4 ,0)

    val stack_clone = s.clone()
    val sec = get_stack_rec(stack_clone)
    println(sec)

    val sec_ = get_stack(s)
    println(sec_)

    val seq = Seq(5 , 6  , 1 , 2 , 3 , 4 )
    val d = ArrayBuffer.fill(seq.length)(1)
    val a = get_ind_rec(seq , d , 1)
    println(a)
    val b = get_ind(seq)
    println(b)

    //call function for 1st part of the 2nd lab
    val l = List(1, 2, 4, 5, 8, 13, 27, 55)
    val f = Lab6.rev(l)
    println(f)

    //2nd part
    val min = Lab6.find_min(l)
    println(min)

    //3rd part
    val fin =Lab6.remove_from(l)
    println(fin)

  }
}
