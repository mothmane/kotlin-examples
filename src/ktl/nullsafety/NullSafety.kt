package ktl.nullsafety

fun main(){

    var neverNull:String
    //neverNull=null
    //println("$neverNull")


    var neverNullInferredType="this is the value"
    //neverNullInferredType=null

    var canBeNull: String?
    canBeNull=null
    print("$canBeNull")


}

