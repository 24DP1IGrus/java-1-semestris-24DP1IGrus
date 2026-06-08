package rvt.todo.repository;

import java.sql.Statement;
import java.util.ArrayList;

import rvt.todo.Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TodoDB implements Repository {
    private static final String DB_URL = "jdbc:sqlite:data/todo.db";

    public TodoDB() {
        initSchema();
    }

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }

    private void initSchema() {
        String sql = "CREATE TABLE IF NOT EXISTS todo ("
                + "id INTEGER PRIMARY KEY,"
                + "task TEXT NOT NULL)";
        try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException("Schema init failed: " + e.getMessage());
        }
    }

    public void addTodo(Task task) {
        String sql = "INSERT INTO todo(id, task) VALUES(?,?)";
        try (Connection conn = connect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, task.id());
            ps.setString(2, task.text());
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Task addition failed: " + e.getMessage());
        }
    }

    public void removeById(int id) {
        String sql = "DELETE FROM todo WHERE id = ?";
        try (Connection conn = connect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Task removal failed: " + e.getMessage());
        }
    }

    public ArrayList<Task> findAll() {
        String sql = "SELECT * FROM todo ORDER BY id";
        try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
            ArrayList<Task> tasks = new ArrayList<>();

            ResultSet res = stmt.executeQuery(sql);
            while (res.next()) {
                tasks.add(new Task(res.getInt(1), res.getString(2)));
            }
            return tasks;
        } catch (SQLException e) {
            throw new RuntimeException("Task quering failed: " + e.getMessage());
        }
    }
}
