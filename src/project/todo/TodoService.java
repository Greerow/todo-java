package project.todo;

import java.util.ArrayList;

public class TodoService {

    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String title) {
        tasks.add(new Task(title));
    }

    public void removeTask(int index) {
        tasks.remove(index);
    }

    public void markDone(int index) {
        tasks.get(index).markDone();
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public int size() {
        return tasks.size();
    }

    public boolean isEmpty() {
        return tasks.isEmpty();
    }
}