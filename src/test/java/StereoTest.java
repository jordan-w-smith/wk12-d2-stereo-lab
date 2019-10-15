import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;

    @Before
    public void before() {
        stereo = new Stereo("Amp", 0);
    }

    @Test
    public void canTurnUpVolume() {
        stereo.turnUpVolume();
        assertEquals(1, stereo.getVolume());
    }

    @Test
    public void canPlayCd() {
        assertEquals("CD Playing", stereo.playCd());
    }


}
