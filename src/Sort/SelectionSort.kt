package Sort

class SelectionSort {

    /*
    Шаги алгоритма:
1) находим номер минимального значения в текущем списке
2)производим обмен этого значения со значением первой неотсортированной позиции
3)(обмен не нужен, если минимальный элемент уже находится на данной позиции)
теперь сортируем хвост списка, исключив из рассмотрения уже отсортированные элементы

     */
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
