package rvt.todo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import rvt.todo.repository.Repository;
import rvt.todo.repository.TodoDB;

public class TodoList {
   public static void main(String[] args) {
      TodoList list = new TodoList();
      list.start();
   }

   private ArrayList<Task> tasks = new ArrayList<>();
   private int lastTodoId = 1;
   private Repository repo = new TodoDB();

   public TodoList() {
   }

   public void print() {
      for (int i = 0; i < tasks.size(); i++) {
         System.out.println(tasks.get(i));
      }
   }

   private static final Pattern EVENT_PATTERN = Pattern.compile("^[a-zA-Z0-9 ]{3,}$");

   private boolean checkEventString(String value) {
      return EVENT_PATTERN.matcher(value).matches();
   }

   private void setLastTodoId() {
      for (Task task : tasks) {
         if (task.id() >= lastTodoId)
            lastTodoId = task.id() + 1;
      }
   }

   public void start() {
      Scanner scanner = new Scanner(System.in);

      tasks = repo.findAll();
      setLastTodoId();

      while (true) {
         System.out.print("Command: ");
         String command = scanner.nextLine();

         if (command.equals("stop")) {
            break;
         } else if (command.equals("add")) {
            System.out.print("To add: ");

            String task = scanner.nextLine();
            if (checkEventString(task)) {
               repo.addTodo(new Task(lastTodoId, task));
               lastTodoId++;
            } else {
               System.out.println("Task can only contain letters, digits and spaces!");
            }
         } else if (command.equals("list")) {
            tasks = repo.findAll();
            setLastTodoId();
            print();
         } else if (command.equals("remove")) {
            System.out.print("Which one is removed? ");
            repo.removeById(Integer.valueOf(scanner.nextLine()));
         }
      }
      scanner.close();
   }
}