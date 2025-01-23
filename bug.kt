fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    val numbers = mutableListOf(1,2,3,4,5)
    for (number in numbers) {
        if (number == 3) {
            numbers.remove(number)
        }
    }
    println(numbers)
}