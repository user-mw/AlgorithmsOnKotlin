package com.workout.algorithmsonkotlin.algorithms

class SelectionSorter {

    fun <T : Comparable<T>> performSorting(array: Array<T>) {
        for(step in 0 until array.size - 1) {
            var minIndex = step

            for(inStep in step + 1 until array.size) {
                minIndex = if(array[minIndex] > array[inStep]) inStep else minIndex
            }

            if(minIndex != step) {
                val temp = array[step]
                array[step] = array[minIndex]
                array[minIndex] = temp
            }
        }
    }
}