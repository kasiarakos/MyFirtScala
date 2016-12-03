package example.typeparameterization

/**
  * Created by kasiarakos on 26/11/2016.
  */
class TypeParamTest {
  def position[A] (list:List[A], value: A) : Maybe[Int] ={
    val index = list.indexOf(value)
    if(index != -1) Just(index) else Nil
  }
}

sealed abstract class Maybe[+A]{
  def isEmpty: Boolean
  def get: A
  def getOrElse[B >: A](default: B): B = {
    if(isEmpty) default else get
  }
}

final case class Just[A](value: A) extends Maybe[A]{
  override def isEmpty: Boolean = false
  override def get = value
}

case object Nil extends Maybe[Nothing]{
  override def isEmpty: Boolean = true

  override def get = throw new NoSuchElementException("nil.get")
}

object MainParType{
  def main(args: Array[String]): Unit = {
    val typePar = new TypeParamTest
    val list = List("one", "two", "three")
    val postition = typePar.position(list, "four")
    println("position: "+postition)
  }
}


