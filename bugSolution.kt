fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    val numbers = mutableListOf(1, 2, 3, 4, 5)
    numbers.removeAll { it == 3 }
    println(numbers)

    //Alternative solution using an iterator
    val numbers2 = mutableListOf(1, 2, 3, 4, 5)
    val iterator = numbers2.iterator()
    while (iterator.hasNext()) {
        val number = iterator.next()
        if (number == 3) {
            iterator.remove()
        }
    }
    println(numbers2)
} 