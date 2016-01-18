package diamond

import Diamond._

class DiamondTest extends org.scalatest.FlatSpec {

  "mirrorLetters" should "return only A for A" in {
    assert(Diamond.mirrorLetters('A') == Seq('A'))
  }

  it should "mirror other letters around the specified one" in {
    assert(mirrorLetters('B') == Seq('A', 'B', 'A'))
    assert(mirrorLetters('C') == Seq('A', 'B', 'C', 'B', 'A'))
    assert(mirrorLetters('F') == Seq('A', 'B', 'C', 'D', 'E', 'F', 'E', 'D', 'C', 'B', 'A'))
  }

  "diamondLine" should "return only A for A" in {
    assert(diamondLine('A') == "A")
  }

  it should "return the correct space between letters for B to Z" in {
    assert(diamondLine('B') == "B B")
    assert(diamondLine('C') == "C   C")
    assert(diamondLine('F') == "F         F")
    assert(diamondLine('Z') == "Z                                                 Z")
  }
}
