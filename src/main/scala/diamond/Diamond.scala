package diamond

object Diamond {

  /**
    * Generates a sequence of characters starting at 'A' up to the specified character
    * and back again, for example, A B C D C B A.
    */
  def mirrorLetters(char: Char) = ('A' to char) ++ ('A' until char).reverse

  /**
    * Generates a line to be printed to the console for the specified character, for example
    * "A" or "B B" or "C   C".
    *
    * The number of spaces between letters B–Z is a function of the letter.
    */
  def diamondLine(char: Char) = char + (if (char > 'A') (" " * ((char - 'A') * 2 - 1)) + char else "")

  /**
    * Prints a diamond for the specified letter A to Z.
    */
  def printDiamond(char: Char) = mirrorLetters(char).foreach(c =>
    println((" " * (char - c)) + diamondLine(c))
  )

  def main(args: Array[String]) = {

    val SingleChar = "([A-Za-z])".r
    args.foreach {
      case SingleChar(charString) => printDiamond(charString.toUpperCase.head)
      case _ => println("INVALID INPUT")
    }

  }

}
