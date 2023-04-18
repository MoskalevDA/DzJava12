import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodosTest {

    @Test
    public void shouldAddThreeTasksOfDifferentType() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = { "Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложений",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = { simpleTask, epic, meeting};
        Task[] actual = todos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchEpicAndSimpleTaskTrue() {
        SimpleTask simpleTask = new SimpleTask(7, "www");

        String[] subtasks = { "qqq", "www", "eee"};
        Epic epic = new Epic(44, subtasks);

        Meeting meeting = new Meeting(
                33,
                "rrr",
                "ttt",
                "yyy"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {simpleTask, epic};
        Task[] actual = todos.search("www") ;

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldSearchEpicTrue() {
        SimpleTask simpleTask = new SimpleTask(7, "www");

        String[] subtasks = { "qqq", "www", "eee"};
        Epic epic = new Epic(44, subtasks);

        Meeting meeting = new Meeting(
                33,
                "rrr",
                "ttt",
                "yyy"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {epic};
        Task[] actual = todos.search("qqq") ;

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldSearchFalse() {
        SimpleTask simpleTask = new SimpleTask(7, "www");

        String[] subtasks = { "qqq", "www", "eee"};
        Epic epic = new Epic(44, subtasks);

        Meeting meeting = new Meeting(
                33,
                "rrr",
                "ttt",
                "yyy"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {};
        Task[] actual = todos.search("NNn") ;

        Assertions.assertArrayEquals(expected, actual);


    }

}
