package project.todo;

public class Task {
    String title;
    boolean isDone;

    public Task(String title) {
        this.title = title;
        this.isDone = false;
    }

    public void print() {
        System.out.println(title + (isDone ? " ✔" : ""));
    }

    public void markDone() {
        isDone = true;
    }
}