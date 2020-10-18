package com.example.rifki11rpl012019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class ListDataFavourite extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DataAdapterFavourite adapter;
    private ArrayList<ModelMovieRealm> DataArrayList; //kit add kan ke adapter
    private ImageView tambah_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);
        recyclerView = (RecyclerView) findViewById(R.id.rvdata);
    }
}