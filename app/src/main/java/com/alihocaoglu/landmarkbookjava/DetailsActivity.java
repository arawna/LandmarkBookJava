package com.alihocaoglu.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.alihocaoglu.landmarkbookjava.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        LandMark selectedLandmark = (LandMark) intent.getSerializableExtra("landmark");

        binding.nameText.setText(selectedLandmark.getName());
        binding.countryText.setText(selectedLandmark.getCountry());
        binding.imageView.setImageResource(selectedLandmark.getImage());
    }
}