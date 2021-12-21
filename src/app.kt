import Sort.BubbleSort
import Sort.InsertionSort
import Sort.SelectionSort
import Sort.ShellSort
import kotlin.random.Random

fun main() {
    //val array=arrayOf(34,343,65,43,12,5,78,-6,7,0)
    val array=Array<Int>(30,{ Random.nextInt(0, 100)})
    println("base array")
    for (i in array) print(" $i ")
    println()

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


    //test InsertionSort
    println("test InsertionSort")
    val insertionSort: InsertionSort = InsertionSort()
    val array4=insertionSort.exec(array)
    for (i in array4) print(" $i ")
    println()


    //test ShellSort
    println("test ShellSort")
    val ShellSort: ShellSort = ShellSort()
    val array5=insertionSort.exec(array)
    for (i in array5) print(" $i ")
    println()


}