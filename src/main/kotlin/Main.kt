//task3
/*
* Area of  rectangle = length (l) x width (h)
* Area of  triangle = ½ x base x height
* Area of  circle = π × m²
* Circumference = 2 × π × m²
* */
fun main() {
    println("Insert the length of rectangle ")
    val rectangleLength: Double = readln()!!.toDouble()
    println("Insert the width of rectangle ")
    val rectangleWidth: Double = readln()!!.toDouble()
    val rectangleArea: Double = rectangleLength * rectangleWidth
    println("The rectangle area's is : $rectangleArea ")


}