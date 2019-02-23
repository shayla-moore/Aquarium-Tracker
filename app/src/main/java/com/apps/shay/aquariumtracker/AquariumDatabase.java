package com.apps.shay.aquariumtracker;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = { Fish.class, User.class, Tank.class },
        version = 1)
public abstract class AquariumDatabase extends RoomDatabase {

    private static final String DB_NAME = "aquariumDatabase.db";
    private static volatile AquariumDatabase instance;

    static synchronized AquariumDatabase getInstance(Context context) {
        if (instance == null) {
            instance = create(context);
        }
        return instance;
    }

    private static AquariumDatabase create(final Context context) {
        return Room.databaseBuilder(
                context,
                AquariumDatabase.class,
                DB_NAME).build();
    }
    public abstract UserDao getUserDao();
    public abstract FishDao getFishDao();
    public abstract TankDao getTankDao();
}
