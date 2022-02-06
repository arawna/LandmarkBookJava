package com.alihocaoglu.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.alihocaoglu.landmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<LandMark> landMarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landMarkArrayList = new ArrayList<>();

        //Data
        LandMark pisa = new LandMark("Pisa","Italy",R.drawable.pisa);
        LandMark eiffel = new LandMark("Eiffel","France",R.drawable.eiffel);
        LandMark colesseum = new LandMark("Colesseum","Italy",R.drawable.colosseum);
        LandMark londonBridge = new LandMark("London Bridge","UK",R.drawable.londonbridge);

        landMarkArrayList.add(pisa);
        landMarkArrayList.add(eiffel);
        landMarkArrayList.add(colesseum);
        landMarkArrayList.add(londonBridge);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landMarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);


        /*
        //Adapter
        //Listview

        //mapping
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landMarkArrayList.stream().map(landMark -> landMark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(MainActivity.this,landMarkArrayList.get(i).getName(),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("landmark",landMarkArrayList.get(i));
                startActivity(intent);
            }
        });
        */
    }
}