package com.caiquocdat.vegetarian.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.caiquocdat.vegetarian.DetailDishActivity;
import com.caiquocdat.vegetarian.databinding.ItemDayBinding;
import com.caiquocdat.vegetarian.databinding.ItemDetailBinding;
import com.caiquocdat.vegetarian.model.DishModel;

import java.util.List;

public class DishGridAdapter extends RecyclerView.Adapter<DishGridAdapter.DishViewHolder> {

    private final Context context;
    private final List<DishModel> dishList;

    public DishGridAdapter(Context context, List<DishModel> dishList) {
        this.context = context;
        this.dishList = dishList;
    }

    @NonNull
    @Override
    public DishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemDetailBinding itemDetailBinding = ItemDetailBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new DishViewHolder(itemDetailBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull DishViewHolder holder, int position) {
        DishModel dish = dishList.get(position);
        holder.itemDetailBinding.nameTv.setText(dish.getDishName());

        // Sử dụng Glide để tải và hiển thị ảnh từ URL
        Glide.with(context)
                .load(dish.getUrlImg())
                .centerCrop()
                .into(holder.itemDetailBinding.itemImg);
        holder.itemDetailBinding.itemLinear.setOnClickListener(new View.OnClickListener() {
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
        ItemDetailBinding itemDetailBinding;
        public DishViewHolder(@NonNull ItemDetailBinding itemDetailBinding) {
            super(itemDetailBinding.getRoot());
            this.itemDetailBinding = itemDetailBinding;
        }
    }
}
