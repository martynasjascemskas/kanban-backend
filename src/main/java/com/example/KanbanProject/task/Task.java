package com.example.KanbanProject.task;

import com.example.KanbanProject.tasklist.TaskList;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name = "kanban_tasks")
public class Task {
    @Id
    @Column(name = "id", unique = true)
    private Integer id;
    private TaskList taskList;
    private String title;
    private String description;
    private Integer position;

    public Task(Integer id, String title, String description, Integer position) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
