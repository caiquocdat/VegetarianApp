package com.caiquocdat.vegetarian.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.caiquocdat.vegetarian.Menu_5_Day_Activity;
import com.caiquocdat.vegetarian.databinding.ItemFiveRcvBinding;
import com.caiquocdat.vegetarian.databinding.ItemHomeBinding;
import com.caiquocdat.vegetarian.model.DailyMenuModel;
import com.caiquocdat.vegetarian.model.MealTimeModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMenuFiveAdapter extends RecyclerView.Adapter<DailyMenuFiveAdapter.ViewHolder> {
    private ArrayList<DailyMenuModel> dailyMenus;
    private Context context;

    public DailyMenuFiveAdapter(ArrayList<DailyMenuModel> dailyMenus, Context context) {
        this.dailyMenus = dailyMenus;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemFiveRcvBinding itemFiveRcvBinding = ItemFiveRcvBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(itemFiveRcvBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DailyMenuModel dailyMenu = dailyMenus.get(position);

        holder.itemFiveRcvBinding.dayTv.setText("Ngày " + (position + 1));

        // Assuming that the MealTime list always has the same order of Breakfast, Lunch, and Dinner
        MealTimeModel breakfast = dailyMenu.getMealTimes().get(0);
        String result="Bữa sáng: ";
        Glide.with(context)
                .load(dailyMenu.getDishes().get(0).getUrlImg())
                .centerCrop()
                .into(holder.itemFiveRcvBinding.fiveImage);
        result=result+" "+dailyMenu.getDishes().get(0).getDishName() +" và " +dailyMenu.getDishes().get(1).getDishName();
        MealTimeModel lunch = dailyMenu.getMealTimes().get(1);
        MealTimeModel dinner = dailyMenu.getMealTimes().get(2);

        holder.itemFiveRcvBinding.dayDetailTv.setText(result);
        holder.itemFiveRcvBinding.itemLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, Menu_5_Day_Activity.class);
                intent.putExtra("selected_dish", dailyMenus);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dailyMenus.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ItemFiveRcvBinding itemFiveRcvBinding;

        public ViewHolder(@NonNull  ItemFiveRcvBinding itemFiveRcvBinding) {
            super(itemFiveRcvBinding.getRoot());
            this.itemFiveRcvBinding = itemFiveRcvBinding;
        }
    }
}

