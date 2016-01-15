package diamond

object Diamond {

  val ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  def main(args: Array[String]) = {


  }

  def mirrorLetters(char: Char): String = {
    val part = ALPHABET.substring(0, ALPHABET.indexOf(char) + 1)
    part + part.reverse.substring(1)
  }

  def lineToPrint(char: Char, indent: Int): String = {
    (" " * indent) + char + (" " * (char - 'A' - 1)) + (if (char > 'A') char else "")
  }

}
