package example.Set

/**
  * Created by kasiarakos on 26/11/2016.
  */
object SetMain {
  def main(args: Array[String]): Unit = {
    val frameworks = Set("Lift", "Akka", "PlayFramework", "Scalaz")
    println (frameworks contains "Akka")
    val subSet = frameworks filter( p => p=="Akka")
    println(subSet)

    val artists = List(Artist("Pink Floyd", "Rock"),
      Artist("Led Zeppelin", "Rock"),
      Artist("Michael Jackson", "Pop"),
      Artist("Above & Beyond", "trance")
    )

    for(Artist(name, genre) <- artists; if(genre == "Rock"))
      yield name

  }
}


case class Artist(name: String, genre: String)