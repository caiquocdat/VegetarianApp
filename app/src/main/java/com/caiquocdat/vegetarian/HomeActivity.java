package com.caiquocdat.vegetarian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.caiquocdat.vegetarian.adapter.DailyMenuAdapter;
import com.caiquocdat.vegetarian.adapter.DailyMenuFiveAdapter;
import com.caiquocdat.vegetarian.adapter.DishAdapter;
import com.caiquocdat.vegetarian.checkrandom.RandomData;
import com.caiquocdat.vegetarian.data.DataInitializer;
import com.caiquocdat.vegetarian.databinding.ActivityHomeBinding;
import com.caiquocdat.vegetarian.model.DailyMenuModel;
import com.caiquocdat.vegetarian.model.DishModel;

import java.util.ArrayList;
import java.util.Random;

public class HomeActivity extends AppCompatActivity {
    private ActivityHomeBinding homeBinding;
    public static ArrayList<DishModel> listDisModel;
    private ArrayList<DailyMenuModel> dailyMenuModels;
    private DishAdapter dishAdapter;
    DailyMenuFiveAdapter dailyMenuFiveAdapter;
    private RandomData randomData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeBinding = ActivityHomeBinding.inflate(getLayoutInflater());
        View view = homeBinding.getRoot();
        setContentView(view);
        hideSystemUI();
        setRcvDay();
        setFiveRcv();
        setSevenRcv();
        setThreeRcv();
        homeBinding.seeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(HomeActivity.this,SeeAllActivity.class);
                startActivity(intent);
            }
        });




    }

    private void setThreeRcv() {
        RandomData randomData_three= new RandomData(HomeActivity.this);
        dailyMenuModels=randomData_three.checkAndRunRandomThreeMenus();
        dailyMenuFiveAdapter= new DailyMenuFiveAdapter(dailyMenuModels,HomeActivity.this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        homeBinding.threeRcv.setLayoutManager(layoutManager);
        homeBinding.threeRcv.setAdapter(dailyMenuFiveAdapter);
    }

    private void setFiveRcv() {
        RandomData randomData_five= new RandomData(HomeActivity.this);
        dailyMenuModels=randomData_five.checkAndRunRandomFiveMenus();
        dailyMenuFiveAdapter= new DailyMenuFiveAdapter(dailyMenuModels,HomeActivity.this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        homeBinding.fiveRcv.setLayoutManager(layoutManager);
        homeBinding.fiveRcv.setAdapter(dailyMenuFiveAdapter);
    }
    private void setSevenRcv() {
        RandomData randomData_seven= new RandomData(HomeActivity.this);
        dailyMenuModels=randomData_seven.checkAndRunRandomSevenMenus();
        dailyMenuFiveAdapter= new DailyMenuFiveAdapter(dailyMenuModels,HomeActivity.this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        homeBinding.sevenRcv.setLayoutManager(layoutManager);
        homeBinding.sevenRcv.setAdapter(dailyMenuFiveAdapter);
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


    private void setRcvDay() {
        randomData= new RandomData(HomeActivity.this);
        DailyMenuModel randomMenu = randomData.checkAndRunRandomMenu();
        if (randomMenu != null) {
            // Làm gì đó với randomMenu
            listDisModel=randomMenu.getDishes();
            dishAdapter=new DishAdapter(HomeActivity.this,listDisModel);
            LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
            homeBinding.todayRcv.setLayoutManager(layoutManager);
            homeBinding.todayRcv.setAdapter(dishAdapter);

        }
    }
}