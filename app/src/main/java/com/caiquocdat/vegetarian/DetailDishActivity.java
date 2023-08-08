package com.caiquocdat.vegetarian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;
import com.caiquocdat.vegetarian.databinding.ActivityDetailDishBinding;
import com.caiquocdat.vegetarian.databinding.ActivityHomeBinding;
import com.caiquocdat.vegetarian.model.DishModel;

public class DetailDishActivity extends AppCompatActivity {
    private ActivityDetailDishBinding activityDetailDishBinding;
    DishModel dish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDetailDishBinding = ActivityDetailDishBinding.inflate(getLayoutInflater());
        View view = activityDetailDishBinding.getRoot();
        setContentView(view);
        hideSystemUI();
         dish= (DishModel) getIntent().getSerializableExtra("selected_dish");
        setImage();
        setNameDish();
        setProcessing();
        setIngredient();
        activityDetailDishBinding.backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setNameDish() {
        activityDetailDishBinding.nameTv.setText(dish.getDishName());
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

    private void setIngredient() {
        String result="";
        for (int i=0;i<dish.getIngredients().size();i++){
            result=result+"- "+dish.getIngredients().get(i).getIngredientName()+"\n";
        }
        activityDetailDishBinding.ingredientDetailTv.setText(result);
    }

    private void setProcessing() {
        String result="";
        for (int i=0;i<dish.getCookingSteps().size();i++){
            result=result+"- "+dish.getCookingSteps().get(i).getStepDescription()+"\n";
        }
        activityDetailDishBinding.processingDetailTv.setText(result);

    }

    private void setImage() {
        Glide.with(DetailDishActivity.this)
                .load(dish.getUrlImg())
                .centerCrop()
                .into(activityDetailDishBinding.detailImg);
    }
}