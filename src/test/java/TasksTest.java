import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TasksTest {

    @Test
    public void shouldMatchesTrue() {
        Meeting meeting = new Meeting(2, "bla", "avc", "ava");

        meeting.matches("bla");

        boolean expected = true;
        boolean actual = meeting.contains("bla");

        Assertions.assertEquals(expected, actual);


    }
}
