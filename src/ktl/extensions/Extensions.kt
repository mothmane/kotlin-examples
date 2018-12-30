package ktl.extensions


// instead of StringUtils
fun String.upperCaseFirstLetter(): String {
    return this.substring(0, 1).toUpperCase().plus(this.substring(1))
}

// How to call extension function

fun main() {

    println("roujoula".upperCaseFirstLetter())

    // isn't it better than this
    println(StringUtils.javaUpperCaseFirstLetter("roujoula"))
}