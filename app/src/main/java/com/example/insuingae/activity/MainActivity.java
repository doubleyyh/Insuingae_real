package com.example.insuingae.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;


import com.example.insuingae.R;
import com.example.insuingae.fragment.CompleteFragment;
import com.example.insuingae.fragment.LastFragment;
import com.example.insuingae.fragment.ToDoFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    ToDoFragment todofragment;
    CompleteFragment completeFragment;
    LastFragment lastFragment;
    Toolbar myToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        if (firebaseUser == null) {
            myStartActivity(SignUpActivity.class);
        }
        todofragment= new ToDoFragment();
        completeFragment = new CompleteFragment();
        lastFragment = new LastFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, todofragment).commit();



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.todo:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, todofragment).commit();
                        return true;
                    case R.id.did:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, completeFragment).commit();
                        return true;
                    case R.id.last:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, lastFragment).commit();

                        return true;
                    default:
                        throw new IllegalStateException("Unexpected value: " + item.getItemId());
                }
            }
        });

    }

    public void setToolbar(String title){
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setTitle(title);
        }
    }
    private void myStartActivity(Class c) {
        Intent intent = new Intent(this, c);
        startActivityForResult(intent, 1);
    }


}
