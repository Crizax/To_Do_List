package com.example.todolist.Model;

public class ToDoModel {

    private String task;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int status;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
