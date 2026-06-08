package rvt.todo.repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import rvt.todo.Task;

public class TodoCSV implements Repository {
    private final String FILEPATH = "data/todo.csv";

    public void addTodo(Task task) {
        try (FileWriter fw = new FileWriter(new File(FILEPATH), true)) {
            fw.append(task.csv());
        } catch (Exception e) {
            throw new RuntimeException("Task addition failed: " + e.getMessage());
        }
    }

    public void removeById(int id) {
        ArrayList<Task> tasks = findAll();
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).id() == id)
                tasks.remove(i);
        }

        for (Task task : tasks) {
            addTodo(task);
        }
    }

    public ArrayList<Task> findAll() {
        ArrayList<Task> tasks = new ArrayList<>();

        File file = new File(FILEPATH);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                throw new RuntimeException("File creation failed: " + e.getMessage());
            }
            return tasks;
        }

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                if (data.length != 2) {
                    System.err.println("Corrupted task data: " + data);
                    continue;
                }

                Task task = new Task(Integer.valueOf(data[0]), data[1]);
                tasks.add(task);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Task quering failed: " + e.getMessage());
        }

        return tasks;
    }
}
