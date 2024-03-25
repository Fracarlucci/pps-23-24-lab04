package tasks.adts

package u04lab

/*  Exercise 1: 
 *  Complete the implementation of ComplexADT trait below, so that it passes
 *  the test in ComplexTest.
 */

object Ex1ComplexNumbers:

  trait ComplexADT:
    type Complex
    def complex(re: Double, im: Double): Complex
    extension (complex: Complex)
      def re(): Double
      def im(): Double
      def sum(other: Complex): Complex
      def subtract(other: Complex): Complex
      def asString(): String

  object BasicComplexADT extends ComplexADT:

    // Change assignment below: should probably define a case class and use it?

    case class ComplexImpl(re: Double, im: Double)

    opaque type Complex = ComplexImpl 
    def complex(re: Double, im: Double): Complex = ComplexImpl(re, im)
    extension (complex: Complex)
      def re(): Double = re
      def im(): Double = im
      def sum(other: Complex): Complex = ComplexImpl(re + other.re, im + other.im)
      def subtract(other: Complex): Complex = ComplexImpl(re - other.re, im - other.im)
      def asString(): String = re.toString() + " + " + im.toString() + "i"
