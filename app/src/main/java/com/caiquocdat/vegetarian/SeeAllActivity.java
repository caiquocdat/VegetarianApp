package com.caiquocdat.vegetarian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.caiquocdat.vegetarian.adapter.DishGridAdapter;
import com.caiquocdat.vegetarian.databinding.ActivityHomeBinding;
import com.caiquocdat.vegetarian.databinding.ActivitySeeAllBinding;
import com.caiquocdat.vegetarian.model.DishModel;

import java.util.ArrayList;

public class SeeAllActivity extends AppCompatActivity {
    private ActivitySeeAllBinding activitySeeAllBinding;
    DishGridAdapter dishGridAdapter;
    ArrayList<DishModel> dishModelArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitySeeAllBinding = ActivitySeeAllBinding.inflate(getLayoutInflater());
        View view = activitySeeAllBinding.getRoot();
        setContentView(view);
        setGidView();
        hideSystemUI();
        activitySeeAllBinding.backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void setGidView() {
        dishModelArrayList= HomeActivity.listDisModel;
        dishGridAdapter= new DishGridAdapter(SeeAllActivity.this,dishModelArrayList);
        activitySeeAllBinding.itemGrid.setLayoutManager(new GridLayoutManager(this, 2));
        activitySeeAllBinding.itemGrid.setAdapter(dishGridAdapter);

    }

    private void hideSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        |View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
//                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }
}