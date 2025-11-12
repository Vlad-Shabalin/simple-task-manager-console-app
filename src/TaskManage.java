import java.util.ArrayList;
import java.util.Scanner;

public class TaskManage {
    private int tasksInProgressNum;
    private int tasksDoneNum;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Task> tasks = new ArrayList<>();

    // ---------- Getters ----------
    public int getTasksInProgressNum() {
        return tasksInProgressNum;
    }

    public int getTasksDoneNum() {
        return tasksDoneNum;
    }

    // ---------- Setters ----------
    public void setTasksInProgressNum(int num) {
        this.tasksInProgressNum = num;
    }

    public void setTasksDoneNum(int num) {
        this.tasksDoneNum = num;
    }

    // ---------- Mark a task as done ----------
    public void markTaskAsDone() {
        System.out.println("Type a number of task to mark as done: ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= tasks.size()) {
            Task task = tasks.get(number - 1);
            task.markDone();
            System.out.println("Done: " + task.getTaskName());
        }

        tasksInProgressNum--;
        tasksDoneNum++;
    }

    // ---------- Mark a task in progress ----------
    public void markTaskInProgress() {
        System.out.println("Type a number of task to make in progress: ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= tasks.size()) {
            Task task = tasks.get(number - 1);
            task.markInProgress();
            System.out.println("In progress: " + task.getTaskName());
        }

        tasksDoneNum--;
        tasksInProgressNum++;
    }

    // ---------- Add a new task ----------
    public void addTask() {
        System.out.println("Type a name or description of your task: ");
        String taskName = scanner.nextLine();

        Task newTask = new Task(taskName);
        tasks.add(newTask);
        tasksInProgressNum++;
    }


    // ---------- Remove a task ----------
    public void removeTask() {
        System.out.println("Type a number of task to remove:");
        int number = scanner.nextInt();

        if (number >= 1 && number <= tasks.size()) {
            tasks.remove(number - 1);
            System.out.println("Removed: " + number);
        }

        tasksInProgressNum--;
    }

    // ---------- Clear all tasks ----------
    public void clearAllTasks() {
        tasks.clear();
        System.out.println("All tasks removed.");
    }

    // ---------- Show tasks in progress ----------
    public void showTasksInProgress() {
        if (!tasks.isEmpty()) {
            System.out.println("Tasks in Progress" + "(" + getTasksInProgressNum() + ")");

            int taskNumber = 1;
            for (Task task : tasks) {
                System.out.println(taskNumber++ + ". " + task + ";");
            }

            System.out.println("""
                    Choose operation:
                    1. Add a new task
                    2. Remove task
                    3. Mark as done
                    4. Clear all tasks
                    5. Come back
                    """);

            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    markTaskAsDone();
                    break;
                case 4:
                    clearAllTasks();
                case 5:
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        } else {
            System.out.println("""
                    You don't have any tasks.
                    You can:
                    1. Add a new task
                    2. Come back
                    """);

            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 1:
                    addTask();
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    // ---------- Show tasks done ----------
    public void showTasksDone() {
        if (!tasks.isEmpty()) {
            int taskNumber = 1;
            for (Task task : tasks) {
                if (task.getIsTaskDone()) {
                    System.out.println(taskNumber++ + ". " + task + ";");

                    System.out.println("""
                    Choose operation:
                    1. Mark task in progress
                    2. Come back
                    """);

                    int operation = scanner.nextInt();

                    switch (operation) {
                        case 1:
                            markTaskInProgress();
                            break;
                        case 2:
                            return;
                        default:
                            System.out.println("Invalid option!");
                    }
                }
            }
        } else {
            System.out.println("""
                    You don't have any tasks.
                    You can:
                    1. Add a new task
                    2. Come back
                    """);

            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 1:
                    addTask();
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
