package com.caiquocdat.vegetarian.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.caiquocdat.vegetarian.DetailDishActivity;
import com.caiquocdat.vegetarian.databinding.ItemDayBinding;
import com.caiquocdat.vegetarian.databinding.ItemHomeBinding;
import com.caiquocdat.vegetarian.model.DishModel;

import java.util.List;

public class DishAdapter extends RecyclerView.Adapter<DishAdapter.DishViewHolder> {

    private final Context context;
    private final List<DishModel> dishList;

    public DishAdapter(Context context, List<DishModel> dishList) {
        this.context = context;
        this.dishList = dishList;
    }

    @NonNull
    @Override
    public DishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemDayBinding itemDayBinding = ItemDayBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new DishViewHolder(itemDayBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull DishViewHolder holder, int position) {
        DishModel dish = dishList.get(position);
        holder.itemDayBinding.nameTv.setText(dish.getDishName());

        // Sử dụng Glide để tải và hiển thị ảnh từ URL
        Glide.with(context)
                .load(dish.getUrlImg())
                .centerCrop()
                .into(holder.itemDayBinding.itemImg);
        holder.itemDayBinding.itemImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailDishActivity.class);
                intent.putExtra("selected_dish", dish);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dishList.size();
    }

    public static class DishViewHolder extends RecyclerView.ViewHolder {
        ItemDayBinding itemDayBinding;
        public DishViewHolder(@NonNull ItemDayBinding itemDayBinding) {
            super(itemDayBinding.getRoot());
            this.itemDayBinding = itemDayBinding;
        }
    }
}
