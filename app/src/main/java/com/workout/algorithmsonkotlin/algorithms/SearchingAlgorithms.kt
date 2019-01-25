package com.workout.algorithmsonkotlin.algorithms

class SearchingAlgorithms {
    fun linearSearch(array: Array<Int>, valueToFind: Int) = array.indexOf(valueToFind)

    fun binarySearch(array: Array<Int>, valueToFind: Int): Int {
        var lowIndex = 0
        var highIndex = array.size

        while (lowIndex < highIndex) {
            val middleIndex = (lowIndex + highIndex) / 2

            when {
                array[middleIndex] < valueToFind -> lowIndex = middleIndex + 1
                array[middleIndex] > valueToFind -> highIndex = middleIndex
                else -> return middleIndex
            }
        }

        return -1
    }

    fun binarySearchRecursive(array: Array<Int>, valueToFind: Int, lowIndex: Int, highIndex: Int): Int =
            if (lowIndex < highIndex) {
                val middleIndex = (lowIndex + highIndex) / 2

                when {
                    array[middleIndex] < valueToFind -> binarySearchRecursive(array, valueToFind, middleIndex + 1, highIndex)
                    array[middleIndex] > valueToFind -> binarySearchRecursive(array, valueToFind, lowIndex, middleIndex);
                    else -> middleIndex
                }

            } else {
                -1
            }
}