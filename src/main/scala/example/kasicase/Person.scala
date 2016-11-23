package example.kasicase

/**
  * Created by kasiarakos on 23/11/2016.
  *
  * Scala prefixes all the parameters with val, and that will make them public value.
  * But remember that you still never access the value directly; you always access
  * through accessors. (you can Change to var for mutators)
  *
  * Both equals and hashCode are implemented for you based on the given parameters.
  *
  * The compiler implements the toString method that returns the class name and its parameters.
  *
  * Every case class has a method named copy that allows you to easily create a modified copy
  * of the class’s instance.
  *
  * A companion object is created with the appropriate apply method, which takes
  * the same arguments as declared in the class.
  *
  * The compiler adds a method called unapply , which allows the class name to be
  * used as an extractor for pattern matching.
  *
  * A default implementation is provided for serialization:
  */



case class Person (firstName:String, lastName:String){



}
