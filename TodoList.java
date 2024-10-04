import java.util.ArrayList;

public class TodoList {
  private ArrayList<Todo> todoList = new ArrayList<Todo>();

  public void add(Todo todo) {
    todoList.add(todo);
  }

  public void list() {
    for (int i = 0; i < todoList.size(); i++) {
      System.out.println(i + 1 + ". " + todoList.get(i).getTitle() + " - " +
          todoList.get(i).isDone());
    }
  }

  public int count() {
    return todoList.size();
  }

  public void toggle(int todoNumber) {
    todoList.get(todoNumber - 1).toggleDone();
  }
}
