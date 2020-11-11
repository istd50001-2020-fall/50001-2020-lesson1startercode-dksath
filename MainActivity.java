package com.example.myfirstapp;

// Create a new android studio project with Empty Activity
// Copy the code below
// Go to your own MainActivity.java and
// paste it over the existing code BELOW the package statement ***
// ***Sep 2020

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;


//TODO 1.1 Put in some images in the drawables folder
//TODO 1.2 Go to activity_main.xml and modify the layout

public class MainActivity extends AppCompatActivity {

    //TODO 1.2 Instance variables are declared for you, please import the libraries
    ArrayList<Integer> images;
    Button charaButton;
    ImageView charaImage;
    Button ashButton;
    int count = 0;
    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 1.3 Instantiate An ArrayList object
        images = new ArrayList<Integer>();
        //TODO 1.4 Add the image IDs to the ArrayList
        images.add(R.drawable.ashketchum);
        images.add(R.drawable.bartsimpson);
        images.add(R.drawable.bulbasaur);
        images.add(R.drawable.yoda);
        images.add(R.drawable.gyrados);
        images.add(R.drawable.pikachu);
        images.add(R.drawable.eevee);
        images.add(R.drawable.spearow);
        images.add(R.drawable.tomandjerry);
        images.add(R.drawable.edogawaconan);
        images.add(R.drawable.nickwilde);
        images.add(R.drawable.judyhopps);
        images.add(R.drawable.edogawaconan);
        images.add(R.drawable.nemo);
        //TODO 1.5 Get references to the charaButton and charaImage widgets using findViewById
        charaButton = findViewById(R.id.charaButton);
        charaImage = findViewById(R.id.charaImage);
        ashButton = findViewById(R.id.charaButton1);
        //TODO 1.6 For charaButton, invoke the setOnClickListener method
        charaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charaImage.setImageResource(random_int(images));
            }

            public int random_int(ArrayList<Integer> list) {

                int rand = r.nextInt(images.size());
                return list.get(rand);

            }
        });
        ashButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charaImage.setImageResource(R.drawable.ashketchum);

            }
        });
    }}
//TODO 1.7 Create an anonymous class which implements View.OnClickListener interface
//TODO 1.8 Within onClick, write code to randomly select an image ID from the ArrayList and display it in the ImageView
//TODO 1.9 [On your own] Create another button, which when clicked, will cause one image to always be displayed



    }
            }