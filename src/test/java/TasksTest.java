import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TasksTest {

    @Test
    public void shouldMatchesTopicTrue() {
        Meeting meeting = new Meeting(2, "bla", "avc", "ava");

        meeting.matches("bla");

        boolean expected = true;
        boolean actual = meeting.matches("bla");

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldMatchesProjectTrue() {

        Meeting meeting = new Meeting(3, "aaa", "rrr", "11111");


        boolean expected = true;
        boolean actual = meeting.matches("rrr");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldMatchesTopicFalse() {
        Meeting meeting = new Meeting(1, "aaa", "bbb", "ccc");

        boolean expected = false;
        boolean actual = meeting.matches("ggg");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldMatchesProjectFalse() {
        Meeting meeting = new Meeting(1, "qqq", "wwww", "aaaa");

        boolean expected = false;
        boolean actual = meeting.matches("aaaa");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatchesTitleTrue() {
        SimpleTask simpleTask = new SimpleTask(1, "www");

        boolean expected = true;
        boolean actual = simpleTask.matches("www");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatchesTitleFalse() {
        SimpleTask simpleTask = new SimpleTask(1, "jjj");

        boolean expected = false;
        boolean actual = simpleTask.matches("qwe");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatchesEpicTrue() {
        String[] subtasks = { "qsd", "qqq", "fff", "aaa"};
        Epic epic = new Epic(1,subtasks);

        boolean expected = true;
        boolean actual = epic.matches("qqq");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatchesEpicFalse() {
        String[] subtasks = {"jjj", "blabla", "aaa"};
        Epic epic = new Epic(2, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("qafqfd");

        Assertions.assertEquals(expected, actual);
    }
}
