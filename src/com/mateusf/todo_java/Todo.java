package com.mateusf.todo_java;

public class Todo {
  private String title;
  private String description;
  private boolean done;

  public Todo(String title, String description) {
    setTitle(title);
    setDescription(description);
    setDone(false);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public void toggleDone() {
    setDone(!isDone());
  }
}
