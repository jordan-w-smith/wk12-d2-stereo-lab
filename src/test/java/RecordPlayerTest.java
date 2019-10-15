import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordPlayerTest {

    RecordPlayer recordPlayer;

    @Before
    public void before() {
        recordPlayer = new RecordPlayer("Pioneer", "5000", 45);
    }

    @Test
    public void canGetMake() {
        assertEquals("Pioneer", recordPlayer.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("5000", recordPlayer.getModel());
    }

    @Test
    public void canPlay() {
        assertEquals("Record Playing", recordPlayer.play());
    }

    @Test
    public void canGetPlaySpeed() {
        assertEquals(45, recordPlayer.getPlaySpeed());
    }

}
