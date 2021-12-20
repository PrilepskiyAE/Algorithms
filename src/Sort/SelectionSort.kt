package Sort

class SelectionSort {
    //     //временная сложность O(n^2)(Квадратичная сложность)
     fun exec(array: Array<Int>):Array<Int> {
        for (partIndex in array.size - 1 downTo 1) {
            var largestAt = 0
            for (i in 1..partIndex) {
                if (array[i] > array[largestAt]) {
                    largestAt = i
                }
            }
            val temp = array[largestAt]
            array[largestAt] = array[partIndex]
            array[partIndex] = temp
        }
        return array
    }
}
