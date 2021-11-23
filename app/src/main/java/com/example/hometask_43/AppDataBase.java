package com.example.hometask_43;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Tasks.class}, version = 1)


public abstract class AppDataBase extends RoomDatabase {
    public abstract DaoTasks getTasksDao();
}
