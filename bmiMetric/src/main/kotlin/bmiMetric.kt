fun bmiMetric(weightKg: Double, heightM: Double): String {
    require(weightKg > 0) {
        "Weight is below 0"
    }
    require(heightM > 0) {
        "Height is below 0"
    }

    val bmi = weightKg / (heightM * heightM)

    return if (bmi < 18.5) {
        "Underweight"
    } else if (bmi >= 18.5 && bmi < 25.0) {
        "Normalweight"
    } else {
        "Overweight"
    }
}