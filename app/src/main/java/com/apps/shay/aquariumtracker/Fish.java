package com.apps.shay.aquariumtracker;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(foreignKeys = @ForeignKey(entity = Tank.class,
                                parentColumns = "id",
                                childColumns = "tankId",
                                onDelete = CASCADE))
public class Fish {
    @PrimaryKey
    public final int id;
    public final String fishName, fishBreed, fishSize, fishFood, fishAge, waterType;
    public final int tankId;


    public Fish(int id, String fishName, String fishBreed, String fishSize,
                String fishFood, String fishAge, String waterType, int tankId) {
        this.id = id;
        this.fishName = fishName;
        this.fishBreed = fishBreed;
        this.fishSize = fishSize;
        this.fishFood = fishFood;
        this.fishAge = fishAge;
        this.waterType = waterType;
        this.tankId = tankId;
    }
}