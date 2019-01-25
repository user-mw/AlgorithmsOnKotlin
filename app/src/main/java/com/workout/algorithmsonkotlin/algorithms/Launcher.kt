package com.workout.algorithmsonkotlin.algorithms

import java.util.Arrays.sort

fun main(args: Array<String>) {
    val testingArray = arrayOf(1, 2, 5, 0, 3, 4, 10, 7, 9, 8, 6, 12, 15, 13, 11, 14)

    val finder = SearchingAlgorithms()

    sort(testingArray)

//    val result = finder.binarySearch(testingArray, 7)
    val result = finder.binarySearchRecursive(testingArray, 4, 0, testingArray.size)
    println(result)
}