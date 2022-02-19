//task2
fun main() {
    println("Insert first value ")
    val firstNum: Double = readln()!!.toDouble()
    println("Insert second value ")
    val secondNum: Double = readln()!!.toDouble()
    val summation: Double = firstNum + secondNum
    val subtraction: Double = firstNum - secondNum
    val multiplication: Double = firstNum * secondNum
    val division: Double = firstNum / secondNum
    val remainderOfDivision: Double = secondNum % firstNum
    println("The summation is : $summation ")
    println("The subtraction is : $subtraction ")
    println("The multiplication is : $multiplication ")
    println("The division is : $division ")
    println("The remainder Of Division is : $remainderOfDivision ")


}