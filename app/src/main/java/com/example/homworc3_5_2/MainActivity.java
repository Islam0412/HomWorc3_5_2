package com.example.homworc3_5_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String>carList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        carList.add("BMV ");
        carList.add(" Acura.");
        carList.add("Aston Martin. ");
        carList.add(" Bentley.");
        carList.add("Bugatti.");
        carList.add("Bugatti.");
        carList.add("Bugatti.");
        carList.add("Bugatti.");
        carList.add("Bugatti.");
        carList.add("Bugatti.");
        carList.add("Bugatti.");
        carList.add("Bugatti.");
        carList.add("Bugatti.");
        carList.add("Bugatti.");
        carList.add("Bugatti.");
        carList.add("Bugatti.");
        carList.add("Bugatti.");
        carList.add("Bugatti.");
        carList.add("Bugatti.");

        CarAdapter adapter = new CarAdapter(carList);

        recyclerView.setAdapter(adapter);
    }
}