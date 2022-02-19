//task4

fun main() {
    val myName:String = "Marah Kinana Ibrahim"
    println(myName.uppercase())
    println(myName.lowercase())
    println(myName[6])
    println(myName[13])
    println(myName.length)
    println(myName.replace('M','@'))
    val familyName:String = "Asafadi"
    val fullName:String = myName + " " + familyName
    println(fullName)
    if(myName.equals("")){
        println("it's empty")
    }
    else{
        println(myName)
    }
    println(myName.compareTo(fullName))
    println(familyName.uppercase())
}