package rvt.todo.repository;

import java.util.ArrayList;

import rvt.todo.Task;

public interface Repository {
    public void addTodo(Task task);

    public void removeById(int id);

    public ArrayList<Task> findAll();
}