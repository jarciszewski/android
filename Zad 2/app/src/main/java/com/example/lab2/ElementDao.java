package com.example.lab2;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ElementDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    void insert(Phone phone);

    @Query("DELETE FROM smartphones")
    void deleteAll();

    @Query("SELECT * FROM smartphones ORDER BY OEM ASC")
    LiveData<List<Phone>> getAlphabetizedElements();

    @Delete
    void deletePhone(Phone phone);

    @Update
    void updatePhone(Phone phone);
}
