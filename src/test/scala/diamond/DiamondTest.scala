package diamond

import Diamond._

class DiamondTest extends org.scalatest.FlatSpec {

  "mirrorLetters" should "return a single-character string as itself" in {
    assert(Diamond.mirrorLetters('A') == "A")
  }

  it should "mirror a longer string" in {
    assert(mirrorLetters('C') == "ABCBA")
    assert(mirrorLetters('D') == "ABCDCBA")
    assert(mirrorLetters('O') == "ABCDEFGHIJKLMNONMLKJIHGFEDCBA")
  }

  "lineToPrint" should "return the correct indent" in {
    assert(lineToPrint('A', 0) == "A")
    assert(lineToPrint('A', 1) == " A")
  }

  it should "return a line with the correct space between letters" in {
    assert(lineToPrint('B', 0) == "B B")
    assert(lineToPrint('C', 0) == "C  C")
    assert(lineToPrint('Z', 0) == "Z                         Z")
  }
}
