package diamond

import Diamond._

class DiamondTest extends org.scalatest.FlatSpec {

  "mirrorLetters" should "return a single-character string as itself" in {
    assert(Diamond.mirrorLetters('A') == Seq('A'))
  }

  it should "mirror a longer string" in {
    assert(mirrorLetters('C') == Seq('A', 'B', 'C', 'B', 'A'))
    assert(mirrorLetters('F') == Seq('A', 'B', 'C', 'D', 'E', 'F', 'E', 'D', 'C', 'B', 'A'))
  }

  "lineToPrint" should "return the correct indent" in {
    assert(lineToPrint('A', 0) == "A")
    assert(lineToPrint('A', 1) == " A")
    assert(lineToPrint('B', 4) == "    B B")
  }

  it should "return a line with the correct space between letters" in {
    assert(lineToPrint('B', 0) == "B B")
    assert(lineToPrint('C', 0) == "C   C")
    assert(lineToPrint('F', 0) == "F         F")
  }
}
