package com.example.subject_two

fun main() {
    val func = AssignmentFunctions();

    println("25 Celsius in Fahrenheit: ${func.celsiusToFahrenheit(25.0)}")
    println("Perimeter of rectangle (5.5, 7): ${func.rectanglePerimeter(5.5, 7.0)}")
    println("10! = ${func.factorial(10)}")
    println("How many a's in 'Android Bootcamp': ${func.countLetterA("Android Kotlin Bootcamp")}")
    println("Sum of interior angles of a Triangles: ${func.sumOfInteriorAngles(3)}")
    println("Salary for 10 working days: ${func.calculateSalary(10)}")
    println("Quota fee for 20 GB: ${func.calculateFee(20)}")
}