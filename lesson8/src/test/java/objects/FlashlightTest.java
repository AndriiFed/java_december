package objects;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FlashlightTest {

    @Test
    public void testInsertBattery() {
        Flashlight flashlight = new Flashlight();

        assertThat(flashlight.getBatteries(), is(0));
        assertThat(flashlight.isShines(), is(false));

        flashlight.insertBattery();

        assertThat(flashlight.getBatteries(), is(1));

        for (int i = 0; i < 10; i++) {
            flashlight.insertBattery();
        }

        assertThat(flashlight.getBatteries(), is(3));
        assertThat(flashlight.isShines(), is(true));
    }
}
