package com.example.KanbanProject.board;

import com.example.KanbanProject.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name = "kanban_board")
public class Board {
    @Id
    @Column(name = "id", unique = true)
    private Integer id;
    private User userId;
    private String icon;
    private String title;
    private String description;
    private Integer position;
    private Boolean favourite;
    private Integer favouritePosition;

    public Board(Integer id, String icon, String title, String description, Integer position, Boolean favourite, Integer favouritePosition) {
        this.id = id;
        this.icon = icon;
        this.title = title;
        this.description = description;
        this.position = position;
        this.favourite = favourite;
        this.favouritePosition = favouritePosition;
    }

    public Integer getFavouritePosition() {
        return favouritePosition;
    }

    public void setFavouritePosition(Integer favouritePosition) {
        this.favouritePosition = favouritePosition;
    }

    public Boolean getFavourite() {
        return favourite;
    }

    public void setFavourite(Boolean favourite) {
        this.favourite = favourite;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
