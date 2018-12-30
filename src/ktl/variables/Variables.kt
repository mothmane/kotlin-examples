package ktl.variables

fun main() {

    var a: String = "string Value"

    var b = "another string value"
    println("has a an inferred type of String  ?  ${b is String}")

    var c: Double = 1.3
    var d=3.14.toInt();

    println("has d (${d}) an inferred type of Int  ?  ${d is Int}")


    // initialisation
    var e:String
    if(true){
        e="first value"
    }else{
        e="another value"
    }
    println(e)

    handleNulls(null)
    handleNulls("message")

}

fun handleNulls(s:String?){
   // println("${s.length}")
    if(s!=null){
        println("the lenght of the string is ${s.length}")
    }


}