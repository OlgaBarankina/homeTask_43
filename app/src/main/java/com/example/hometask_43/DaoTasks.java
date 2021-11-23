package com.example.hometask_43;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DaoTasks {

    @Query("SELECT * FROM Tasks")
    List<Tasks> getAllTasks();


    @Insert
    void insert(Tasks tasks);

    @Update
    void update(Tasks tasks);

    @Delete
    void delete(Tasks tasks);


}
