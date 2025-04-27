package com.example.subject_two

class AssignmentFunctions {
    fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 1.8 + 32
    }

    fun rectanglePerimeter(width: Double, height: Double): Double {
        return 2 * (width + height)
    }

    fun factorial(number: Int): Long {
        var result: Long = 1
        for (i in 1..number) {
            result *= i
        }
        return result
    }

    fun countLetterA(word: String): Int {
        return word.count { it == 'a' || it == 'A' }
    }

    fun sumOfInteriorAngles(sideCount: Int): Int {
        return (sideCount - 2) * 180
    }

    fun calculateSalary(dayCount: Int): Int {
        val totalHours = dayCount * 8
        val overtimeHours = if (totalHours > 160) totalHours - 160 else 0
        val regularHours = totalHours - overtimeHours
        return (regularHours * 10) + (overtimeHours * 20)
    }

    fun calculateFee(quota: Int): Int {
        return if (quota <= 50) 100 else 100 + (quota - 50) * 4
    }
}