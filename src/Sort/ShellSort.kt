package Sort

class ShellSort {
    fun exec(array: Array<Int>):Array<Int> {
        var gap = 1
        while (gap < array.size / 3) {
            gap = 3 * gap + 1
        }
        while (gap >= 1) {
            for (i in gap until array.size) {
                var j = i
                while (j >= gap && array[j] < array[j - gap]) {
                    val temp = array[j]
                    array[j - gap] = array[j]
                    array[j] = temp
                    j -= gap
                }
            }
            gap /= 3
        }
        return array
    }
}