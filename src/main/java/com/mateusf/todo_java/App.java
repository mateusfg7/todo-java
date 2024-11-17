package com.mateusf.todo_java;

import java.util.Scanner;

public class App {
    static TodoList todoList = new TodoList();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            int option = mainMenu();

            switch (option) {
                case 1:
                    newTodo(scanner);
                    break;
                case 2:
                    listTodos();
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

    private static void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static int mainMenu() {
        cleanScreen();

        System.out.println("***** Todo List *****");
        System.out.println("*                   *");
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

    private static void newTodo(Scanner scanner) {
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

    private static void listTodos() {
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
