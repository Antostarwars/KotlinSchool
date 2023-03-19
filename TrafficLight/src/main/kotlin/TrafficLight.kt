class TrafficLight(val type: TrafficLightType) {
    var currentStatus = TrafficLightStatus.RED
    enum class TrafficLightType {
        ITALIAN,
        INTERNATIONAL,
    }

    enum class TrafficLightStatus {
        GREEN,
        YELLOW,
        RED,
    }

    fun checkType(): TrafficLightType {
        return type
    }

    fun ChangeStatus() {
        when (checkType()) {
            TrafficLightType.ITALIAN -> italianTrafficLight()
            TrafficLightType.INTERNATIONAL -> internationalTrafficLight()
        }
    }

    private fun italianTrafficLight() {
        when (currentStatus) {
            TrafficLightStatus.RED -> currentStatus = TrafficLightStatus.GREEN
            TrafficLightStatus.YELLOW -> currentStatus = TrafficLightStatus.RED
            TrafficLightStatus.GREEN -> currentStatus = TrafficLightStatus.YELLOW
        }
    }

    private fun internationalTrafficLight() {
        when (currentStatus) {
            TrafficLightStatus.RED -> currentStatus = TrafficLightStatus.YELLOW
            TrafficLightStatus.YELLOW -> currentStatus = TrafficLightStatus.GREEN
            TrafficLightStatus.GREEN -> currentStatus = TrafficLightStatus.RED
        }
    }

}