package com.caiquocdat.vegetarian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.caiquocdat.vegetarian.adapter.DailyMenuAdapter;
import com.caiquocdat.vegetarian.data.DataInitializer;
import com.caiquocdat.vegetarian.databinding.ActivityDetailDishBinding;
import com.caiquocdat.vegetarian.databinding.ActivityMenu5DayBinding;
import com.caiquocdat.vegetarian.model.DailyMenuModel;
import com.caiquocdat.vegetarian.model.DishModel;

import java.util.ArrayList;

public class Menu_5_Day_Activity extends AppCompatActivity {
    private ActivityMenu5DayBinding activityMenu5DayBinding;
    private ArrayList<DailyMenuModel> dailyMenuModels;
    private DailyMenuAdapter dailyMenuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMenu5DayBinding = ActivityMenu5DayBinding.inflate(getLayoutInflater());
        View view = activityMenu5DayBinding.getRoot();
        setContentView(view);
        hideSystemUI();
        setFiveRcv();
        activityMenu5DayBinding.backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });
    }

    private void setFiveRcv() {
        dailyMenuModels= (ArrayList<DailyMenuModel>) getIntent().getSerializableExtra("selected_dish");
        if (dailyMenuModels.size()==5){
            activityMenu5DayBinding.nameTv.setText("Thực đơn 5 ngày");
        }else if(dailyMenuModels.size()==7){
            activityMenu5DayBinding.nameTv.setText("Thực đơn 7 ngày");
        }else{
            activityMenu5DayBinding.nameTv.setText("Thực đơn 3 ngày");
        }
        dailyMenuAdapter = new DailyMenuAdapter(dailyMenuModels, Menu_5_Day_Activity.this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        activityMenu5DayBinding.fiveRcv.setLayoutManager(layoutManager);
        activityMenu5DayBinding.fiveRcv.setAdapter(dailyMenuAdapter);
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