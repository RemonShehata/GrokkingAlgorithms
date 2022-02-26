package `02_selection_sort`

fun selectionSort(unsortedArray: ArrayList<Int>): ArrayList<Int> {
    val sortedArray = arrayListOf<Int>()
    for (i in 0 until unsortedArray.size) {
        val smallest = getSmallest(unsortedArray)
        sortedArray.add(smallest)
        unsortedArray.remove(smallest)
    }


    return sortedArray
}

private fun getSmallest(arrayList: ArrayList<Int>): Int {
    var smallest = arrayList[0]

    arrayList.forEach {
        if (it < smallest)
            smallest = it
    }

    return smallest
}

fun main() {
    val unsortedArray = arrayListOf<Int>(5, 1, 3, 2, 7, 9)
    val sortedArray = selectionSort(unsortedArray)
    println(sortedArray.toString())
}