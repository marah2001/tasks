//task7
fun main() {
    println("Insert  value ")
    val userValue: Int = readln()!!.toInt()

    if(userValue > 0){
        println("it's positive number")
    }
    else if(userValue < 0){
         println("it's  negative number")
    }
    else{
        println("else....")
    }


}