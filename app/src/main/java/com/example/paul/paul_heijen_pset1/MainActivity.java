package com.example.paul.paul_heijen_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private ImageView arms, ears, eyebrows, eyes, glasses, hat, mouth, mustache, nose, shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arms = (ImageView) findViewById(R.id.arms);
        arms.setVisibility(View.INVISIBLE);

        ears = (ImageView) findViewById(R.id.ears);
        ears.setVisibility(View.INVISIBLE);

        eyebrows = (ImageView) findViewById(R.id.eyebrows);
        eyebrows.setVisibility(View.INVISIBLE);

        eyes = (ImageView) findViewById(R.id.eyes);
        eyes.setVisibility(View.INVISIBLE);

        glasses = (ImageView) findViewById(R.id.glasses);
        glasses.setVisibility(View.INVISIBLE);

        hat = (ImageView) findViewById(R.id.hat);
        hat.setVisibility(View.INVISIBLE);

        mouth = (ImageView) findViewById(R.id.mouth);
        mouth.setVisibility(View.INVISIBLE);

        mustache = (ImageView) findViewById(R.id.mustache);
        mustache.setVisibility(View.INVISIBLE);

        nose = (ImageView) findViewById(R.id.nose);
        nose.setVisibility(View.INVISIBLE);

        shoes = (ImageView) findViewById(R.id.shoes);
        shoes.setVisibility(View.INVISIBLE);
    }

    public void activity(View view) {
        switch(view.getId()){
            case R.id.check_nose: change_visibility(view, nose); break;
            case R.id.check_shoes: change_visibility(view, shoes); break;
            case R.id.check_mouth: change_visibility(view, mouth); break;
            case R.id.check_mustache: change_visibility(view, mustache); break;
            case R.id.check_hat: change_visibility(view, hat); break;
            case R.id.check_glasses: change_visibility(view, glasses); break;
            case R.id.check_eyes: change_visibility(view, eyes); break;
            case R.id.check_eyebrows: change_visibility(view, eyebrows); break;
            case R.id.check_ears: change_visibility(view, ears); break;
            case R.id.check_arms: change_visibility(view, arms); break;
            default:
        }
    }


    public void change_visibility(View view, ImageView part){
        boolean checked = ((CheckBox) view).isChecked();
        if(checked) {
            part.setVisibility(View.VISIBLE);
        }
        else {
            part.setVisibility(View.INVISIBLE);
        }

    }


}
