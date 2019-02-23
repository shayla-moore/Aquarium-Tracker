package com.apps.shay.aquariumtracker;
import android.arch.persistence.room.*;
import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;
public class MainScreen extends AppCompatActivity implements View.OnClickListener  {

    ImageView at_logo;
    Button startButton;
    UserDao userDao;
    Context context = getApplicationContext();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        userDao = AquariumDatabase.getInstance(context).getUserDao();

        at_logo = findViewById(R.id.at_logo);

        startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.startButton:
                goToMenu();
                break;
        }
    }

    public void goToMenu() {
        Intent intent = new Intent(MainScreen.this, UserMenu.class);
        intent.putExtra("message", "This message comes from PassingDataSourceActivity's first button");
        startActivity(intent);
    }
}
