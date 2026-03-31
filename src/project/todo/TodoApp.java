package project.todo;

import java.util.Scanner;

public class TodoApp {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        TodoService service = new TodoService();

        while (true) {
            System.out.println("\n--- TODO ---");
            System.out.println("1 - список задач");
            System.out.println("2 - добавить задачу");
            System.out.println("3 - удалить задачу");
            System.out.println("4 - отметить как выполненную");
            System.out.println("0 - выход");


            String cmd = console.nextLine();

            switch (cmd) {

                case "1": {
                    if (service.isEmpty()) {
                        System.out.println("Список пуст");
                        break;
                    }

                    int i = 1;
                    for (Task t : service.getTasks()) {
                        System.out.print(i + ". ");
                        t.print();
                        i++;
                    }
                    break;
                }

                case "2": {
                    System.out.println("Введите задачу:");
                    String title = console.nextLine();
                    service.addTask(title);
                    break;
                }

                case "3": {
                    System.out.println("Номер задачи:");

                    int index = Integer.parseInt(console.nextLine()) - 1;

                    if (index < 0 || index >= service.size()) {
                        System.out.println("Неверный индекс");
                        break;
                    }

                    service.removeTask(index);
                    System.out.println("Задача удалена");
                    break;
                }

                case "4": {
                    System.out.println("Номер задачи:");
                    int index = Integer.parseInt(console.nextLine()) - 1;

                    if (index < 0 || index >= service.size()) {
                        System.out.println("Неверный номер задачи. Попробуйте ещё раз.");
                        break;
                    }

                    service.markDone(index);
                    System.out.println("Задача отмечена");
                    break;

                }

                case "0":
                    return;
            }
        }
    }
}