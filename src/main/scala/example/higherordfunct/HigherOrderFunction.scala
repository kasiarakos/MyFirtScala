package example.higherordfunct

/**
  * Created by kasiarakos on 26/11/2016.
  */
object HigherOrderFunction {
  def main(args: Array[String]): Unit = {

    val list = List("1","2","3")
    val converted : List[Int] = list.map((f:String) => f.toInt)
    val list2 = List(1,2,3)
    val addedList = list2.map(_+2)
    val addedThree = addedList map addThree
    println(addedThree)
  }

  def addThree(t:Int) ={ t+3}
  def addOne(t:Int)={
    def ++ = (x:Int) => {x + 1}
    ++(t)
  }

}

object foldl {
  def apply[A, B](xs: Traversable[A], defaultValue: B)(op: (B, A) => B) = {
    (defaultValue /: xs) (op)
  }
}


