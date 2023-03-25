package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();

        Landmark pisa = new Landmark("Pisa", "Italy", "The Leaning Tower of Pisa is a famous tourist attraction located in the Italian city of Pisa. The tower is known for its distinctive lean, which has made it one of the most recognizable landmarks in the world." , R.drawable.pisa);
        Landmark eiffel = new Landmark("Eiffel", "France", "The Eiffel Tower is a world-renowned landmark located in Paris, France. It was named after its designer and engineer, Gustave Eiffel, and was completed in 1889 as the entrance arch to the World's Fair." , R.drawable.eiffel);
        Landmark colosseum = new Landmark("Colosseum", "Italy", "The Colosseum, also known as the Flavian Amphitheatre, is an iconic symbol of ancient Rome located in the heart of modern-day Rome, Italy. It was built in AD 80-90 by the Emperor Vespasian and his sons Titus and Domitian, and was the largest amphitheater ever built at the time." , R.drawable.colosseum);
        Landmark londonBridge = new Landmark("London Bridge", "UK", "London Bridge is an iconic symbol of the city of London and one of the most recognizable landmarks in the world. It spans the River Thames and connects the City of London with Southwark." , R.drawable.londonbridge);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(colosseum);
        landmarkArrayList.add(londonBridge);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);
    }
}