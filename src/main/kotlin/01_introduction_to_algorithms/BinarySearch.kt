package `01_introduction_to_algorithms`

fun binarySearch(sortedList: List<Int>, element: Int): Int {
    var startIndex = 0
    var endIndex = sortedList.size - 1
    while (startIndex <= endIndex) {
        val midIndex = (startIndex + endIndex) / 2
        val guess = sortedList[midIndex]
        if (element == guess) return midIndex
        else if (guess > element) endIndex = midIndex - 1
        //guess < element
        else startIndex = midIndex + 1
    }
    return -1
}

fun main() {
    val list: List<Int> = (0..100).toList()
    val result = binarySearch(list, 20)
    println(result)
}
