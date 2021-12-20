import Sort.BubbleSort
import Sort.SelectionSort

fun main() {
    val array=arrayOf(34,343,65,43,12,5,78,-6,7,0)
    //test BubbleSort
    println("test BubbleSort")
    val bubbleSort:BubbleSort= BubbleSort()
    val array2=bubbleSort.exec(array)
    for (i in array2) print(" $i ")
    println()
    //test SelectionSort
    println("test SelectionSort")
    val selectionSort:SelectionSort= SelectionSort()
    val array3=selectionSort.exec(array)
    for (i in array3) print(" $i ")
    println()


}