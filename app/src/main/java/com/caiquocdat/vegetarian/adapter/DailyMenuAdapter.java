package com.caiquocdat.vegetarian.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.caiquocdat.vegetarian.R;
import com.caiquocdat.vegetarian.databinding.ItemHomeBinding;
import com.caiquocdat.vegetarian.model.DailyMenuModel;
import com.caiquocdat.vegetarian.model.MealTimeModel;

import java.util.List;

public class DailyMenuAdapter extends RecyclerView.Adapter<DailyMenuAdapter.ViewHolder> {
    private List<DailyMenuModel> dailyMenus;
    private Context context;
    private String check = "false";

    public DailyMenuAdapter(List<DailyMenuModel> dailyMenus, Context context) {
        this.dailyMenus = dailyMenus;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemHomeBinding itemHomeBinding = ItemHomeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(itemHomeBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DailyMenuModel dailyMenu = dailyMenus.get(position);

        holder.itemHomeBinding.dateTv.setText("Ngày " + (position + 1));

        // Assuming that the MealTime list always has the same order of Breakfast, Lunch, and Dinner
        MealTimeModel breakfast = dailyMenu.getMealTimes().get(0);
        MealTimeModel lunch = dailyMenu.getMealTimes().get(1);
        MealTimeModel dinner = dailyMenu.getMealTimes().get(2);

        holder.itemHomeBinding.breakfastTv.setText(breakfast.getDetail());
        holder.itemHomeBinding.lunchTv.setText(lunch.getDetail());
        holder.itemHomeBinding.dinnerTv.setText(dinner.getDetail());
        holder.itemHomeBinding.downImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check.equals("true")) {
                    holder.itemHomeBinding.downImg.setImageResource(R.drawable.img_down);
                    holder.itemHomeBinding.contentRel.setVisibility(View.GONE);
                    check = "false";
                } else {
                    holder.itemHomeBinding.downImg.setImageResource(R.drawable.img_up);
                    holder.itemHomeBinding.contentRel.setVisibility(View.VISIBLE);
                    check = "true";
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return dailyMenus.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ItemHomeBinding itemHomeBinding;

        public ViewHolder(@NonNull ItemHomeBinding itemHomeBinding) {
            super(itemHomeBinding.getRoot());
            this.itemHomeBinding = itemHomeBinding;
        }
    }
}

