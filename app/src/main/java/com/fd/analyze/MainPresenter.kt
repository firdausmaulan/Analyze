package com.fd.analyze

class MainPresenter {

    companion object {
        const val IDEAL = "Ideal"
        const val NOT_IDEAL = "Not Ideal"
        const val DEDUCTION = 110
        const val TOLERANT = 5
    }

    fun calculateBMI(height: Int, weight: Int): String {
        val result = height - DEDUCTION
        return if (weight >= result - TOLERANT && weight <= result + TOLERANT) {
            IDEAL
        } else {
            NOT_IDEAL
        }
    }
}