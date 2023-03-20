import org.junit.jupiter.api.*

internal class TrafficLightTest {

    @Test
    fun whenTypeIsItalianAndIsRed() {
        val trafficLight = TrafficLight(TrafficLightType.ITALIAN)
        trafficLight.changeStatus()
        val expected = TrafficLightStatus.GREEN
        Assertions.assertEquals(expected, trafficLight.currentStatus)
    }
    @Test
    fun whenTypeIsItalianAndIsGreen() {
        val trafficLight = TrafficLight(TrafficLightType.ITALIAN)
        trafficLight.changeStatus()
        trafficLight.changeStatus()
        val expected = TrafficLightStatus.YELLOW
        Assertions.assertEquals(expected, trafficLight.currentStatus)
    }
    @Test
    fun whenTypeIsItalianAndIsYellow() {
        val trafficLight = TrafficLight(TrafficLightType.ITALIAN)
        trafficLight.changeStatus()
        trafficLight.changeStatus()
        trafficLight.changeStatus()
        val expected = TrafficLightStatus.RED
        Assertions.assertEquals(expected, trafficLight.currentStatus)
    }
    @Test
    fun whenTypeIsInternationalAndIsRed() {
        val trafficLight = TrafficLight(TrafficLightType.INTERNATIONAL)
        trafficLight.changeStatus()
        val expected = TrafficLightStatus.YELLOW
        Assertions.assertEquals(expected, trafficLight.currentStatus)
    }
    @Test
    fun whenTypeIsInternationalAndIsYellowPreviousRED() {
        val trafficLight = TrafficLight(TrafficLightType.INTERNATIONAL)
        trafficLight.changeStatus()
        trafficLight.changeStatus()
        val expected = TrafficLightStatus.RED
        Assertions.assertEquals(expected, trafficLight.currentStatus)
    }
    @Test
    fun whenTypeIsInternationalAndIsYellowPreviousGREEN() {
        val trafficLight = TrafficLight(TrafficLightType.INTERNATIONAL)
        trafficLight.changeStatus()
        trafficLight.changeStatus()
        trafficLight.changeStatus()
        trafficLight.changeStatus()
        val expected = TrafficLightStatus.RED
        Assertions.assertEquals(expected, trafficLight.currentStatus)
    }
    @Test
    fun whenTypeIsInternationalAndIsGreen() {
        val trafficLight = TrafficLight(TrafficLightType.INTERNATIONAL)
        trafficLight.changeStatus()
        trafficLight.changeStatus()
        trafficLight.changeStatus()
        trafficLight.changeStatus()
        val expected = TrafficLightStatus.RED
        Assertions.assertEquals(expected, trafficLight.currentStatus)
    }
}