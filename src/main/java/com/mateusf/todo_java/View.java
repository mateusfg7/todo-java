package com.mateusf.todo_java;

import java.util.Scanner;

public class View {
  Scanner scanner = new Scanner(System.in);
  TodoList todoList;

  public View(TodoList todoList) {
    this.todoList = todoList;
  }

  private void cleanScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public int mainMenu() {
    cleanScreen();

    System.out.println("***** Todo List *****");
    System.out.println("*                   *");
    System.out.println("*  [1] Add Todo     *");
    System.out.println("*  [2] List Todo    *");
    System.out.println("*  [3] Toggle Todo  *");
    System.out.println("*  [4] Exit         *");
    System.out.println("*                   *");
    System.out.println("*********************");

    System.out.print("~> ");
    String option = scanner.nextLine();

    return Integer.parseInt(option);
  }

  public void newTodo(TodoList todoList) {
    cleanScreen();

    System.out.println("***** Add todo *****");

    System.out.print("\nEnter to-do title: ");
    String todoTitle = scanner.nextLine();

    System.out.print("Enter to-do description: ");
    String todoDescription = scanner.nextLine();

    todoList.add(new Todo(todoTitle, todoDescription));

    System.out.println("");

    todoList.list();

    System.out.print("\nPress enter to continue...");
    scanner.nextLine();
  }

  public void listTodos(TodoList todoList) {
    cleanScreen();
    System.out.println("***** Todo List *****\n");
    if (todoList.count() == 0) {
      System.out.println("   No todos found.");
    } else {
      todoList.list();
    }

    System.out.print("\nPress enter to continue...");
    scanner.nextLine();
  }
}
