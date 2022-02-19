//task5

fun main() {
    println("Enter your name in capital letters")
    val userName: String = readln()!!.toString()
    println("Enter your parent name in small letters")
    val parentName: String = readln()!!.toString()
    println("Enter your grand dad name in capital letters")
    val grandName: String = readln()!!.toString()
    println("Enter your family name in capital letters")
    val familyName: String = readln()!!.toString()
   println(userName.lowercase())
    println(parentName[0].uppercase())
    println(grandName[grandName.length-1].lowercase())
    println(familyName.lowercase())


}