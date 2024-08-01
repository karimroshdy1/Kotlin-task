class ComplexNumbers(real:Double, imaginary: Double) {
	var real:Double = real
	var imaginary:Double = imaginary
	operator fun plus(secondnumber: ComplexNumbers): ComplexNumbers {
		val out = ComplexNumbers(real + secondnumber.real, imaginary + secondnumber.imaginary)
		return out;
	}
	override fun toString() : String{
		return "ComplexNumbers{real:$real,imaginary:$imaginary}"
	}
}