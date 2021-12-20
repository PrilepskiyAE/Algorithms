package Sort

class InsertionSort {
    /*
    Сортировка вставками (Insertion Sort) — это простой алгоритм сортировки. Суть его заключается в том что,
    на каждом шаге алгоритма мы берем один из элементов массива, находим позицию для вставки и вставляем.
    Стоит отметить что массив из 1-го элемента считается отсортированным.

     */
    //временная сложность O(n^2)(Квадратичная сложность)
    fun exec(array: Array<Int>):Array<Int> {
        for (partIndex in 1 until array.size) {
            val curUnsorted = array[partIndex]
            var i = 0
            i = partIndex
            while (i > 0 && array[i - 1] > curUnsorted) {
                array[i] = array[i - 1]
                i--
            }
            array[i] = curUnsorted
        }
        return array
    }
}