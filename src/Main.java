import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManage taskManage = new TaskManage();

        while (true) {
            System.out.println("Welcome to your Task Manager!");
            System.out.println("You have: " + taskManage.getTasksInProgressNum() + " tasks in progress;");
            System.out.println("You completed: " + taskManage.getTasksDoneNum() + " tasks;");
            System.out.println("""
                    Choose operation:
                    1. Add a new task
                    2. Show all tasks in progress
                    3. Show all completed tasks
                    4. Exit
                    """);

            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    taskManage.addTask();
                    break;
                case 2:
                    taskManage.showTasksInProgress();
                    break;
                case 3:
                    taskManage.showTasksDone();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}