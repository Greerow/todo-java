package pp.todo;

import java.util.Scanner;

public class  TodoApp {
    public static void main(String[] args) {
        String input;
        Scanner console = new Scanner(System.in);

        String[] tasks = new String[100];
        int taskCount = 0;

        while (true) {
            showMenu();
            input = console.nextLine();

            switch (input) {
                case "1": {
                    System.out.println("Показ задач");


                    if (taskCount == 0) {
                        System.out.println("Список пуст");
                        break;
                    }

                    for (int i = 0; i < taskCount; i++) {
                        System.out.println((i + 1) + ". " + tasks[i]);
                    }

                    break;
                }
                case "2": {
                    System.out.println("Добавление задачи");

                    System.out.println("Введите задачу:");
                    String task = console.nextLine();

                    if (task == null || task.isEmpty()) {
                        System.out.println("Задача не может быть пустой");
                        break;
                    }
                    tasks[taskCount] = task;
                    taskCount++;

                    System.out.println("Задача добавлена");
                    break;
                }
                case "3": {
                    System.out.println("Удаление задачи");
                    input = console.nextLine();
                    int index = Integer.parseInt(input) - 1;
                    if (index < 0 || index >= taskCount) {
                        System.out.println("Неверный индекс");
                        break;
                    }
                    for (int i = index; i < taskCount - 1; i++) {
                        tasks[i] = tasks[i + 1];

                    }
                    taskCount--;
                    System.out.println("Задача удалена");

                    break;
                }
                case "0": {
                    System.out.println("Выход...");
                    return;
                }
                default: {
                    System.out.println("Неверная команда");
                }
            }
        }

    }

    static void showMenu() {
        // печать меню
        System.out.println("1.Показать задачи.");
        System.out.println("2.Добавить задачу.");
        System.out.println("3.Удалить задачу.");
        System.out.println("0.Выход.");
    }


    }



