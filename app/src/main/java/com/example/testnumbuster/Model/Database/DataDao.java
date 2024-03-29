package com.example.testnumbuster.Model.Database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DataDao {
    @Insert
    void insert(DataModel dataModel);

    @Delete
    void delete(DataModel dataModel);

    @Query("SELECT * FROM DataModel")
    List<DataModel> getAllData();

    @Query("SELECT * FROM DataModel WHERE id LIKE :id")
    List<DataModel> getById(long id);
}
