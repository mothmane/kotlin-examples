package ktl.functions

fun main() {

    print()
    print("ms01")
    print("ms01", "ms02")

    println("${sum(3, 4)}")

    println(2 times "Test")

    var jessica = Person("Jessica")
    var john = Person("John")

    var jack = Person("Jack")
    jessica likes john
    jessica likes jack

    println("${jessica.likedPeople}")

    printAll("1", "2", "3", "4", "5")
    printAllWithPrefix("1", "2")
}


// infix function
infix fun Int.times(str: String) = str.repeat(this)


// function with no return type (Explicit)
fun void(): Unit {

}

// single-expression function that returns an integer (inferred).
fun sum(x: Int, y: Int) = x + y

// method with default parameters
fun print(msg1: String = "", msg2: String = "") {
    println("$msg1  $msg2")
}

// infix method in data class
data class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }  // 6
}

// function with varargs
fun printAll(vararg msgs: String) {
    for (msg in msgs) print(msg)
}

// function with vargars as first parameters
fun printAllWithPrefix(vararg msgs: String, prefix: String = "0") {
    for (msg in msgs) print(msg, prefix)
}

// passing varags instead of Array
fun log(vararg msgs: String) {
    printAll(*msgs)
}