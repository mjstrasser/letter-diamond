package diamond

object Diamond {

  def mirrorLetters(char: Char) = ('A' to char) ++ ('A' until char).reverse

  def lineToPrint(char: Char, indent: Int) = (" " * indent) + char +
    (if (char > 'A') (" " * ((char - 'A') * 2 - 1)) + char else "")

  def printDiamond(char: Char) = mirrorLetters(char).foreach(c => println(lineToPrint(c, char - c)))

  def main(args: Array[String]) = {

    val SingleChar = "([A-Za-z])".r
    args.foreach {
      case SingleChar(charString) => printDiamond(charString.toUpperCase.head)
      case _ => println("INVALID INPUT")
    }

  }

}
