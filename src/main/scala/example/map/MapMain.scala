package example.map

/**
  * Created by kasiarakos on 26/11/2016.
  */
object MapMain {

  def main(args: Array[String]): Unit = {
    val artists = Map(
      "Pink Floyd" -> "Rock", "Led Zeppelin" -> "Rock",
      "Michael Jackson" -> "Pop", "Above & Beyond" -> "Trance")

    val filart = artists filter ( p => p._2 == "Rock")
    println(filart)



  }

}
