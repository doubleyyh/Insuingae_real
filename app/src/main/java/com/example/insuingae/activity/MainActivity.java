package com.example.insuingae.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;


import com.example.insuingae.R;
import com.example.insuingae.fragment.CompleteFragment;
import com.example.insuingae.fragment.LastFragment;
import com.example.insuingae.fragment.ToDoFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    ToDoFragment todofragment;
    CompleteFragment completeFragment;
    LastFragment lastFragment;
    Toolbar myToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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


}
