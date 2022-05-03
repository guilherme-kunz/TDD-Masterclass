package guilhermekunz.com.br.myfirstunittest.unittests

import guilhermekunz.com.br.myfirstunittest.Car
import junit.framework.TestCase.assertEquals
import org.junit.Test

class CarShould {

    private val car = Car(5.0)

    @Test
    fun loosingFuelWhenItTurnsOn() {
        car.turnOn()
        assertEquals(4.5, car.fuel)
    }

}