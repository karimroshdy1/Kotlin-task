//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
var l  = listOf<Int>(1,2,3,4,5,6)
var l2 = arrayListOf("abc","def","ghi","jkl")
//println(SumOfEvenNumber(l))
//one()
//val input = readln()
//var i= input.toInt()
//   numCat(i)

//println(fib().toString())
//println(applyToStrings(l2 ,::uppercase).toString())
//println(evenonly(l))
//collections()
//println(mapLengthToStrings(l2))
//  val  a = Person("karim" , 22)
//   a.displayDetails()
//val b = Vehicle("Toyota " ,"Corolla")
//b.displayInfo()
//val c = Car("Ford" , "Focus" , "Hatchback")
//c.displayInfo()
//val d = Motorcycle("Honda" , "CBR" , 250)
//d.displayInfo()
// var a: String? = null
//println(nullableStringLength(a))
// var m = "mango"
// println(m.countVowels())
//var a =ComplexNumbers(2.0,5.0)
//var b = ComplexNumbers(7.0,10.0)
//var c = a+b
//    print(c)
}



fun one(){
   var a : Int = 1
   var b = true
   var c = 1.0
   var d = "any"
    println(b.toString() + " ," + a + ", " + c + ", " + d )

   a = 2
   b = false
   c = 2.5
   d = "anystring"

    println("new values:"+b.toString() + ", " + a + " ," + c + " ," + d )
}
fun SumOfEvenNumber(numbers: List<Int>) : Int{
    var sum = 0
    for(number in numbers){
        if (number % 2 == 0){
          sum +=number
        }
    }

    return sum

}
fun numCat(i:Int){
    if(i>0){
        println("positive")
    }
    else if(i==0){
        println("zero")
    }
    else println("negative")

}
fun fib() :String{
    var out = ArrayList<Int>()
    var first = 0
    var second = 1
    for(i in 1..10){
        out.add(first)
        var next = first + second
        first = second
        second = next
    }
    return out.toString()
}
fun uppercase(s : String): String{
  return s.uppercase()
}
fun applyToStrings(strings: ArrayList<String>, func:  (String) -> String) : List<String>{
    var templist = arrayListOf<String>()
    for (string in strings){
        templist.add(func(string))
        //strings.remove(string)

    }

return templist.toList()
}
fun sayHello(wg:String, wts:String) {
    println("Hello" + wts)
}
val evenonly ={a :List<Int> -> a.filter { number -> number % 2 == 0 } }
fun collections(){
    var l = listOf("apple", "mango", "peach" , "watermellon").filter { i -> i.length>6 }
    var s = setOf(1,2,3,4,5,6,6)
    var m = mapOf(1 to "a", 2 to "b", 3 to "c", 4 to "d")


    println(l)
}
fun mapLengthToStrings( a:List<String>): Map<String, Int>{
  var out =  mutableMapOf <String, Int>()
    for(item in a){
        out.put(item, item.length)
    }
    return out

}
fun nullableStringLength(input:String?): Int{
    return input?.length ?:0
}
fun String.countVowels() : Int {
    var count = 0
   var s =this.toCharArray()
    for(s1 in s){
        when(s1){
            'a' -> count++
            'e' -> count++
            'o' -> count++
            'u' -> count++
            'i' -> count++
            else -> continue

        }

    }
    return count

}
