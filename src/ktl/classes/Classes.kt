package ktl.classes


fun main() {
    var person = Person()
    var student = Student(1, "Hafid")


    println(" student ${student.id} ${student.name}")

    student.name = "Samir"
    println(" student ${student.id} ${student.name}")
}

class Person

class Student(val id: Int?, var name: String)