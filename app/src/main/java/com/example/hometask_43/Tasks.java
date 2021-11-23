package com.example.hometask_43;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.sql.Date;
import java.text.DateFormat;

@Entity
public class Tasks {

    @PrimaryKey
    public long id ;
    public String topic ;
    public String description;
    public String timetodo;
    public String status;
    public String color;

    public Tasks(long id, String topic, String description, String timetodo, String status, String color) {
        this.id = id;
        this.topic = topic;
        this.description = description;
        this.timetodo = timetodo;
        this.status = status;
        this.color = color;
    }

}
