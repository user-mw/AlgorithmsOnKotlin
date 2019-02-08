package com.workout.algorithmsonkotlin.algorithms

class InsertionSorter {

    fun performSorting(array: Array<Int>) {
        for(step in 1 until array.size) {
            val current = array[step]
            var checkingIndex = step

            while(checkingIndex > 0 && array[checkingIndex - 1] > current) {
                array[checkingIndex] = array[checkingIndex - 1]
                checkingIndex--
            }

            array[checkingIndex] = current
        }
    }

    fun <T : Comparable<T>> performSortingForAll(array: Array<T>) {
        for(step in 1 until array.size) {
            val current = array[step]
            var checkingIndex = step

            while(checkingIndex > 0 && array[checkingIndex - 1] > current) {
                array[checkingIndex] = array[checkingIndex - 1]
                checkingIndex--
            }

            array[checkingIndex] = current
        }
    }
}