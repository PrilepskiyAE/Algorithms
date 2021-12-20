package Sort

class BubbleSort {
    //временная сложность O(n^2)(Квадратичная сложность)
     fun exec(array: Array<Int>):Array<Int> {
        for (partIndex in array.size - 1 downTo 1) {
            for (i in 0 until partIndex) {
                if (array[i] > array[i + 1]) {
                    if (i == i+1) continue
                    val temp = array[i]
                    array[i] = array[i+1]
                    array[i+1] = temp
                }

            }
        }
    return array
     }


}