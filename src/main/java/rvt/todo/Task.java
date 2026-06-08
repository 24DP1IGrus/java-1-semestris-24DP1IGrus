package rvt.todo;

public class Task {
    private String text;
    private int id;

    public Task(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public String csv() {
        return id + "," + text;
    }

    public int id() {
        return id;
    }

    public String text() {
        return text;
    }

    @Override
    public String toString() {
        return id + ": " + text;
    }
}
