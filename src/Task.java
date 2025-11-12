public class Task {
    private String taskName;
    private boolean isTaskDone;

    public Task (String name) {
        this.taskName = name;
        this.markInProgress();
    }

    public boolean getIsTaskDone() {
        return isTaskDone;
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

    @Override
    public String toString() {
        return taskName;
    }
}
