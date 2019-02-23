package com.apps.shay.aquariumtracker;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import java.util.List;

@Dao
public interface TankDao {
    @Insert
    void insert(Tank tank);
//update
    @Update
    void update(Tank... tanks);

    @Delete
    void delete(Tank... tanks);
    @Query("SELECT * FROM tank")
    List<Tank> getAllTanks();

    @Query("SELECT * FROM tank WHERE userId=:userId")
    List<Tank> findRepositoriesForUser(final int userId);

}
