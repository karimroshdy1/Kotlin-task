class Car(make:String, model:String , bodytype:String) : Vehicle(make, model) {
	val bodytype=bodytype
	override fun displayInfo(){
		println("make:$make   model:$model   bodytype:$bodytype")
	}
}