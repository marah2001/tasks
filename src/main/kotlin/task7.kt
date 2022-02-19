//task7
fun main() {
    println("Insert  value ")
    val userValue: Double = readln()!!.toDouble()
  val res:Double = userValue%2
    if(res == 0.0){
        println("it's double")
    }
    else if(res != 0.0){
         println("it's  odd number")
    }
    else{
        println("else....")
    }


}