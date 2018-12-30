package ktl.generics

fun main() {

    var stack = mutableStackOf("1","2","3")
    println(stack)
}

class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(e: E) = elements.add(e)

    // explicit generic return
    fun peek():E = elements.last()

    fun pop() = elements.removeAt(elements.lastIndex)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun <E> mutableStackOf(vararg items:E)=MutableStack<E>(*items)