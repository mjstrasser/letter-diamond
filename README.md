# letter-diamond

A simple program that prints out diamond-shaped patterns of letters.

## Usage

Run from this directory using:

    ./go.sh LETTER [LETTER ...]

Where `LETTER` is an upper- or lower-case letter from A to Z. Lower-case letters
are converted to upper-case. Multiple letters can be specified, separated by spaces.

For example:

    ./go.sh C f
      A
     B B
    C   C
     B B
      A
         A
        B B
       C   C
      D     D
     E       E
    F         F
     E       E
      D     D
       C   C
        B B
         A

On unrecognised input the program prints the message `INVALID INPUT`.
  
If the program has not been compiled, SBT will compile and test it first.

## Prerequisites

[Scala](http://www.scala-lang.org/) and [SBT](http://www.scala-sbt.org/) to build.

On Mac, [Homebrew](http://brew.sh/) installs both with:
 
    brew install scala
    brew install sbt

Java is a pre-requisite for Scala (you knew that already, didn’t you).