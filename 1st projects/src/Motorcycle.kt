class Motorcycle(make:String , model:String , topSpeed: Int) :Vehicle(make, model) {
	var topSpeed = topSpeed
	override fun displayInfo() {
		println( "make:$make model:$model Top-Speed:$topSpeed")
	}

}