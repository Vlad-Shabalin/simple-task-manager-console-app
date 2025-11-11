public class Task {
    private String taskName;
    private boolean isTaskDone;

    public Task (String name) {
        this.taskName = name;
        this.markInProgress();
    }

    public String getTaskName() {
        return taskName;
    }

    public void markDone() {
        this.isTaskDone = true;
    }

    public void markInProgress() {
        this.isTaskDone = false;
    }
}
