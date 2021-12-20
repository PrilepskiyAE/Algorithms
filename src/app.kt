import Sort.BubbleSort

fun main() {
    val array=arrayOf(34,343,65,43,12,5,78)
    //test Bubble
    val b:BubbleSort= BubbleSort()
    val array2=b.exec(array)
    for (i in array2) println(i)

}