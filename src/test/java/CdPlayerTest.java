import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CdPlayerTest {

    CdPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CdPlayer("Alba", "Poop", "Back in Black");
    }

    @Test
    public void canGetMake() {
        assertEquals("Alba", cdPlayer.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Poop", cdPlayer.getModel());
    }

    @Test
    public void canGetCurrentTrack() {
        assertEquals("Back in Black", cdPlayer.getCurrentTrackName());
    }

//    @Test
//    public void canSkip() {
//        assertEquals("Next Track");
//    }
}
