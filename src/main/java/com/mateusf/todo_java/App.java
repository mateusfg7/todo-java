package com.mateusf.todo_java;

import java.util.Scanner;

public class App {
    static TodoList todoList = new TodoList();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        View view = new View(todoList);

        while (true) {
            int option = view.mainMenu();

            switch (option) {
                case 1:
                    view.newTodo(todoList);
                    break;
                case 2:
                    view.listTodos(todoList);
                    break;
                case 3:
                    System.out.print("Enter the todo number: ");
                    int todoNumber = scanner.nextInt();
                    todoList.toggle(todoNumber);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

    }
}
