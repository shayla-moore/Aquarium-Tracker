package com.apps.shay.aquariumtracker;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey public final int id;
    public final String name;
    public final String avatarUrl;

    public User(int id, String name, String avatarUrl) {
        this.id = id;
        this.name = name;
        this.avatarUrl = avatarUrl;
    }
}
