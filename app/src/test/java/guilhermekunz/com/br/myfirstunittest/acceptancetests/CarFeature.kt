package guilhermekunz.com.br.myfirstunittest.acceptancetests

import guilhermekunz.com.br.myfirstunittest.Car
import junit.framework.Assert.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Test


class CarFeature {

    private val engine = Engine()
    private val car = Car(6.0, engine)

    @Test
    fun carIsLoosingFuelWhenItTurnsOn() {
        car.turnOn()
        assertEquals(5.5, car.fuel)
    }

    @Test
    fun carIsTurningOnItsEngineAndIncreasesTheTemperature() {
        car.turnOn()
        assertEquals(95, car.engine.temperature)
        assertTrue(car.engine.isTurnedOn)
    }

}