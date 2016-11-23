package example.kasicase

/**
  * Created by kasiarakos on 23/11/2016.
  */
object Main{
  def main(args: Array[String]): Unit = {
    val person = Person("Dimitris","Kasiaras")
    person match {
      case Person("Dimitris","Kasiaras") => println(">>>> " + "Dimitris" + ", " + "Kasiaras")
    }
  }

}
