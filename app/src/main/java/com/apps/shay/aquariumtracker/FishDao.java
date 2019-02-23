package com.apps.shay.aquariumtracker;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import java.util.List;

@Dao
public interface FishDao {
    @Insert
    void insert(Fish fish);

    @Update
    void update(Fish... fish);

    @Delete
    void delete(Fish... fish);
    @Query("SELECT * FROM fish")
    List<Fish> getAllRepos();

    @Query("SELECT * FROM fish WHERE tankId=:tankId")
    List<Fish> findRepositoriesForUser(final int tankId);
}
