package example.accessors

import scala.text.DocGroup

/**
  * Created by kasiarakos on 23/11/2016.
  */
trait DogMood {
  def greet
}

trait AngryMood extends DogMood {
  abstract override def greet : Unit= {
    println("bark")
    super.greet
  }
}

class Dog extends DogMood {
  override def greet: Unit = println("Dog mood")
}

class AngryDog extends Dog with AngryMood{

}


trait Foo {
  def foo()
}

trait M extends Foo {
  abstract override def foo() {println("M"); super.foo()}
}

class FooImpl1 extends Foo {
  override def foo() {println("Impl")}
}

class FooImpl2 extends FooImpl1 with M

object Main{
  def main(args: Array[String]): Unit = {
    println((new FooImpl2).foo())
    println((new AngryDog).greet)

  }
}


