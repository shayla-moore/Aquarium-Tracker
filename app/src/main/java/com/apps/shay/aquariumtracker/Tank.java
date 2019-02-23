package com.apps.shay.aquariumtracker;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(foreignKeys = @ForeignKey(entity = User.class,
        parentColumns = "id",
        childColumns = "userId",
        onDelete = CASCADE))
public class Tank {
    @PrimaryKey public final int id;
    public final String tankName;
    public final int gallons, tankHeight, tankWidth, tankLength;
    public final int userId;

    public Tank(final int id, String tankName, int gallons,
                int tankHeight, int tankWidth, int tankLength, final int userId) {
        this.id = id;
        this.tankName = tankName;
        this.gallons = gallons;
        this.tankHeight = tankHeight;
        this.tankWidth = tankWidth;
        this.tankLength = tankLength;
        this.userId = userId;
    }

}
