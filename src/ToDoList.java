import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    private ArrayList<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Задача добавлена: " + task);
    }

    public void displayTasks() {
        System.out.println("Список задач:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Показать задачи");
            System.out.println("3. Выход");

            String choice = scanner.nextLine();
            
            

            switch (choice) {
                case "1":
                    System.out.println("Введите новую задачу:");
                    String newTask = scanner.nextLine();
                    toDoList.addTask(newTask);
                    break;
                case "2":
                    toDoList.displayTasks();
                    break;
                case "3":
                    System.out.println("Программа завершена.");
                    System.exit(0);
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }
}
