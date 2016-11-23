package example.linearization

/**
  * Created by kasiarakos on 23/11/2016.
  */
object Main extends App{

  (new CowboyArtist()).draw()

}
trait Drawable {
  def draw() { }
}

trait Cowboy extends Drawable {
  override def draw() { println("Bang!") }
}

trait Artist extends Drawable {
  override def draw() { println("A pretty painting") }
}

// Note: the "with" keyword goes between type names for multiple inheritance
// You can chain on multiple "with X" clauses to mix in more traits. If a
// class is to be part of the extended type, it must be specified _before_
// the first "with X" clause.
class CowboyArtist extends  Artist with Cowboy

