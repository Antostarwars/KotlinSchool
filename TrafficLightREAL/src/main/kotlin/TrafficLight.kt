enum class TrafficLightType {
    ITALIAN,
    INTERNATIONAL,
}

enum class TrafficLightStatus {
    GREEN,
    YELLOW,
    RED,
}

class TrafficLight(val type: TrafficLightType) {

    var currentStatus = TrafficLightStatus.RED
        private set


    fun changeStatus() {
        when (type) {
            TrafficLightType.ITALIAN -> italianTrafficLight()
            TrafficLightType.INTERNATIONAL -> internationalTrafficLight()
        }
    }

    private fun italianTrafficLight() {
        currentStatus = when(currentStatus) {
            TrafficLightStatus.RED -> TrafficLightStatus.GREEN
            TrafficLightStatus.YELLOW -> TrafficLightStatus.RED
            TrafficLightStatus.GREEN -> TrafficLightStatus.YELLOW
        }
    }

    private fun internationalTrafficLight() {
        var previousColor = currentStatus
        currentStatus = when(currentStatus) {
            TrafficLightStatus.RED -> TrafficLightStatus.YELLOW
            TrafficLightStatus.YELLOW ->
                if (previousColor == TrafficLightStatus.RED) { TrafficLightStatus.GREEN } else { TrafficLightStatus.RED }
            TrafficLightStatus.GREEN -> TrafficLightStatus.RED
        }
    }

}