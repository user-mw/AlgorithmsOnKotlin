package com.workout.algorithmsonkotlin.algorithms

class BubbleSorter {

    fun performSorting(array: Array<Int>) {
        for(step in array.size - 1 downTo 1) {
            for(inStep in 0 until step) {
                if(array[inStep] > array[inStep + 1]) {
                    val temp = array[inStep]
                    array[inStep] = array[inStep + 1]
                    array[inStep + 1] = temp
                }
            }
        }
    }

    fun <T : Comparable<T>> performSortingForAll(array: Array<T>) {
        for(step in array.size - 1 downTo 1) {
            for(inStep in 0 until step) {
                if(array[inStep] > array[inStep + 1]) {
                    val temp: T = array[inStep]
                    array[inStep] = array[inStep + 1]
                    array[inStep + 1] = temp
                }
            }
        }
    }
}