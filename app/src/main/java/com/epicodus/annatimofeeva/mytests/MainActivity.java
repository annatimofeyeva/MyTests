package com.epicodus.annatimofeeva.mytests;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button goToSecondButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       goToSecondButton = (Button)findViewById(R.id.showButtonID);
        goToSecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create new Intent Object
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });

    }

    @Override
    public void onStart(){
        super.onStart();

        Toast.makeText(getApplicationContext(), "Hei! we are starting" , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "Hello World1!", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Hello World2!", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPostResume(){
        super.onPostResume();
        Toast.makeText(getApplicationContext(), "Hello World3!", Toast.LENGTH_LONG).show();

    }
}
