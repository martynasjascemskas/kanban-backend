package com.example.KanbanProject.tasklist;

import com.example.KanbanProject.board.Board;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name = "kanban_tasks_list")
public class TaskList {
    @Id
    @Column(name = "id", unique = true)
    private Integer id;
    private Board boardId;
    private String title;

    public TaskList(Integer id, String title) {
        this.id = id;
        this.title = title;
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
}
