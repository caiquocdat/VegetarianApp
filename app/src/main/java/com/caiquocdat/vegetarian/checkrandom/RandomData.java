package com.caiquocdat.vegetarian.checkrandom;

import android.content.Context;
import android.content.SharedPreferences;
import android.icu.text.SimpleDateFormat;

import com.caiquocdat.vegetarian.data.DataInitializer;
import com.caiquocdat.vegetarian.model.DailyMenuModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

public class RandomData {

    private ArrayList<DailyMenuModel> dailyMenus;
    private SharedPreferences sharedPreferences;

    public RandomData(Context context) {
        dailyMenus = new ArrayList<>();
        dailyMenus=DataInitializer.initializeDailyMenus();

        // Khởi tạo danh sách dailyMenus ở đây

        sharedPreferences = context.getSharedPreferences("prefs", Context.MODE_PRIVATE);
    }

    public DailyMenuModel checkAndRunRandomMenu() {
        String lastRunDate = sharedPreferences.getString("last_run_date", "");
        String todayDate = getCurrentDate();

        if (!lastRunDate.equals(todayDate)) {
            DailyMenuModel randomMenu = getRandomDailyMenu(dailyMenus);

            // Lưu lại ngày hôm nay và index của menu random
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("last_run_date", todayDate);
            editor.putInt("current_random_index", dailyMenus.indexOf(randomMenu));
            editor.apply();

            return randomMenu; // Trả về DailyMenuModel random
        } else {
            // Nếu ngày không thay đổi, trả về giá trị random hiện tại
            int currentRandomIndex = sharedPreferences.getInt("current_random_index", -1);
            if (currentRandomIndex != -1 && currentRandomIndex < dailyMenus.size()) {
                return dailyMenus.get(currentRandomIndex);
            }
        }

        return null;
    }
    public ArrayList<DailyMenuModel> checkAndRunRandomFiveMenus() {
        String lastRunDate = sharedPreferences.getString("last_run_date_for_five", "");
        String todayDate = getCurrentDate();

        if (!lastRunDate.equals(todayDate)) {
            // Nếu ngày thay đổi, lấy 5 món ngẫu nhiên từ danh sách
            ArrayList<DailyMenuModel> randomFiveMenus = getRandomFiveMenus();

            // Lưu lại ngày hôm nay để kiểm tra sau này
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("last_run_date_for_five", todayDate);
            editor.apply();

            return randomFiveMenus;
        } else {
            // Nếu ngày không thay đổi, trả về 5 món đầu tiên từ danh sách
            return new ArrayList<>(dailyMenus.subList(0, 5));
        }
    }

    private ArrayList<DailyMenuModel> getRandomFiveMenus() {
        if (dailyMenus == null || dailyMenus.size() < 5) {
            return null;
        }
        ArrayList<DailyMenuModel> shuffledMenus = new ArrayList<>(dailyMenus);
        Collections.shuffle(shuffledMenus);
        return new ArrayList<>(shuffledMenus.subList(0, 5));
    }
    public ArrayList<DailyMenuModel> checkAndRunRandomSevenMenus() {
        String lastRunDate = sharedPreferences.getString("last_run_date_for_seven", "");
        String todayDate = getCurrentDate();

        if (!lastRunDate.equals(todayDate)) {
            // Nếu ngày thay đổi, lấy 7 món ngẫu nhiên từ danh sách
            ArrayList<DailyMenuModel> randomSevenMenus = getRandomSevenMenus();

            // Lưu lại ngày hôm nay để kiểm tra sau này
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("last_run_date_for_seven", todayDate);
            editor.apply();

            return randomSevenMenus;
        } else {
            // Nếu ngày không thay đổi, trả về 7 món đầu tiên từ danh sách
            return new ArrayList<>(dailyMenus.subList(0, 7));
        }
    }

    private ArrayList<DailyMenuModel> getRandomSevenMenus() {
        if (dailyMenus == null || dailyMenus.size() < 7) {
            return null;
        }
        ArrayList<DailyMenuModel> shuffledMenus = new ArrayList<>(dailyMenus);
        Collections.shuffle(shuffledMenus);
        return new ArrayList<>(shuffledMenus.subList(0, 7));
    }
    public ArrayList<DailyMenuModel> checkAndRunRandomThreeMenus() {
        String lastRunDate = sharedPreferences.getString("last_run_date_for_seven", "");
        String todayDate = getCurrentDate();

        if (!lastRunDate.equals(todayDate)) {
            // Nếu ngày thay đổi, lấy 7 món ngẫu nhiên từ danh sách
            ArrayList<DailyMenuModel> randomSevenMenus = getRandomSevenMenus();

            // Lưu lại ngày hôm nay để kiểm tra sau này
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("last_run_date_for_seven", todayDate);
            editor.apply();

            return randomSevenMenus;
        } else {
            // Nếu ngày không thay đổi, trả về 7 món đầu tiên từ danh sách
            return new ArrayList<>(dailyMenus.subList(0, 3));
        }
    }

    private ArrayList<DailyMenuModel> getRandomThreeMenus() {
        if (dailyMenus == null || dailyMenus.size() < 3) {
            return null;
        }
        ArrayList<DailyMenuModel> shuffledMenus = new ArrayList<>(dailyMenus);
        Collections.shuffle(shuffledMenus);
        return new ArrayList<>(shuffledMenus.subList(0, 3));
    }


    public String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date());
    }

    public DailyMenuModel getRandomDailyMenu(ArrayList<DailyMenuModel> dailyMenus) {
        if (dailyMenus == null || dailyMenus.isEmpty()) {
            return null;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(dailyMenus.size());
        return dailyMenus.get(randomIndex);
    }
}