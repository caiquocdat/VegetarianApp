package com.caiquocdat.vegetarian.data;

import com.caiquocdat.vegetarian.model.CookingStepModel;
import com.caiquocdat.vegetarian.model.DailyMenuModel;
import com.caiquocdat.vegetarian.model.DishModel;
import com.caiquocdat.vegetarian.model.IngredientModel;
import com.caiquocdat.vegetarian.model.MealTimeModel;

import java.util.ArrayList;
import java.util.Arrays;

public class DataInitializer {

    public static ArrayList<DailyMenuModel> initializeDailyMenus() {
        // Ingredients
        IngredientModel ingredient1 = new IngredientModel(1, "Đậu hủ", 1);
        IngredientModel ingredient2 = new IngredientModel(2, "Nước mắm", 1);
        IngredientModel ingredient3 = new IngredientModel(3, "Sả", 1);
        IngredientModel ingredient4 = new IngredientModel(4, "Nước lọc", 1);
        IngredientModel ingredient5 = new IngredientModel(5, "Nấm kim chi", 2);
        IngredientModel ingredient6 = new IngredientModel(6, "Nước lọc", 2);
        IngredientModel ingredient7 = new IngredientModel(7, "Gia vị", 2);
        IngredientModel ingredient8 = new IngredientModel(8, "Tỏi băm", 2);
        IngredientModel ingredient9 = new IngredientModel(9, "Nấm", 3);
        IngredientModel ingredient10 = new IngredientModel(10, "Tiêu", 3);
        IngredientModel ingredient11 = new IngredientModel(11, "Gia vị", 3);
        IngredientModel ingredient12 = new IngredientModel(12, "Nước", 3);
        IngredientModel ingredient13 = new IngredientModel(13, "Muối", 4);
        IngredientModel ingredient14 = new IngredientModel(14, "Dầu ăn", 4);
        IngredientModel ingredient15 = new IngredientModel(15, "Bí đỏ", 4);
        IngredientModel ingredient16 = new IngredientModel(16, "Nước", 4);
        IngredientModel ingredient17 = new IngredientModel(17, "Bún", 6);
        IngredientModel ingredient18 = new IngredientModel(18, "Cái phô mai", 6);
        IngredientModel ingredient19 = new IngredientModel(19, "Bắp", 7);
        IngredientModel ingredient20 = new IngredientModel(20, "Bột năng", 7);
        IngredientModel ingredient21 = new IngredientModel(21, "Rau mùi", 8);
        IngredientModel ingredient22 = new IngredientModel(22, "Cà chua", 8);
        IngredientModel ingredient23 = new IngredientModel(23, "Nước", 8);

        // Cooking Steps
        CookingStepModel step1 = new CookingStepModel(1, "Sơ chế các nguyên liệu", 1, 1);
        CookingStepModel step2 = new CookingStepModel(2, "Nêm gia vị", 2, 1);
        CookingStepModel step3 = new CookingStepModel(3, "Kho đậu hủ trong 5 phút", 3, 1);
        CookingStepModel step4 = new CookingStepModel(4, "Lấy ra đĩa và trang trí", 4, 1);
        CookingStepModel step5 = new CookingStepModel(5, "Sơ chế các nguyên liệu", 1, 2);
        CookingStepModel step6 = new CookingStepModel(6, "Xào nấm kim châm với bơ tỏi", 2, 2);
        CookingStepModel step7 = new CookingStepModel(7, "Cho thêm ít nước", 3, 2);
        CookingStepModel step8 = new CookingStepModel(8, "Cho thêm ít nước", 4, 2);
        CookingStepModel step9 = new CookingStepModel(9, "Sơ chế thịt gà", 1, 3);
        CookingStepModel step10 = new CookingStepModel(10, "Ướp nấm với gia vị", 2, 3);
        CookingStepModel step11 = new CookingStepModel(11, "Xào nấm trong 5 phút", 3, 3);
        CookingStepModel step12 = new CookingStepModel(12, "Thêm tiêu và nấu chín", 4, 3);
        CookingStepModel step13 = new CookingStepModel(13, "Chuẩn bị bí đỏ", 1, 4);
        CookingStepModel step14 = new CookingStepModel(14, "Nấu bí đỏ đến khi chín tới", 2, 4);
        CookingStepModel step15 = new CookingStepModel(15, "Thêm nước và gia vị", 3, 4);
        CookingStepModel step16 = new CookingStepModel(16, "Bật lửa nhỏ cho đến khi chín", 4, 4);
        CookingStepModel step17 = new CookingStepModel(17, "Sơ chế nguyên liệu", 1, 5);
        CookingStepModel step18 = new CookingStepModel(18, "Bỏ phô mai vào chảo đảo", 2, 5);
        CookingStepModel step19 = new CookingStepModel(19, "Bỏ bắp vào và để lửa nhỏ", 3, 5);
        CookingStepModel step20 = new CookingStepModel(20, "Đem ra đĩa và trang trí", 4, 5);
        CookingStepModel step21 = new CookingStepModel(21, "Chuẩn bị cà chua và rau mùi", 1, 6);
        CookingStepModel step22 = new CookingStepModel(22, "Xào cà chua với tỏi, hành", 2, 6);
        CookingStepModel step23 = new CookingStepModel(23, "Thêm nước và đun sôi", 3, 6);
        CookingStepModel step24 = new CookingStepModel(24, "Thêm rau mùi, gia vị và đun chín", 4, 6);




        // Dishes
        DishModel dish1 = new DishModel(1, "Đậu phụ mắm xả ớt", 1,"https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcTqg1fNEEIy5uTI6VWnMLYJ7OVEOq65n9D9AuCEdjj9fC4XZAPO", new ArrayList<>(Arrays.asList(ingredient1,ingredient2,ingredient3,ingredient4)), new ArrayList<>(Arrays.asList(step1,step2,step3)));
        DishModel dish2 = new DishModel(2, "Nấm kim châm xào", 2, "https://cdn.tgdd.vn/2021/04/CookProduct/1-1200x676-3.jpg",new ArrayList<>(Arrays.asList(ingredient5,ingredient6,ingredient7,ingredient8)), new ArrayList<>(Arrays.asList(step4,step5,step6,step7,step8)));
        DishModel dish3 = new DishModel(3, "Nấm kho tiêu", 3,"https://daynauan.info.vn/wp-content/uploads/2016/03/nam-rom-kho-tieu-ngon.jpg",new ArrayList<>(Arrays.asList(ingredient9,ingredient10,ingredient11,ingredient12)), new ArrayList<>(Arrays.asList(step9,step10,step11,step12)));
        DishModel dish4 = new DishModel(4, "Canh bí đỏ", 1, "https://img-global.cpcdn.com/recipes/16e200f0219a7b0e/1200x630cq70/photo.jpg",new ArrayList<>(Arrays.asList(ingredient13,ingredient14,ingredient15,ingredient16)), new ArrayList<>(Arrays.asList(step13,step14,step15,step16)));
        DishModel dish5 = new DishModel(5, "Phô mai bắp xào", 2, "https://cdn.tgdd.vn/2021/08/CookProduct/thumbcn-1200x676-14.jpg", new ArrayList<>(Arrays.asList(ingredient17, ingredient18, ingredient19, ingredient20)), new ArrayList<>(Arrays.asList(step17, step18,step19,step20)));
        DishModel dish6 = new DishModel(6, "Canh cà chua rau mùi", 3, "https://cdn.tgdd.vn/Files/2018/09/05/1115250/3-cach-nau-canh-ca-chua-trung-bo-duong-cho-bua-com-gia-dinh-202205231518387644.jpg", new ArrayList<>(Arrays.asList(ingredient21, ingredient22,ingredient23)), new ArrayList<>(Arrays.asList(step21, step22, step23, step24)));

        // Meal Times for Day 1
        MealTimeModel breakfast1 = new MealTimeModel(1, "Breakfast", 1, "Đậu phụ mắm xả ớt và canh bí đỏ, 2 món sẽ giúp cho bạn có ngày đầy năng luợng.");
        MealTimeModel lunch1 = new MealTimeModel(2, "Lunch", 1, "Nấm kim châm xào, giúp cho bạn có một bửa ăn đủ chất và ngon miệng.");
        MealTimeModel dinner1 = new MealTimeModel(3, "Dinner", 1, "Nấm kho tiêu, bạn có thể ăn kèm cùng với cơm hoặc mì.");
        DailyMenuModel dailyMenu1 = new DailyMenuModel(1, new ArrayList<>(Arrays.asList(breakfast1, lunch1, dinner1)),new ArrayList<>(Arrays.asList(dish1,dish2,dish4,dish3,dish5,dish6)));

        // Ingredients for Day 2
        IngredientModel ingredient24 = new IngredientModel(24, "Đậu phụ", 7);
        IngredientModel ingredient25 = new IngredientModel(25, "Rau cải", 7);
        IngredientModel ingredient26 = new IngredientModel(26, "Nước dùng chay", 7);
        IngredientModel ingredient27 = new IngredientModel(27, "Măng tây", 8);
        IngredientModel ingredient28 = new IngredientModel(28, "Nước mắm pha chay", 8);
        IngredientModel ingredient29 = new IngredientModel(29, "Cà chua", 9);
        IngredientModel ingredient30 = new IngredientModel(30, "Bún", 9);
        IngredientModel ingredient31 = new IngredientModel(31, "Cá chay", 10);
        IngredientModel ingredient32 = new IngredientModel(32, "Bột chiên xù", 10);
        IngredientModel ingredient33 = new IngredientModel(33, "Dầu ăn", 10);
        IngredientModel ingredient34 = new IngredientModel(34, "Nước mắm pha chay", 10);
        IngredientModel ingredient35 = new IngredientModel(35, "Bún", 11);
        IngredientModel ingredient36 = new IngredientModel(36, "Chả cá chay", 11);
        IngredientModel ingredient37 = new IngredientModel(37, "Rau sống", 11);
        IngredientModel ingredient38 = new IngredientModel(38, "Nước dùng chay", 11);
        IngredientModel ingredient39 = new IngredientModel(39, "Bánh tráng", 12);
        IngredientModel ingredient40 = new IngredientModel(40, "Rau sống", 12);
        IngredientModel ingredient41 = new IngredientModel(41, "Bún", 12);
        IngredientModel ingredient42 = new IngredientModel(42, "Đậu hủ", 12);
        IngredientModel ingredient43 = new IngredientModel(43, "Nước mắm pha chay", 12);
// Add more ingredients as needed...

// Cooking Steps for Day 2
        CookingStepModel step25 = new CookingStepModel(25, "Sơ chế đậu phụ và rau cải", 1, 7);
        CookingStepModel step26 = new CookingStepModel(26, "Xào đậu phụ và rau cải", 2, 7);
        CookingStepModel step27 = new CookingStepModel(27, "Thêm nước dùng chay và đun sôi", 3, 7);
        CookingStepModel step28 = new CookingStepModel(28, "Đun chín và trang trí", 4, 7);
        CookingStepModel step29 = new CookingStepModel(29, "Sơ chế măng tây", 1, 8);
        CookingStepModel step30 = new CookingStepModel(30, "Xào măng tây với nước mắm pha chay", 2, 8);
        CookingStepModel step31 = new CookingStepModel(31, "Trang trí và đem ra", 3, 8);
        CookingStepModel step32 = new CookingStepModel(32, "Sơ chế cà chua và bún", 1, 9);
        CookingStepModel step33 = new CookingStepModel(33, "Nấu cà chua", 2, 9);
        CookingStepModel step34 = new CookingStepModel(34, "Kết hợp bún và cà chua, đun chín", 3, 9);
        CookingStepModel step35 = new CookingStepModel(35, "Trang trí và đem ra", 4, 9);
        CookingStepModel step36 = new CookingStepModel(36, "Chuẩn bị cá chay", 1, 10);
        CookingStepModel step37 = new CookingStepModel(37, "Lăn cá trong bột chiên xù", 2, 10);
        CookingStepModel step38 = new CookingStepModel(38, "Chiên cá trong dầu nóng", 3, 10);
        CookingStepModel step39 = new CookingStepModel(39, "Pha nước mắm chay và đem ra", 4, 10);
        CookingStepModel step40 = new CookingStepModel(40, "Chuẩn bị bún và rau sống", 1, 11);
        CookingStepModel step41 = new CookingStepModel(41, "Đun nước dùng chay", 2, 11);
        CookingStepModel step42 = new CookingStepModel(42, "Kết hợp bún, chả cá, và rau sống", 3, 11);
        CookingStepModel step43 = new CookingStepModel(43, "Đem ra và trang trí", 4, 11);
        CookingStepModel step44 = new CookingStepModel(44, "Chuẩn bị nguyên liệu", 1, 12);
        CookingStepModel step45 = new CookingStepModel(45, "Làm mềm bánh tráng", 2, 12);
        CookingStepModel step46 = new CookingStepModel(46, "Lát rau, bún, và đậu hủ lên bánh tráng", 3, 12);
        CookingStepModel step47 = new CookingStepModel(47, "Cuốn chặt và cắt thành từng phần", 4, 12);
        // Add more steps as needed...

// Dishes for Day 2
        DishModel dish7 = new DishModel(7, "Đậu phụ xào cải chay", 1, "https://monchay.com/wp-content/uploads/2015/04/dau-phu-xao-rau-cu-1.jpg", new ArrayList<>(Arrays.asList(ingredient24, ingredient25, ingredient26)), new ArrayList<>(Arrays.asList(step25, step26, step27, step28)));
        DishModel dish8 = new DishModel(8, "Măng tây xào chay", 1, "https://cdn.tgdd.vn/Files/2020/10/03/1295705/cach-lam-mon-mang-tay-xao-nam-thom-ngon-chong-con-deu-thich-me-202109251726094412.jpg", new ArrayList<>(Arrays.asList(ingredient27, ingredient28)), new ArrayList<>(Arrays.asList(step29, step30, step31)));
        DishModel dish9 = new DishModel(9, "Bún cà chua chay", 2, "https://cdn.tgdd.vn/Files/2021/09/06/1380674/cach-lam-bun-chay-nam-sa-te-dau-hu-ca-chua-ngon-de-lam-tai-nha-202208251704112759.jpg", new ArrayList<>(Arrays.asList(ingredient29, ingredient30)), new ArrayList<>(Arrays.asList(step32, step33, step34, step35)));
        DishModel dish10 = new DishModel(10, "Chả cá chay", 2, "https://cdn.tgdd.vn/Files/2020/03/26/1244585/2-cach-lam-cha-ca-chay-thom-ngon-don-gian-de-lam--23-760x367.jpg", new ArrayList<>(Arrays.asList(ingredient31, ingredient32, ingredient33, ingredient34)), new ArrayList<>(Arrays.asList(step36, step37, step38, step39)));
        DishModel dish11 = new DishModel(11, "Bún chay", 3, "https://cdn.tgdd.vn/Files/2021/09/06/1380678/huong-dan-cach-lam-mon-bun-chay-don-gian-tai-nha-202109062036120311.jpg", new ArrayList<>(Arrays.asList(ingredient35, ingredient36, ingredient37, ingredient38)), new ArrayList<>(Arrays.asList(step40, step41, step42, step43)));
        DishModel dish12 = new DishModel(12, "Gỏi cuốn chay", 12, "https://cdn.tgdd.vn/Files/2021/01/09/1318999/chi-mat-10-phut-thoi-la-co-ngay-mon-bi-cuon-chay-ngon-khoai-khau-202101091151375743.jpg", new ArrayList<>(Arrays.asList(ingredient39, ingredient40, ingredient41, ingredient42, ingredient43)), new ArrayList<>(Arrays.asList(step44, step45, step46, step47)));
        // Add more dishes as needed...

// Meal Times for Day 2
        MealTimeModel breakfast2 = new MealTimeModel(4, "Breakfast", 2, "Đậu phụ xào cải chua và măng tây xào chay,bắt đầu ngày bằng hai món này còn gì bằng.");
        MealTimeModel lunch2 = new MealTimeModel(5, "Lunch", 2, "Lựa chọn món chay bún cà chua chay và chả cá chay ngon miệng cho bữa trưa.");
        MealTimeModel dinner2 = new MealTimeModel(6, "Dinner", 2, "Kết thúc ngày bằng món chay bún chay và gỏi cuốn chay đơn giản và ngon miệng.");
        DailyMenuModel dailyMenu2 = new DailyMenuModel(2, new ArrayList<>(Arrays.asList(breakfast2, lunch2, dinner2)), new ArrayList<>(Arrays.asList(dish7,dish8,dish9,dish10,dish11,dish12)));

        IngredientModel ingredient44 = new IngredientModel(44, "Bún riêu chay", 13);
        IngredientModel ingredient45 = new IngredientModel(45, "Tofu", 13);
        IngredientModel ingredient46 = new IngredientModel(46, "Mì chay", 14);
        IngredientModel ingredient47 = new IngredientModel(47, "Nấm", 14);
        IngredientModel ingredient48 = new IngredientModel(48, "Cơm", 15);
        IngredientModel ingredient49 = new IngredientModel(49, "Dầu dừa", 15);
        IngredientModel ingredient50 = new IngredientModel(50, "Gỏi chay", 16);
        IngredientModel ingredient51 = new IngredientModel(51, "Sữa đậu nành", 16);
        IngredientModel ingredient52 = new IngredientModel(52, "Phở chay", 17);
        IngredientModel ingredient53 = new IngredientModel(53, "Bánh mì chay", 17);
        CookingStepModel step48 = new CookingStepModel(48, "Chuẩn bị nguyên liệu", 1, 13);
        CookingStepModel step49 = new CookingStepModel(49, "Nấu bún riêu chay", 2, 13);
        CookingStepModel step50 = new CookingStepModel(50, "Thêm tofu và hạ lửa đợi chín", 3, 13);
        CookingStepModel step51 = new CookingStepModel(51, "Chuẩn bị nguyên liệu", 1, 14);
        CookingStepModel step52 = new CookingStepModel(52, "Nấu mì chay 5 phút và thêm nấm vào", 2, 14);
        CookingStepModel step53 = new CookingStepModel(53, "Đợi chín", 3, 14);
        CookingStepModel step54 = new CookingStepModel(54, "Rửa cơm và để ráo nước", 1, 15);
        CookingStepModel step55 = new CookingStepModel(55, "Nấu cơm với nước dừa, thêm muối", 2, 15);
        CookingStepModel step56 = new CookingStepModel(56, "Đợi cơm chín và trộn đều", 3, 15);
        CookingStepModel step57 = new CookingStepModel(57, "Chuẩn bị rau sống, đậu phụ, và các nguyên liệu khác", 1, 16);
        CookingStepModel step58 = new CookingStepModel(58, "Trộn các nguyên liệu với nước mắm pha chay", 2, 16);
        CookingStepModel step59 = new CookingStepModel(59, "Trang trí và đem ra", 3, 16);
        CookingStepModel step60 = new CookingStepModel(60, "Chuẩn bị nước dùng chay và gia vị", 1, 17);
        CookingStepModel step61 = new CookingStepModel(61, "Nấu nước dùng và gia vị đun sôi", 2, 17);
        CookingStepModel step62 = new CookingStepModel(62, "Đun bún, kết hợp bún và nước dùng chay, đem ra", 3, 17);
        CookingStepModel step63 = new CookingStepModel(63, "Chuẩn bị bánh mì và các lớp nhân", 1, 18);
        CookingStepModel step64 = new CookingStepModel(64, "Lắp ráp bánh mì với nhân chay", 2, 18);
        CookingStepModel step65 = new CookingStepModel(65, "Nướng bánh mì tới vàng giòn (nếu muốn) và đem ra", 3, 18);

        DishModel dish13 = new DishModel(13, "Bún riêu chay", 1, "https://cdn.tgdd.vn/2021/12/CookDish/cach-lam-bun-rieu-chay-don-gian-dam-da-le-vu-lan-avt-1200x676.jpg", new ArrayList<>(Arrays.asList(ingredient44, ingredient45)), new ArrayList<>(Arrays.asList(step48, step49, step50)));
        DishModel dish14 = new DishModel(14, "Mì chay với nấm", 1, "https://cdn.tgdd.vn/Files/2021/08/21/1376779/cach-lam-mi-xao-chay-thom-ngon-hap-dan-de-lam-tai-nha-202202151017590756.jpg", new ArrayList<>(Arrays.asList(ingredient46, ingredient47)), new ArrayList<>(Arrays.asList(step51, step52, step53)));
        DishModel dish15 = new DishModel(15, "Cơm dầu dừa", 2, "https://sohanews.sohacdn.com/zoom/640_360/2017/photo-1-1503044475316-0-0-388-626-crop-1503044501318.jpg", new ArrayList<>(Arrays.asList(ingredient48, ingredient49)), new ArrayList<>(Arrays.asList(step54, step55, step56)));
        DishModel dish16 = new DishModel(16, "Gỏi chay", 2, "https://cdn.tgdd.vn/Files/2022/03/08/1419049/tong-hop-10-mon-goi-chay-tuyet-dinh-thanh-mat-de-lam-tai-nha-202203081116042561.jpg", new ArrayList<>(Arrays.asList(ingredient50, ingredient51)), new ArrayList<>(Arrays.asList(step57, step58, step59)));
        DishModel dish17 = new DishModel(17, "Phở chay", 3, "https://cdn.tgdd.vn/2021/09/CookProduct/1200-1200x676-42.jpg", new ArrayList<>(Arrays.asList(ingredient52)), new ArrayList<>(Arrays.asList(step60, step61, step62)));
        DishModel dish18 = new DishModel(18, "Bánh mì chay", 3, "https://cdn.tgdd.vn/Files/2022/04/07/1424404/cach-lam-banh-mi-bi-chay-don-gian-tai-nha-an-mot-lan-la-ghien-202204070727437530.jpg", new ArrayList<>(Arrays.asList(ingredient53)), new ArrayList<>(Arrays.asList(step63, step64, step65)));

        MealTimeModel breakfast3 = new MealTimeModel(7, "Breakfast", 3, "Bắt đầu ngày mới với bún riêu chay và mì chay nấm.");
        MealTimeModel lunch3 = new MealTimeModel(8, "Lunch", 3, "Thưởng thức bữa trưa với cơm dầu dừa và gỏi chay.");
        MealTimeModel dinner3 = new MealTimeModel(9, "Dinner", 3, "Kết thúc ngày với phở chay và bánh mì chay ngon miệng.");
        DailyMenuModel dailyMenu3 = new DailyMenuModel(3, new ArrayList<>(Arrays.asList(breakfast3, lunch3, dinner3)), new ArrayList<>(Arrays.asList(dish13,dish14,dish15,dish16,dish17,dish18)));

        // Ingredients
        IngredientModel ingredient54 = new IngredientModel(54, "Bánh đa cua chay", 19);
        IngredientModel ingredient55 = new IngredientModel(55, "Cà chua", 19);
        IngredientModel ingredient56 = new IngredientModel(56, "Cơm chay", 20);
        IngredientModel ingredient57 = new IngredientModel(57, "Măng chua", 20);
        IngredientModel ingredient58 = new IngredientModel(58, "Salad chay", 21);
        IngredientModel ingredient59 = new IngredientModel(59, "Dầu ô liu", 21);
        IngredientModel ingredient60 = new IngredientModel(60, "Hủ tiếu chay", 22);
        IngredientModel ingredient61 = new IngredientModel(61, "Nước dừa chay", 22);
        IngredientModel ingredient62 = new IngredientModel(62, "Mì quảng chay", 23);
        IngredientModel ingredient63 = new IngredientModel(63, "Lá chanh", 23);

// Cooking Steps
        CookingStepModel step66 = new CookingStepModel(66, "Chuẩn bị nguyên liệu", 1, 19);
        CookingStepModel step67 = new CookingStepModel(67, "Nấu bánh đa cua chay", 2, 19);
        CookingStepModel step68 = new CookingStepModel(68, "Thêm cà chua và gia vị", 3, 19);
        CookingStepModel step69 = new CookingStepModel(69, "Chuẩn bị cơm chay và măng", 1, 20);
        CookingStepModel step70 = new CookingStepModel(70, "Nấu cơm chay với măng", 2, 20);
        CookingStepModel step71 = new CookingStepModel(71, "Trang trí và đem ra", 3, 20);
        CookingStepModel step72 = new CookingStepModel(72, "Chuẩn bị salad chay", 1, 21);
        CookingStepModel step73 = new CookingStepModel(73, "Trộn salad chay với dầu ô liu", 2, 21);
        CookingStepModel step74 = new CookingStepModel(74, "Trang trí và đem ra", 3, 21);
        CookingStepModel step75 = new CookingStepModel(75, "Chuẩn bị hủ tiếu chay", 1, 22);
        CookingStepModel step76 = new CookingStepModel(76, "Nấu hủ tiếu chay", 2, 22);
        CookingStepModel step77 = new CookingStepModel(77, "Thêm nước dừa chay và đem ra", 3, 22);
        CookingStepModel step78 = new CookingStepModel(78, "Chuẩn bị mì quảng chay", 1, 23);
        CookingStepModel step79 = new CookingStepModel(79, "Nấu mì quảng chay", 2, 23);
        CookingStepModel step80 = new CookingStepModel(80, "Thêm lá chanh và đem ra", 3, 23);

// Dishes
        DishModel dish19 = new DishModel(19, "Bánh đa cua chay", 1, "https://vanduchay.com/wp-content/uploads/2021/06/129-BanhDaDo.jpg", new ArrayList<>(Arrays.asList(ingredient54, ingredient55)), new ArrayList<>(Arrays.asList(step66, step67, step68)));
        DishModel dish20 = new DishModel(20, "Cơm chay măng", 1, "https://cdn.tgdd.vn/2021/06/CookProduct/Untitled-1-1200x676-12.jpg", new ArrayList<>(Arrays.asList(ingredient56, ingredient57)), new ArrayList<>(Arrays.asList(step69, step70, step71)));
        DishModel dish21 = new DishModel(21, "Salad chay", 2, "https://cdn.tgdd.vn/Files/2020/09/01/1285897/mach-ban-5-cach-lam-salad-chay-thom-ngon-de-thuc-hien-202112291715052565.jpg", new ArrayList<>(Arrays.asList(ingredient58, ingredient59)), new ArrayList<>(Arrays.asList(step72, step73, step74)));
        DishModel dish22 = new DishModel(22, "Hủ tiếu chay", 2, "https://cdn.tgdd.vn/2021/07/CookProduct/HutieuNamVangchay-1200x676.jpg", new ArrayList<>(Arrays.asList(ingredient60, ingredient61)), new ArrayList<>(Arrays.asList(step75, step76, step77)));
        DishModel dish23 = new DishModel(23, "Mì quảng chay", 3, "https://beptruong.edu.vn/wp-content/uploads/2022/10/mi-quang-chay-voi-vi-thanh-dam.jpg", new ArrayList<>(Arrays.asList(ingredient62, ingredient63)), new ArrayList<>(Arrays.asList(step78, step79, step80)));

// Meal Times
        MealTimeModel breakfast4 = new MealTimeModel(10, "Breakfast", 4, "Bắt đầu ngày mới với bánh đa cua chay và cơm chay măng.");
        MealTimeModel lunch4 = new MealTimeModel(11, "Lunch", 4, "Thưởng thức bữa trưa với salad chay và hủ tiếu chay.");
        MealTimeModel dinner4 = new MealTimeModel(12, "Dinner", 4, "Kết thúc ngày với mì quảng chay.");

// Daily Menu
        DailyMenuModel dailyMenu4 = new DailyMenuModel(4, new ArrayList<>(Arrays.asList(breakfast4, lunch4, dinner4)), new ArrayList<>(Arrays.asList(dish19, dish20, dish21, dish22, dish23)));

        // Ingredients
        IngredientModel ingredient64 = new IngredientModel(64, "Cháo yến mạch chay", 24);
        IngredientModel ingredient65 = new IngredientModel(65, "Hạt chia", 24);
        IngredientModel ingredient66 = new IngredientModel(66, "Dâu tây", 24);
        IngredientModel ingredient67 = new IngredientModel(67, "Mì xào chay", 25);
        IngredientModel ingredient68 = new IngredientModel(68, "Rau cải", 25);
        IngredientModel ingredient69 = new IngredientModel(69, "Hành tây", 25);
        IngredientModel ingredient70 = new IngredientModel(70, "Bún chả cá chay", 26);
        IngredientModel ingredient71 = new IngredientModel(71, "Nước mắm pha chay", 26);
        IngredientModel ingredient72 = new IngredientModel(72, "Cá chay", 26);
        IngredientModel ingredient73 = new IngredientModel(73, "Salad hoa quả chay", 27);
        IngredientModel ingredient74 = new IngredientModel(74, "Nước ép cam", 27);
        IngredientModel ingredient75 = new IngredientModel(75, "Quả lựu", 27);
        IngredientModel ingredient76 = new IngredientModel(76, "Phở xào chay", 28);
        IngredientModel ingredient77 = new IngredientModel(77, "Tảo spirulina", 28);
        IngredientModel ingredient78 = new IngredientModel(78, "Rau thơm", 28);
        IngredientModel ingredient79 = new IngredientModel(79, "Bún bò Huế chay", 29);
        IngredientModel ingredient80 = new IngredientModel(80, "Chả lụa chay", 29);
        IngredientModel ingredient81 = new IngredientModel(81, "Nấm hương", 29);

// Cooking Steps
        CookingStepModel step81 = new CookingStepModel(81, "Chuẩn bị yến mạch, hạt chia và dâu", 1, 24);
        CookingStepModel step82 = new CookingStepModel(82, "Nấu cháo yến mạch chay", 2, 24);
        CookingStepModel step83 = new CookingStepModel(83, "Trang trí với dâu và đem ra", 3, 24);
        CookingStepModel step84 = new CookingStepModel(84, "Chuẩn bị mì và rau cải", 1, 25);
        CookingStepModel step85 = new CookingStepModel(85, "Xào mì chay với rau", 2, 25);
        CookingStepModel step86 = new CookingStepModel(86, "Trang trí và đem ra", 3, 25);
        CookingStepModel step87 = new CookingStepModel(87, "Chuẩn bị bún và cá chay", 1, 26);
        CookingStepModel step88 = new CookingStepModel(88, "Nấu bún chả cá chay", 2, 26);
        CookingStepModel step89 = new CookingStepModel(89, "Trang trí và đem ra", 3, 26);
        CookingStepModel step90 = new CookingStepModel(90, "Chuẩn bị salad hoa quả chay", 1, 27);
        CookingStepModel step91 = new CookingStepModel(91, "Trộn salad hoa quả chay", 2, 27);
        CookingStepModel step92 = new CookingStepModel(92, "Trang trí và đem ra", 3, 27);
        CookingStepModel step93 = new CookingStepModel(93, "Chuẩn bị phở và tảo spirulina", 1, 28);
        CookingStepModel step94 = new CookingStepModel(94, "Xào phở chay với tảo", 2, 28);
        CookingStepModel step95 = new CookingStepModel(95, "Trang trí và đem ra", 3, 28);
        CookingStepModel step96 = new CookingStepModel(96, "Chuẩn bị bún và chả lụa chay", 1, 29);
        CookingStepModel step97 = new CookingStepModel(97, "Nấu bún bò Huế chay", 2, 29);
        CookingStepModel step98 = new CookingStepModel(98, "Trang trí và đem ra", 3, 29);

// Dishes
        DishModel dish24 = new DishModel(24, "Cháo yến mạch chay", 1, "https://cdn.tgdd.vn/2020/07/CookProduct/Untitled-3-1200x676-15.jpg", new ArrayList<>(Arrays.asList(ingredient64, ingredient65, ingredient66)), new ArrayList<>(Arrays.asList(step81, step82, step83)));
        DishModel dish25 = new DishModel(25, "Mì xào chay", 1, "https://cdn.tgdd.vn/Files/2021/08/21/1376779/cach-lam-mi-xao-chay-thom-ngon-hap-dan-de-lam-tai-nha-202202151017590756.jpg", new ArrayList<>(Arrays.asList(ingredient67, ingredient68, ingredient69)), new ArrayList<>(Arrays.asList(step84, step85, step86)));
        DishModel dish26 = new DishModel(26, "Bún chả cá chay", 2, "https://cdn.tgdd.vn/2021/12/CookDish/2-cach-nau-bun-cha-ca-la-mieng-thom-ngon-don-gian-de-lam-avt-1200x676-1.jpg", new ArrayList<>(Arrays.asList(ingredient70, ingredient71, ingredient72)), new ArrayList<>(Arrays.asList(step87, step88, step89)));
        DishModel dish27 = new DishModel(27, "Salad hoa quả chay", 2, "https://cdn.tgdd.vn/Files/2020/09/01/1285897/mach-ban-5-cach-lam-salad-chay-thom-ngon-de-thuc-hien-202112291715052565.jpg", new ArrayList<>(Arrays.asList(ingredient73, ingredient74, ingredient75)), new ArrayList<>(Arrays.asList(step90, step91, step92)));
        DishModel dish28 = new DishModel(28, "Phở xào chay", 3, "https://www.huongnghiepaau.com/wp-content/uploads/2019/01/pho-xao-chay.jpg", new ArrayList<>(Arrays.asList(ingredient76, ingredient77, ingredient78)), new ArrayList<>(Arrays.asList(step93, step94, step95)));
        DishModel dish29 = new DishModel(29, "Bún bò Huế chay", 3, "https://cdn.tgdd.vn/Files/2020/04/27/1252124/cach-nau-bun-bo-hue-chay-thom-ngon-thanh-dam-dam-3-760x367.jpg", new ArrayList<>(Arrays.asList(ingredient79, ingredient80, ingredient81)), new ArrayList<>(Arrays.asList(step96, step97, step98)));

// Meal Times
        MealTimeModel breakfast5 = new MealTimeModel(13, "Breakfast", 5, "Bắt đầu ngày mới với cháo yến mạch chay và mì xào chay.");
        MealTimeModel lunch5 = new MealTimeModel(14, "Lunch", 5, "Thưởng thức bữa trưa với bún chả cá chay và salad hoa quả chay.");
        MealTimeModel dinner5 = new MealTimeModel(15, "Dinner", 5, "Kết thúc ngày với phở xào chay và bún bò Huế chay.");

// Daily Menu
        DailyMenuModel dailyMenu5 = new DailyMenuModel(5, new ArrayList<>(Arrays.asList(breakfast5, lunch5, dinner5)), new ArrayList<>(Arrays.asList(dish24, dish25, dish26, dish27, dish28, dish29)));

        // Ingredients
        IngredientModel ingredient82 = new IngredientModel(82, "Bánh mì chay", 33);
        IngredientModel ingredient83 = new IngredientModel(83, "Chả cá chay", 33);
        IngredientModel ingredient84 = new IngredientModel(84, "Rau sống", 33);
        IngredientModel ingredient85 = new IngredientModel(85, "Cơm nắm chay", 34);
        IngredientModel ingredient86 = new IngredientModel(86, "Mè", 34);
        IngredientModel ingredient87 = new IngredientModel(87, "Gỏi", 34);
        IngredientModel ingredient88 = new IngredientModel(88, "Mì hoành thánh chay", 35);
        IngredientModel ingredient89 = new IngredientModel(89, "Nấm", 35);
        IngredientModel ingredient90 = new IngredientModel(90, "Hành", 35);
        IngredientModel ingredient91 = new IngredientModel(91, "Dầu hào chay", 35);
        IngredientModel ingredient92 = new IngredientModel(92, "Bánh bao chay", 36);
        IngredientModel ingredient93 = new IngredientModel(93, "Nhân đậu xanh", 36);
        IngredientModel ingredient94 = new IngredientModel(94, "Sữa đậu nành", 36);
        IngredientModel ingredient95 = new IngredientModel(95, "Cháo đậu đen chay", 37);
        IngredientModel ingredient96 = new IngredientModel(96, "Đường nâu", 37);
        IngredientModel ingredient97 = new IngredientModel(97, "Mè đen", 37);
        IngredientModel ingredient98 = new IngredientModel(98, "Gỏi cuốn chay", 38);
        IngredientModel ingredient99 = new IngredientModel(99, "Bún", 38);
        IngredientModel ingredient100 = new IngredientModel(100, "Măng chua", 38);
        IngredientModel ingredient101 = new IngredientModel(101, "Sốt hành tỏi", 38);

// Cooking Steps
        CookingStepModel step99 = new CookingStepModel(99, "Chuẩn bị bánh mì, chả cá, rau sống", 1, 33);
        CookingStepModel step100 = new CookingStepModel(100, "Xếp chả cá lên bánh mì", 2, 33);
        CookingStepModel step101 = new CookingStepModel(101, "Trang trí và đem ra", 3, 33);
        CookingStepModel step102 = new CookingStepModel(102, "Chuẩn bị cơm nắm, mè, gỏi", 1, 34);
        CookingStepModel step103 = new CookingStepModel(103, "Làm cơm nắm chay", 2, 34);
        CookingStepModel step104 = new CookingStepModel(104, "Trang trí và đem ra", 3, 34);
        CookingStepModel step105 = new CookingStepModel(105, "Chuẩn bị mì, nấm, hành", 1, 35);
        CookingStepModel step106 = new CookingStepModel(106, "Nấu mì hoành thánh chay", 2, 35);
        CookingStepModel step107 = new CookingStepModel(107, "Trang trí và đem ra", 3, 35);
        CookingStepModel step108 = new CookingStepModel(108, "Chuẩn bị bánh bao, nhân đậu xanh, sữa đậu nành", 1, 36);
        CookingStepModel step109 = new CookingStepModel(109, "Làm bánh bao chay", 2, 36);
        CookingStepModel step110 = new CookingStepModel(110, "Hấp và đem ra", 3, 36);
        CookingStepModel step111 = new CookingStepModel(111, "Chuẩn bị đậu đen, đường nâu, mè đen", 1, 37);
        CookingStepModel step112 = new CookingStepModel(112, "Nấu cháo đậu đen chay", 2, 37);
        CookingStepModel step113 = new CookingStepModel(113, "Trang trí và đem ra", 3, 37);
        CookingStepModel step114 = new CookingStepModel(114, "Chuẩn bị bún, măng chua, sốt hành tỏi", 1, 38);
        CookingStepModel step115 = new CookingStepModel(115, "Cuốn gỏi cuốn chay", 2, 38);
        CookingStepModel step116 = new CookingStepModel(116, "Trang trí và đem ra", 3, 38);

// Dishes
        // Dishes
        DishModel dish33 = new DishModel(33, "Bánh mì chả cá chay", 1, "https://xebanhmithonhiky.vn/wp-content/uploads/2019/03/Banh_mi_cha_ca_FILEminimizer-768x768.jpg", new ArrayList<>(Arrays.asList(ingredient82, ingredient83, ingredient84)), new ArrayList<>(Arrays.asList(step99, step100, step101)));
        DishModel dish34 = new DishModel(34, "Cơm nắm chay", 1, "https://ngonbonmua.com/wp-content/uploads/2016/12/mon-chay-com-nam-nhat-ban-origini.jpg", new ArrayList<>(Arrays.asList(ingredient85, ingredient86, ingredient87)), new ArrayList<>(Arrays.asList(step102, step103, step104)));
        DishModel dish35 = new DishModel(35, "Mì hoành thánh chay", 2, "https://cdn.tgdd.vn/2021/07/CookProduct/Hutieuhoanhthanhchay-1200x676.jpg", new ArrayList<>(Arrays.asList(ingredient88, ingredient89, ingredient90, ingredient91)), new ArrayList<>(Arrays.asList(step105, step106, step107)));
        DishModel dish36 = new DishModel(36, "Bánh bao chay", 2, "https://cdn.tgdd.vn/Files/2020/04/21/1250758/cach-lam-banh-bao-chay-co-nhan-thom-ngon-don-gian--19-760x367.jpg", new ArrayList<>(Arrays.asList(ingredient92, ingredient93, ingredient94)), new ArrayList<>(Arrays.asList(step108, step109, step110)));
        DishModel dish37 = new DishModel(37, "Cháo đậu đen chay", 3, "https://chaosach.com/wp-content/uploads/2021/10/chao-chay-tu-dau-den-862x478.jpg", new ArrayList<>(Arrays.asList(ingredient95, ingredient96, ingredient97)), new ArrayList<>(Arrays.asList(step111, step112, step113)));
        DishModel dish38 = new DishModel(38, "Gỏi cuốn chay", 3, "https://cdn.tgdd.vn/2022/01/CookDish/3-cach-lam-goi-cuon-chay-dinh-duong-ngon-mieng-avt-1200x676-1.jpg", new ArrayList<>(Arrays.asList(ingredient98, ingredient99, ingredient100, ingredient101)), new ArrayList<>(Arrays.asList(step114, step115, step116)));


// Meal Times
        MealTimeModel breakfast6 = new MealTimeModel(16, "Breakfast", 6, "Bắt đầu ngày mới với bánh mì chả cá chay và cơm nắm chay.");
        MealTimeModel lunch6 = new MealTimeModel(17, "Lunch", 6, "Thưởng thức bữa trưa với mì hoành thánh chay và bánh bao chay.");
        MealTimeModel dinner6 = new MealTimeModel(18, "Dinner", 6, "Kết thúc ngày với cháo đậu đen chay và gỏi cuốn chay.");

// Daily Menu
        DailyMenuModel dailyMenu6 = new DailyMenuModel(6, new ArrayList<>(Arrays.asList(breakfast6, lunch6, dinner6)), new ArrayList<>(Arrays.asList(dish33, dish34, dish35, dish36, dish37, dish38)));

        // Ingredients
        IngredientModel ingredient102 = new IngredientModel(102, "Bún chay", 39);
        IngredientModel ingredient103 = new IngredientModel(103, "Nước dùng chay", 39);
        IngredientModel ingredient104 = new IngredientModel(104, "Rau cải", 39);
        IngredientModel ingredient105 = new IngredientModel(105, "Đậu phụ xào", 40);
        IngredientModel ingredient106 = new IngredientModel(106, "Cơm gạo lứt", 40);
        IngredientModel ingredient107 = new IngredientModel(107, "Măng chua cay", 40);
        IngredientModel ingredient108 = new IngredientModel(108, "Mì xào chay", 41);
        IngredientModel ingredient109 = new IngredientModel(109, "Cải xào", 41);
        IngredientModel ingredient110 = new IngredientModel(110, "Chả cá chay", 41);
        IngredientModel ingredient111 = new IngredientModel(111, "Bánh chưng chay", 42);
        IngredientModel ingredient112 = new IngredientModel(112, "Dưa món", 42);
        IngredientModel ingredient113 = new IngredientModel(113, "Nước mắm pha chay", 42);
        IngredientModel ingredient114 = new IngredientModel(114, "Cháo quẩy chay", 43);
        IngredientModel ingredient115 = new IngredientModel(115, "Hành phi", 43);
        IngredientModel ingredient116 = new IngredientModel(116, "Gừng tươi", 43);
        IngredientModel ingredient117 = new IngredientModel(117, "Bánh canh chay", 44);
        IngredientModel ingredient118 = new IngredientModel(118, "Tảo spirulina", 44);
        IngredientModel ingredient119 = new IngredientModel(119, "Rau muống", 44);

// Cooking Steps
        CookingStepModel step117 = new CookingStepModel(117, "Chuẩn bị bún, nước dùng, rau cải", 1, 39);
        CookingStepModel step118 = new CookingStepModel(118, "Nấu bún chay", 2, 39);
        CookingStepModel step119 = new CookingStepModel(119, "Trang trí và đem ra", 3, 39);
        CookingStepModel step120 = new CookingStepModel(120, "Chuẩn bị đậu phụ, cơm, măng", 1, 40);
        CookingStepModel step121 = new CookingStepModel(121, "Làm đậu phụ xào cơm gạo lứt", 2, 40);
        CookingStepModel step122 = new CookingStepModel(122, "Trang trí và đem ra", 3, 40);
        CookingStepModel step123 = new CookingStepModel(123, "Chuẩn bị mì, cải, chả cá", 1, 41);
        CookingStepModel step124 = new CookingStepModel(124, "Nấu mì xào chay", 2, 41);
        CookingStepModel step125 = new CookingStepModel(125, "Trang trí và đem ra", 3, 41);
        CookingStepModel step126 = new CookingStepModel(126, "Chuẩn bị bánh chưng, dưa món, nước mắm", 1, 42);
        CookingStepModel step127 = new CookingStepModel(127, "Làm bánh chưng chay", 2, 42);
        CookingStepModel step128 = new CookingStepModel(128, "Trang trí và đem ra", 3, 42);
        CookingStepModel step129 = new CookingStepModel(129, "Chuẩn bị quẩy, hành, gừng", 1, 43);
        CookingStepModel step130 = new CookingStepModel(130, "Nấu cháo quẩy chay", 2, 43);
        CookingStepModel step131 = new CookingStepModel(131, "Trang trí và đem ra", 3, 43);
        CookingStepModel step132 = new CookingStepModel(132, "Chuẩn bị bánh canh, tảo, rau", 1, 44);
        CookingStepModel step133 = new CookingStepModel(133, "Nấu bánh canh chay", 2, 44);
        CookingStepModel step134 = new CookingStepModel(134, "Trang trí và đem ra", 3, 44);

// Dishes
        DishModel dish39 = new DishModel(39, "Bún chay", 1, "https://cdn.tgdd.vn/2021/02/CookProduct/1111-1200x676-3.jpg", new ArrayList<>(Arrays.asList(ingredient102, ingredient103, ingredient104)), new ArrayList<>(Arrays.asList(step117, step118, step119)));
        DishModel dish40 = new DishModel(40, "Đậu phụ xào cơm gạo lứt", 1, "https://ttol.vietnamnetjsc.vn/images/2021/03/04/15/00/ca-ri-dau-hu-9.jpg", new ArrayList<>(Arrays.asList(ingredient105, ingredient106, ingredient107)), new ArrayList<>(Arrays.asList(step120, step121, step122)));
        DishModel dish41 = new DishModel(41, "Mì xào chay", 2, "https://cdn.tgdd.vn/Files/2021/08/21/1376779/cach-lam-mi-xao-chay-thom-ngon-hap-dan-de-lam-tai-nha-202202151017590756.jpg", new ArrayList<>(Arrays.asList(ingredient108, ingredient109, ingredient110)), new ArrayList<>(Arrays.asList(step123, step124, step125)));
        DishModel dish42 = new DishModel(42, "Bánh chưng chay", 2, "https://product.hstatic.net/1000193453/product/banh-chung-chay-3_5f221d2126a040038d3c6dd7b3def337_master.jpg", new ArrayList<>(Arrays.asList(ingredient111, ingredient112, ingredient113)), new ArrayList<>(Arrays.asList(step126, step127, step128)));
        DishModel dish43 = new DishModel(43, "Cháo quẩy chay", 3, "https://cdn.yeutre.vn/medias/uploads/165/165822-chao-chay.jpg", new ArrayList<>(Arrays.asList(ingredient114, ingredient115, ingredient116)), new ArrayList<>(Arrays.asList(step129, step130, step131)));
        DishModel dish44 = new DishModel(44, "Bánh canh chay", 3, "https://daylambanh.edu.vn/wp-content/uploads/2017/11/cach-nau-banh-canh-chay.jpg", new ArrayList<>(Arrays.asList(ingredient117, ingredient118, ingredient119)), new ArrayList<>(Arrays.asList(step132, step133, step134)));


// Meal Times
        MealTimeModel breakfast7 = new MealTimeModel(19, "Breakfast", 7, "Bắt đầu ngày mới với bún chay và đậu phụ xào cơm gạo lứt. Tôi cần bạn tạo thêm 1 ngày nữa như vậy giúp tôi, với tất cả tên món ăn và nguyên liệu đều mới.");
        MealTimeModel lunch7 = new MealTimeModel(20, "Lunch", 7, "Thưởng thức mì xào chay, bánh chưng chay thú vị.");
        MealTimeModel dinner7 = new MealTimeModel(21, "Dinner", 7, "Kết thúc ngày với cháo quẩy chay và bánh canh chay dễ chế biến.");
        DailyMenuModel dailyMenu7 = new DailyMenuModel(8, new ArrayList<>(Arrays.asList(breakfast7, lunch7, dinner7)), new ArrayList<>(Arrays.asList(dish39, dish40, dish41, dish42, dish43, dish44)));

        IngredientModel ingredient120 = new IngredientModel(120, "Cơm nấu sả chay", 45);
        IngredientModel ingredient121 = new IngredientModel(121, "Cà tím nướng", 45);
        IngredientModel ingredient122 = new IngredientModel(122, "Nước sốt me chay", 45);
        IngredientModel ingredient123 = new IngredientModel(123, "Bánh đa cuốn chay", 46);
        IngredientModel ingredient124 = new IngredientModel(124, "Rau sống tươi ngon", 46);
        IngredientModel ingredient125 = new IngredientModel(125, "Nước chấm hoa hồng", 46);
        IngredientModel ingredient126 = new IngredientModel(126, "Mì quảng chay", 47);
        IngredientModel ingredient127 = new IngredientModel(127, "Nước dùng chay đặc biệt", 47);
        IngredientModel ingredient128 = new IngredientModel(128, "Tảo biển khô", 47);
        IngredientModel ingredient129 = new IngredientModel(129, "Chè sen chay", 48);
        IngredientModel ingredient130 = new IngredientModel(130, "Đường phèn", 48);
        IngredientModel ingredient131 = new IngredientModel(131, "Nước cốt dừa", 48);
        IngredientModel ingredient132 = new IngredientModel(132, "Gỏi bún chay", 49);
        IngredientModel ingredient133 = new IngredientModel(133, "Nước mắm chay", 49);
        IngredientModel ingredient134 = new IngredientModel(134, "Dầu hào chay", 49);
        IngredientModel ingredient135 = new IngredientModel(135, "Cháo nấm chay", 50);
        IngredientModel ingredient136 = new IngredientModel(136, "Nấm linh chi", 50);
        IngredientModel ingredient137 = new IngredientModel(137, "Rau mùi tươi", 50);

// Cooking Steps
        CookingStepModel step135 = new CookingStepModel(135, "Chuẩn bị cơm, cà tím, sốt me", 1, 45);
        CookingStepModel step136 = new CookingStepModel(136, "Nấu cơm nấu sả chay", 2, 45);
        CookingStepModel step137 = new CookingStepModel(137, "Trang trí và đem ra", 3, 45);
        CookingStepModel step138 = new CookingStepModel(138, "Chuẩn bị bánh đa, rau sống, nước chấm", 1, 46);
        CookingStepModel step139 = new CookingStepModel(139, "Cuốn bánh đa chay", 2, 46);
        CookingStepModel step140 = new CookingStepModel(140, "Trang trí và đem ra", 3, 46);
        CookingStepModel step141 = new CookingStepModel(141, "Chuẩn bị mì, nước dùng, tảo biển", 1, 47);
        CookingStepModel step142 = new CookingStepModel(142, "Nấu mì quảng chay", 2, 47);
        CookingStepModel step143 = new CookingStepModel(143, "Trang trí và đem ra", 3, 47);
        CookingStepModel step144 = new CookingStepModel(144, "Chuẩn bị chè sen, đường, nước cốt dừa", 1, 48);
        CookingStepModel step145 = new CookingStepModel(145, "Nấu chè sen chay", 2, 48);
        CookingStepModel step146 = new CookingStepModel(146, "Trang trí và đem ra", 3, 48);
        CookingStepModel step147 = new CookingStepModel(147, "Chuẩn bị gỏi bún, nước mắm, dầu hào", 1, 49);
        CookingStepModel step148 = new CookingStepModel(148, "Làm gỏi bún chay", 2, 49);
        CookingStepModel step149 = new CookingStepModel(149, "Trang trí và đem ra", 3, 49);
        CookingStepModel step150 = new CookingStepModel(150, "Chuẩn bị nấm, rau mùi", 1, 50);
        CookingStepModel step151 = new CookingStepModel(151, "Nấu cháo nấm chay", 2, 50);
        CookingStepModel step152 = new CookingStepModel(152, "Trang trí và đem ra", 3, 50);

// Dishes
        DishModel dish45 = new DishModel(45, "Cơm nấu sả chay", 1, "https://cdn.tgdd.vn/Files/2020/04/17/1249670/2-cach-lam-com-chien-chay-voi-sa-muoi-ot-don-gian-thom-ngon-la-mieng-18-760x367.jpg", new ArrayList<>(Arrays.asList(ingredient120, ingredient121, ingredient122)), new ArrayList<>(Arrays.asList(step135, step136, step137)));
        DishModel dish46 = new DishModel(46, "Bánh đa cuốn chay", 1, "https://hitavegan.com/wp-content/uploads/2019/09/hita-chay-cach-lam-goi-cuon-chay-5.jpg", new ArrayList<>(Arrays.asList(ingredient123, ingredient124, ingredient125)), new ArrayList<>(Arrays.asList(step138, step139, step140)));
        DishModel dish47 = new DishModel(47, "Mì quảng chay", 2, "https://beptruong.edu.vn/wp-content/uploads/2022/10/mi-quang-chay-voi-vi-thanh-dam.jpg", new ArrayList<>(Arrays.asList(ingredient126, ingredient127, ingredient128)), new ArrayList<>(Arrays.asList(step141, step142, step143)));
        DishModel dish48 = new DishModel(48, "Chè sen chay", 2, "https://cdn.tgdd.vn/2021/04/CookProduct/Cachnauchehatsennamtuyetthomngonboduongchocanha0-36screenshot(1)-1200x676.jpg", new ArrayList<>(Arrays.asList(ingredient129, ingredient130, ingredient131)), new ArrayList<>(Arrays.asList(step144, step145, step146)));
        DishModel dish49 = new DishModel(49, "Gỏi bún chay", 3, "https://cdn.tgdd.vn/2021/02/CookProduct/1111-1200x676-3.jpg", new ArrayList<>(Arrays.asList(ingredient132, ingredient133, ingredient134)), new ArrayList<>(Arrays.asList(step147, step148, step149)));
        DishModel dish50 = new DishModel(50, "Cháo nấm chay", 3, "https://cdn.tgdd.vn/2020/09/CookRecipe/Avatar/chao-nam-chay-thumbnail.jpg", new ArrayList<>(Arrays.asList(ingredient135, ingredient136, ingredient137)), new ArrayList<>(Arrays.asList(step150, step151, step152)));

// Meal Times
        MealTimeModel breakfast8 = new MealTimeModel(20, "Breakfast", 8, "Ngày mới với cơm nấu sả chay và bánh đa cuốn chay thơm ngon.");
        MealTimeModel lunch8 = new MealTimeModel(21, "Lunch", 8, "Thưởng thức mì quảng chay, chè sen chay thú vị.");
        MealTimeModel dinner8 = new MealTimeModel(22, "Dinner", 8, "Kết thúc ngày với gỏi bún chay và cháo nấm chay dễ chế biến.");

// Day Plan
        DailyMenuModel dailyMenu8 = new DailyMenuModel(8, new ArrayList<>(Arrays.asList(breakfast8, lunch8, dinner8)), new ArrayList<>(Arrays.asList(dish45, dish46, dish47, dish48, dish49, dish50)));
        // Ingredients
        IngredientModel ingredient138 = new IngredientModel(138, "Bún ốc chua chay", 51);
        IngredientModel ingredient139 = new IngredientModel(139, "Ốc chua chay", 51);
        IngredientModel ingredient140 = new IngredientModel(140, "Rau sống", 51);
        IngredientModel ingredient141 = new IngredientModel(141, "Bún măng chua cay chay", 52);
        IngredientModel ingredient142 = new IngredientModel(142, "Măng chua cay", 52);
        IngredientModel ingredient143 = new IngredientModel(143, "Nước dùng chay", 52);
        IngredientModel ingredient144 = new IngredientModel(144, "Cái lương xào nấm", 53);
        IngredientModel ingredient145 = new IngredientModel(145, "Cái lương chay", 53);
        IngredientModel ingredient146 = new IngredientModel(146, "Nấm tươi", 53);
        IngredientModel ingredient147 = new IngredientModel(147, "Khoai môn hấp mật ong chay", 54);
        IngredientModel ingredient148 = new IngredientModel(148, "Khoai môn", 54);
        IngredientModel ingredient149 = new IngredientModel(149, "Mật ong chay", 54);
        IngredientModel ingredient150 = new IngredientModel(150, "Bún riêu chay", 55);
        IngredientModel ingredient151 = new IngredientModel(151, "Riêu chay", 55);
        IngredientModel ingredient152 = new IngredientModel(152, "Cà chua", 55);
        IngredientModel ingredient153 = new IngredientModel(153, "Salad khoai tây chay", 56);
        IngredientModel ingredient154 = new IngredientModel(154, "Khoai tây", 56);
        IngredientModel ingredient155 = new IngredientModel(155, "Sốt mayonnaise chay", 56);

// Cooking Steps
        CookingStepModel step153 = new CookingStepModel(153, "Chuẩn bị bún, ốc chua, rau sống", 1, 51);
        CookingStepModel step154 = new CookingStepModel(154, "Nấu bún ốc chua chay", 2, 51);
        CookingStepModel step155 = new CookingStepModel(155, "Trang trí và đem ra", 3, 51);
        CookingStepModel step156 = new CookingStepModel(156, "Chuẩn bị bún, măng chua, nước dùng", 1, 52);
        CookingStepModel step157 = new CookingStepModel(157, "Nấu bún măng chua cay chay", 2, 52);
        CookingStepModel step158 = new CookingStepModel(158, "Trang trí và đem ra", 3, 52);
        CookingStepModel step159 = new CookingStepModel(159, "Chuẩn bị cái lương, nấm tươi", 1, 53);
        CookingStepModel step160 = new CookingStepModel(160, "Xào cái lương xào nấm", 2, 53);
        CookingStepModel step161 = new CookingStepModel(161, "Trang trí và đem ra", 3, 53);
        CookingStepModel step162 = new CookingStepModel(162, "Chuẩn bị khoai môn, mật ong chay", 1, 54);
        CookingStepModel step163 = new CookingStepModel(163, "Hấp khoai môn mật ong chay", 2, 54);
        CookingStepModel step164 = new CookingStepModel(164, "Trang trí và đem ra", 3, 54);
        CookingStepModel step165 = new CookingStepModel(165, "Chuẩn bị bún, riêu, cà chua", 1, 55);
        CookingStepModel step166 = new CookingStepModel(166, "Nấu bún riêu chay", 2, 55);
        CookingStepModel step167 = new CookingStepModel(167, "Trang trí và đem ra", 3, 55);
        CookingStepModel step168 = new CookingStepModel(168, "Chuẩn bị khoai tây, sốt mayonnaise chay", 1, 56);
        CookingStepModel step169 = new CookingStepModel(169, "Làm salad khoai tây chay", 2, 56);
        CookingStepModel step170 = new CookingStepModel(170, "Trang trí và đem ra", 3, 56);

// Dishes
        DishModel dish51 = new DishModel(51, "Bún ốc chua chay", 1, "https://ducankitchen.com/wp-content/uploads/2021/07/bun-oc-chay-02.jpg", new ArrayList<>(Arrays.asList(ingredient138, ingredient139, ingredient140)), new ArrayList<>(Arrays.asList(step153, step154, step155)));
        DishModel dish52 = new DishModel(52, "Bún măng chua cay chay", 1, "https://cdn.tgdd.vn/Files/2021/09/03/1379948/cach-nau-bun-mang-chay-thom-ngon-thanh-dam-don-gian-cho-ngay-ram-202201111006372194.jpeg", new ArrayList<>(Arrays.asList(ingredient141, ingredient142, ingredient143)), new ArrayList<>(Arrays.asList(step156, step157, step158)));
        DishModel dish53 = new DishModel(53, "Cái lương xào nấm", 2, "https://cdn.tgdd.vn/Files/2021/08/03/1372824/cach-lam-luon-xao-lan-thom-ngon-chuan-vi-202201071315149780.jpg", new ArrayList<>(Arrays.asList(ingredient144, ingredient145, ingredient146)), new ArrayList<>(Arrays.asList(step159, step160, step161)));
        DishModel dish54 = new DishModel(54, "Khoai môn hấp mật ong chay", 2, "https://linhsonphatgiao.com/static/2016/01/chahapchay.jpg", new ArrayList<>(Arrays.asList(ingredient147, ingredient148, ingredient149)), new ArrayList<>(Arrays.asList(step162, step163, step164)));
        DishModel dish55 = new DishModel(55, "Bún riêu chay", 3, "https://cachnau.vn/wp-content/uploads/2021/11/bun-rieu-chay-ngon.jpg", new ArrayList<>(Arrays.asList(ingredient150, ingredient151, ingredient152)), new ArrayList<>(Arrays.asList(step165, step166, step167)));
        DishModel dish56 = new DishModel(56, "Salad khoai tây chay", 3, "https://beptruong.edu.vn/wp-content/uploads/2013/06/salad-khoai-tay-nghien.jpg", new ArrayList<>(Arrays.asList(ingredient153, ingredient154, ingredient155)), new ArrayList<>(Arrays.asList(step168, step169, step170)));

// Meal Times
        MealTimeModel breakfast9 = new MealTimeModel(23, "Breakfast", 9, "Bắt đầu ngày mới với bún ốc chua chay và bún măng chua cay chay.");
        MealTimeModel lunch9 = new MealTimeModel(24, "Lunch", 9, "Thưởng thức cái lương xào nấm, khoai môn hấp mật ong chay.");
        MealTimeModel dinner9 = new MealTimeModel(25, "Dinner", 9, "Kết thúc ngày với bún riêu chay và salad khoai tây chay.");

// Day Plan
        DailyMenuModel dailyMenu9 = new DailyMenuModel(9, new ArrayList<>(Arrays.asList(breakfast9, lunch9, dinner9)), new ArrayList<>(Arrays.asList(dish51, dish52, dish53, dish54, dish55, dish56)));

        // Ingredients
        IngredientModel ingredient156 = new IngredientModel(156, "Cháo nấm chay", 57);
        IngredientModel ingredient157 = new IngredientModel(157, "Nấm tươi", 57);
        IngredientModel ingredient158 = new IngredientModel(158, "Gạo", 57);
        IngredientModel ingredient159 = new IngredientModel(159, "Cơm sườn chay", 58);
        IngredientModel ingredient160 = new IngredientModel(160, "Sườn chay", 58);
        IngredientModel ingredient161 = new IngredientModel(161, "Cơm trắng", 58);
        IngredientModel ingredient162 = new IngredientModel(162, "Canh khoai tây chay", 59);
        IngredientModel ingredient163 = new IngredientModel(163, "Khoai tây", 59);
        IngredientModel ingredient164 = new IngredientModel(164, "Nước dùng chay", 59);
        IngredientModel ingredient165 = new IngredientModel(165, "Bánh mì xôi chay", 60);
        IngredientModel ingredient166 = new IngredientModel(166, "Bánh mì", 60);
        IngredientModel ingredient167 = new IngredientModel(167, "Xôi", 60);
        IngredientModel ingredient168 = new IngredientModel(168, "Gỏi cuốn chay", 61);
        IngredientModel ingredient169 = new IngredientModel(169, "Bún", 61);
        IngredientModel ingredient170 = new IngredientModel(170, "Rau sống", 61);

// Cooking Steps
        CookingStepModel step171 = new CookingStepModel(171, "Chuẩn bị nấm, gạo", 1, 57);
        CookingStepModel step172 = new CookingStepModel(172, "Nấu cháo nấm chay", 2, 57);
        CookingStepModel step173 = new CookingStepModel(173, "Trang trí và đem ra", 3, 57);
        CookingStepModel step174 = new CookingStepModel(174, "Chuẩn bị sườn chay, cơm trắng", 1, 58);
        CookingStepModel step175 = new CookingStepModel(175, "Nấu cơm sườn chay", 2, 58);
        CookingStepModel step176 = new CookingStepModel(176, "Trang trí và đem ra", 3, 58);
        CookingStepModel step177 = new CookingStepModel(177, "Chuẩn bị khoai tây, nước dùng chay", 1, 59);
        CookingStepModel step178 = new CookingStepModel(178, "Nấu canh khoai tây chay", 2, 59);
        CookingStepModel step179 = new CookingStepModel(179, "Trang trí và đem ra", 3, 59);
        CookingStepModel step180 = new CookingStepModel(180, "Chuẩn bị bánh mì, xôi", 1, 60);
        CookingStepModel step181 = new CookingStepModel(181, "Làm bánh mì xôi chay", 2, 60);
        CookingStepModel step182 = new CookingStepModel(182, "Trang trí và đem ra", 3, 60);
        CookingStepModel step183 = new CookingStepModel(183, "Chuẩn bị bún, rau sống", 1, 61);
        CookingStepModel step184 = new CookingStepModel(184, "Làm gỏi cuốn chay", 2, 61);
        CookingStepModel step185 = new CookingStepModel(185, "Trang trí và đem ra", 3, 61);

// Dishes
        DishModel dish57 = new DishModel(57, "Cháo nấm chay", 1, "https://img-global.cpcdn.com/recipes/461ca1b4edec5be0/1360x964cq70/chao-n%E1%BA%A5m-dong-co-chay-recipe-main-photo.webp", new ArrayList<>(Arrays.asList(ingredient156, ingredient157, ingredient158)), new ArrayList<>(Arrays.asList(step171, step172, step173)));
        DishModel dish58 = new DishModel(58, "Cơm sườn chay", 1, "https://cdn.tgdd.vn/2020/08/CookProduct/52-1200x676.jpg", new ArrayList<>(Arrays.asList(ingredient159, ingredient160, ingredient161)), new ArrayList<>(Arrays.asList(step174, step175, step176)));
        DishModel dish59 = new DishModel(59, "Canh khoai tây chay", 2, "https://afamilycdn.com/thumb_w/660/2017/canh-rau-cu-5-1509724888641.jpg", new ArrayList<>(Arrays.asList(ingredient162, ingredient163, ingredient164)), new ArrayList<>(Arrays.asList(step177, step178, step179)));
        DishModel dish60 = new DishModel(60, "Bánh mì xôi chay", 2, "https://diadiemanuong.net.vn/www/uploads/images/properties/adminweb@gmail.com/06-2023/2023627105017_anchayne.jpg", new ArrayList<>(Arrays.asList(ingredient165, ingredient166, ingredient167)), new ArrayList<>(Arrays.asList(step180, step181, step182)));
        DishModel dish61 = new DishModel(61, "Gỏi cuốn chay", 3, "https://amthucdochay.com/wp-content/webp-express/webp-images/doc-root/wp-content/uploads/2021/09/goi-cuon-dau-phu-chay-6dcd.jpg.webp", new ArrayList<>(Arrays.asList(ingredient168, ingredient169, ingredient170)), new ArrayList<>(Arrays.asList(step183, step184, step185)));

// Meal Times
        MealTimeModel breakfast10 = new MealTimeModel(26, "Breakfast", 10, "Bắt đầu ngày với cháo nấm chay.");
        MealTimeModel lunch10 = new MealTimeModel(27, "Lunch", 10, "Thưởng thức cơm sườn chay và canh khoai tây chay.");
        MealTimeModel dinner10 = new MealTimeModel(28, "Dinner", 10, "Kết thúc ngày với bánh mì xôi chay và gỏi cuốn chay.");

// Day Plan
        DailyMenuModel dailyMenu10 = new DailyMenuModel(10, new ArrayList<>(Arrays.asList(breakfast10, lunch10, dinner10)), new ArrayList<>(Arrays.asList(dish57, dish58, dish59, dish60, dish61)));
        // Ingredients
        IngredientModel ingredient171 = new IngredientModel(171, "Bún chay Huế", 62);
        IngredientModel ingredient172 = new IngredientModel(172, "Bún", 62);
        IngredientModel ingredient173 = new IngredientModel(173, "Nước dùng chay", 62);
        IngredientModel ingredient174 = new IngredientModel(174, "Cơm chay thập cẩm", 63);
        IngredientModel ingredient175 = new IngredientModel(175, "Cơm trắng", 63);
        IngredientModel ingredient176 = new IngredientModel(176, "Rau cải", 63);
        IngredientModel ingredient177 = new IngredientModel(177, "Đậu hủ", 63);
        IngredientModel ingredient178 = new IngredientModel(178, "Bánh chưng chay", 64);
        IngredientModel ingredient179 = new IngredientModel(179, "Lá chuối", 64);
        IngredientModel ingredient180 = new IngredientModel(180, "Gạo nếp", 64);
        IngredientModel ingredient181 = new IngredientModel(181, "Đậu xanh", 64);
        IngredientModel ingredient182 = new IngredientModel(182, "Salad rau trái cây chay", 65);
        IngredientModel ingredient183 = new IngredientModel(183, "Rau mầm", 65);
        IngredientModel ingredient184 = new IngredientModel(184, "Trái cây tươi", 65);
        IngredientModel ingredient185 = new IngredientModel(185, "Súp bí đỏ chay", 66);
        IngredientModel ingredient186 = new IngredientModel(186, "Bí đỏ", 66);
        IngredientModel ingredient187 = new IngredientModel(187, "Nước dùng chay", 66);

// Cooking Steps
        CookingStepModel step186 = new CookingStepModel(186, "Chuẩn bị bún, nước dùng chay", 1, 62);
        CookingStepModel step187 = new CookingStepModel(187, "Nấu bún chay Huế", 2, 62);
        CookingStepModel step188 = new CookingStepModel(188, "Trang trí và đem ra", 3, 62);
        CookingStepModel step189 = new CookingStepModel(189, "Chuẩn bị cơm trắng, rau cải, đậu hủ", 1, 63);
        CookingStepModel step190 = new CookingStepModel(190, "Nấu cơm chay thập cẩm", 2, 63);
        CookingStepModel step191 = new CookingStepModel(191, "Trang trí và đem ra", 3, 63);
        CookingStepModel step192 = new CookingStepModel(192, "Chuẩn bị lá chuối, gạo nếp, đậu xanh", 1, 64);
        CookingStepModel step193 = new CookingStepModel(193, "Làm bánh chưng chay", 2, 64);
        CookingStepModel step194 = new CookingStepModel(194, "Đem ra", 3, 64);
        CookingStepModel step195 = new CookingStepModel(195, "Chuẩn bị rau mầm, trái cây tươi", 1, 65);
        CookingStepModel step196 = new CookingStepModel(196, "Làm salad rau trái cây chay", 2, 65);
        CookingStepModel step197 = new CookingStepModel(197, "Trang trí và đem ra", 3, 65);
        CookingStepModel step198 = new CookingStepModel(198, "Chuẩn bị bí đỏ, nước dùng chay", 1, 66);
        CookingStepModel step199 = new CookingStepModel(199, "Nấu súp bí đỏ chay", 2, 66);
        CookingStepModel step200 = new CookingStepModel(200, "Trang trí và đem ra", 3, 66);

// Dishes
        DishModel dish62 = new DishModel(62, "Bún chay Huế", 1, "https://cdn.tgdd.vn/Files/2020/04/27/1252124/cach-nau-bun-bo-hue-chay-thom-ngon-thanh-dam-dam-3-760x367.jpg", new ArrayList<>(Arrays.asList(ingredient171, ingredient172, ingredient173)), new ArrayList<>(Arrays.asList(step186, step187, step188)));
        DishModel dish63 = new DishModel(63, "Cơm chay thập cẩm", 1, "https://pastaxi-manager.onepas.vn/content/uploads/articles/ngocanh/Blog/cach-lam-com-chien-chay/cach-lam-com-chien-chay-1.jpg", new ArrayList<>(Arrays.asList(ingredient174, ingredient175, ingredient176, ingredient177)), new ArrayList<>(Arrays.asList(step189, step190, step191)));
        DishModel dish64 = new DishModel(64, "Bánh chưng chay", 2, "https://www.food.com.vn/upload/Nguyen-lieu-can-chuan-bi-de-goi-banh-chung-chay.jpg", new ArrayList<>(Arrays.asList(ingredient178, ingredient179, ingredient180, ingredient181)), new ArrayList<>(Arrays.asList(step192, step193, step194)));
        DishModel dish65 = new DishModel(65, "Salad rau trái cây chay", 2, "https://quangon.vn/resources/2020/05/19/salad-trai-cay-sot-mayonnaise-13.jpg", new ArrayList<>(Arrays.asList(ingredient182, ingredient183, ingredient184)), new ArrayList<>(Arrays.asList(step195, step196, step197)));
        DishModel dish66 = new DishModel(66, "Súp bí đỏ chay", 3, "https://cdn.tgdd.vn/2020/06/CookProduct/asfWEGW-1200x676.jpg", new ArrayList<>(Arrays.asList(ingredient185, ingredient186, ingredient187)), new ArrayList<>(Arrays.asList(step198, step199, step200)));

// Meal Times
        MealTimeModel breakfast11 = new MealTimeModel(29, "Breakfast", 11, "Bắt đầu ngày với bát bún chay Huế thơm ngon.");
        MealTimeModel lunch11 = new MealTimeModel(30, "Lunch", 11, "Thưởng thức cơm chay thập cẩm và bánh chưng chay.");
        MealTimeModel dinner11 = new MealTimeModel(31, "Dinner", 11, "Kết thúc ngày với salad rau trái cây chay và súp bí đỏ chay.");

// Day Plan
        DailyMenuModel dailyMenu11 = new DailyMenuModel(11, new ArrayList<>(Arrays.asList(breakfast11, lunch11, dinner11)), new ArrayList<>(Arrays.asList(dish62, dish63, dish64, dish65, dish66)));

        // Ingredients
        IngredientModel ingredient188 = new IngredientModel(188, "Phở chay", 67);
        IngredientModel ingredient189 = new IngredientModel(189, "Bánh phở", 67);
        IngredientModel ingredient190 = new IngredientModel(190, "Nước dùng chay", 67);
        IngredientModel ingredient191 = new IngredientModel(191, "Nấm", 67);
        IngredientModel ingredient192 = new IngredientModel(192, "Bánh mì chay", 68);
        IngredientModel ingredient193 = new IngredientModel(193, "Bánh mì", 68);
        IngredientModel ingredient194 = new IngredientModel(194, "Pate chay", 68);
        IngredientModel ingredient195 = new IngredientModel(195, "Rau sống", 68);
        IngredientModel ingredient196 = new IngredientModel(196, "Mì xào chay", 69);
        IngredientModel ingredient197 = new IngredientModel(197, "Mì", 69);
        IngredientModel ingredient198 = new IngredientModel(198, "Rau củ", 69);
        IngredientModel ingredient199 = new IngredientModel(199, "Tương ớt", 69);
        IngredientModel ingredient200 = new IngredientModel(200, "Kem chay", 70);
        IngredientModel ingredient201 = new IngredientModel(201, "Dừa", 70);
        IngredientModel ingredient202 = new IngredientModel(202, "Mật ong", 70);
        IngredientModel ingredient203 = new IngredientModel(203, "Nước chấm chay", 71);
        IngredientModel ingredient204 = new IngredientModel(204, "Nước tương", 71);
        IngredientModel ingredient205 = new IngredientModel(205, "Tỏi", 71);

// Cooking Steps
        CookingStepModel step201 = new CookingStepModel(201, "Chuẩn bị bánh phở, nấm và nước dùng chay", 1, 67);
        CookingStepModel step202 = new CookingStepModel(202, "Nấu phở chay", 2, 67);
        CookingStepModel step203 = new CookingStepModel(203, "Trang trí và đem ra", 3, 67);
        CookingStepModel step204 = new CookingStepModel(204, "Chuẩn bị bánh mì và pate chay", 1, 68);
        CookingStepModel step205 = new CookingStepModel(205, "Làm bánh mì chay", 2, 68);
        CookingStepModel step206 = new CookingStepModel(206, "Đem ra", 3, 68);
        CookingStepModel step207 = new CookingStepModel(207, "Chuẩn bị mì và rau củ", 1, 69);
        CookingStepModel step208 = new CookingStepModel(208, "Nấu mì xào chay", 2, 69);
        CookingStepModel step209 = new CookingStepModel(209, "Trang trí và đem ra", 3, 69);
        CookingStepModel step210 = new CookingStepModel(210, "Chuẩn bị dừa và mật ong", 1, 70);
        CookingStepModel step211 = new CookingStepModel(211, "Làm kem chay", 2, 70);
        CookingStepModel step212 = new CookingStepModel(212, "Đem ra", 3, 70);
        CookingStepModel step213 = new CookingStepModel(213, "Chuẩn bị nước tương và tỏi", 1, 71);
        CookingStepModel step214 = new CookingStepModel(214, "Làm nước chấm chay", 2, 71);
        CookingStepModel step215 = new CookingStepModel(215, "Đem ra", 3, 71);

// Dishes
        DishModel dish67 = new DishModel(67, "Phở chay", 1, "https://daubepgiadinh.vn/wp-content/uploads/2018/05/pho-chay-ngon-mieng-cho-bua-sang.jpg", new ArrayList<>(Arrays.asList(ingredient188, ingredient189, ingredient190, ingredient191)), new ArrayList<>(Arrays.asList(step201, step202, step203)));
        DishModel dish68 = new DishModel(68, "Bánh mì chay", 2, "https://cdn.tgdd.vn/2021/03/CookProduct/thum1200-1200x676-9.jpg", new ArrayList<>(Arrays.asList(ingredient192, ingredient193, ingredient194, ingredient195)), new ArrayList<>(Arrays.asList(step204, step205, step206)));
        DishModel dish69 = new DishModel(69, "Mì xào chay", 3, "https://thuvienamthuc.vn/upload/images/2022/04/20/cach-lam-mi-xao-chay-thom-ngon-va-de-lam-6.jpg", new ArrayList<>(Arrays.asList(ingredient196, ingredient197, ingredient198, ingredient199)), new ArrayList<>(Arrays.asList(step207, step208, step209)));
        DishModel dish70 = new DishModel(70, "Kem chay", 4, "https://cdn.tgdd.vn/2021/03/CookProduct/1200-1200x676-73.jpg", new ArrayList<>(Arrays.asList(ingredient200, ingredient201, ingredient202)), new ArrayList<>(Arrays.asList(step210, step211, step212)));
        DishModel dish71 = new DishModel(71, "Nước chấm chay", 5, "https://cholimexfood.com.vn/wp-content/uploads/2021/03/z2356822198811_d12afc666be59583c7a4e9024f37aac9-500x500.jpg", new ArrayList<>(Arrays.asList(ingredient203, ingredient204, ingredient205)), new ArrayList<>(Arrays.asList(step213, step214, step215)));

// Meal Times
        MealTimeModel breakfast12 = new MealTimeModel(32, "Breakfast", 12, "Bắt đầu ngày với tô phở chay thơm ngon.");
        MealTimeModel lunch12 = new MealTimeModel(33, "Lunch", 12, "Thưởng thức bữa trưa với bánh mì chay và mì xào chay.");
        MealTimeModel dinner12 = new MealTimeModel(34, "Dinner", 12, "Kết thúc ngày với kem chay và nước chấm chay.");

// Day Plan
        DailyMenuModel dailyMenu12 = new DailyMenuModel(12, new ArrayList<>(Arrays.asList(breakfast12, lunch12, dinner12)), new ArrayList<>(Arrays.asList(dish67, dish68, dish69, dish70, dish71)));

        // Ingredients
        IngredientModel ingredient206 = new IngredientModel(206, "Bún chay", 72);
        IngredientModel ingredient207 = new IngredientModel(207, "Bún", 72);
        IngredientModel ingredient208 = new IngredientModel(208, "Chả chay", 72);
        IngredientModel ingredient209 = new IngredientModel(209, "Nước mắm pha chay", 72);
        IngredientModel ingredient210 = new IngredientModel(210, "Gỏi cuốn chay", 73);
        IngredientModel ingredient211 = new IngredientModel(211, "Bánh tráng", 73);
        IngredientModel ingredient212 = new IngredientModel(212, "Đậu hủ", 73);
        IngredientModel ingredient213 = new IngredientModel(213, "Rau sống", 73);
        IngredientModel ingredient214 = new IngredientModel(214, "Cháo chay", 74);
        IngredientModel ingredient215 = new IngredientModel(215, "Gạo", 74);
        IngredientModel ingredient216 = new IngredientModel(216, "Nấm", 74);
        IngredientModel ingredient217 = new IngredientModel(217, "Đậu đen", 74);
        IngredientModel ingredient218 = new IngredientModel(218, "Chè chay", 75);
        IngredientModel ingredient219 = new IngredientModel(219, "Đậu xanh", 75);
        IngredientModel ingredient220 = new IngredientModel(220, "Cơm dừa", 75);
        IngredientModel ingredient221 = new IngredientModel(221, "Đường", 75);
        IngredientModel ingredient222 = new IngredientModel(222, "Cơm chay", 76);
        IngredientModel ingredient223 = new IngredientModel(223, "Cơm", 76);
        IngredientModel ingredient224 = new IngredientModel(224, "Rau củ luộc", 76);
        IngredientModel ingredient225 = new IngredientModel(225, "Canh chua chay", 76);

// Cooking Steps
        CookingStepModel step216 = new CookingStepModel(216, "Chuẩn bị bún, chả chay và nước mắm pha chay", 1, 72);
        CookingStepModel step217 = new CookingStepModel(217, "Làm bún chay", 2, 72);
        CookingStepModel step218 = new CookingStepModel(218, "Đem ra", 3, 72);
        CookingStepModel step219 = new CookingStepModel(219, "Chuẩn bị bánh tráng, đậu hủ và rau sống", 1, 73);
        CookingStepModel step220 = new CookingStepModel(220, "Làm gỏi cuốn chay", 2, 73);
        CookingStepModel step221 = new CookingStepModel(221, "Đem ra", 3, 73);
        CookingStepModel step222 = new CookingStepModel(222, "Chuẩn bị gạo, nấm và đậu đen", 1, 74);
        CookingStepModel step223 = new CookingStepModel(223, "Nấu cháo chay", 2, 74);
        CookingStepModel step224 = new CookingStepModel(224, "Đem ra", 3, 74);
        CookingStepModel step225 = new CookingStepModel(225, "Chuẩn bị đậu xanh, cơm dừa và đường", 1, 75);
        CookingStepModel step226 = new CookingStepModel(226, "Làm chè chay", 2, 75);
        CookingStepModel step227 = new CookingStepModel(227, "Đem ra", 3, 75);
        CookingStepModel step228 = new CookingStepModel(228, "Chuẩn bị cơm, rau củ luộc và canh chua chay", 1, 76);
        CookingStepModel step229 = new CookingStepModel(229, "Làm cơm chay", 2, 76);
        CookingStepModel step230 = new CookingStepModel(230, "Đem ra", 3, 76);

// Dishes
        DishModel dish72 = new DishModel(72, "Bún chay", 1, "https://cdn.tgdd.vn/Files/2021/09/06/1380678/huong-dan-cach-lam-mon-bun-chay-don-gian-tai-nha-202109062036120311.jpg", new ArrayList<>(Arrays.asList(ingredient206, ingredient207, ingredient208, ingredient209)), new ArrayList<>(Arrays.asList(step216, step217, step218)));
        DishModel dish73 = new DishModel(73, "Gỏi cuốn chay", 2, "https://images.toplist.vn/images/800px/goi-cuon-chay-nam-dui-ga-tau-hu-ky-736553.jpg", new ArrayList<>(Arrays.asList(ingredient210, ingredient211, ingredient212, ingredient213)), new ArrayList<>(Arrays.asList(step219, step220, step221)));
        DishModel dish74 = new DishModel(74, "Cháo chay", 3, "https://cdn.tgdd.vn/Files/2017/12/29/1054201/cach-nau-chao-thap-cam-chay-thom-ngon-tot-cho-suc-khoe-202208311052551118.jpg", new ArrayList<>(Arrays.asList(ingredient214, ingredient215, ingredient216, ingredient217)), new ArrayList<>(Arrays.asList(step222, step223, step224)));
        DishModel dish75 = new DishModel(75, "Chè chay", 4, "https://monngontv.com/wp-content/uploads/2017/09/cach-nau-che-kiem-cho-mua-chay-thang-76.jpg", new ArrayList<>(Arrays.asList(ingredient218, ingredient219, ingredient220, ingredient221)), new ArrayList<>(Arrays.asList(step225, step226, step227)));
        DishModel dish76 = new DishModel(76, "Cơm chay", 5, "https://anchay.vn/storage/2022/11/com-chay-chan-nhu-768x638.jpg", new ArrayList<>(Arrays.asList(ingredient222, ingredient223, ingredient224, ingredient225)), new ArrayList<>(Arrays.asList(step228, step229, step230)));

// Meal Times
        MealTimeModel breakfast13 = new MealTimeModel(35, "Breakfast", 13, "Bắt đầu ngày với bún chay ngon lành.");
        MealTimeModel lunch13 = new MealTimeModel(36, "Lunch", 13, "Bữa trưa với gỏi cuốn chay và cháo chay.");
        MealTimeModel dinner13 = new MealTimeModel(37, "Dinner", 13, "Kết thúc ngày với cơm chay và chè chay ngọt ngào.");

// Day Plan
        DailyMenuModel dailyMenu13 = new DailyMenuModel(13, new ArrayList<>(Arrays.asList(breakfast13, lunch13, dinner13)), new ArrayList<>(Arrays.asList(dish72, dish73, dish74, dish75, dish76)));

        // Ingredients
        IngredientModel ingredient226 = new IngredientModel(226, "Bánh mỳ chay", 77);
        IngredientModel ingredient227 = new IngredientModel(227, "Bánh mỳ", 77);
        IngredientModel ingredient228 = new IngredientModel(228, "Pate chay", 77);
        IngredientModel ingredient229 = new IngredientModel(229, "Chả cá chay", 77);
        IngredientModel ingredient230 = new IngredientModel(230, "Salad chay", 78);
        IngredientModel ingredient231 = new IngredientModel(231, "Rau sống", 78);
        IngredientModel ingredient232 = new IngredientModel(232, "Nước mắm pha chay", 78);
        IngredientModel ingredient233 = new IngredientModel(233, "Phở chay", 79);
        IngredientModel ingredient234 = new IngredientModel(234, "Bún", 79);
        IngredientModel ingredient235 = new IngredientModel(235, "Nước dùng chay", 79);
        IngredientModel ingredient236 = new IngredientModel(236, "Rau sống", 79);
        IngredientModel ingredient237 = new IngredientModel(237, "Mì xào chay", 80);
        IngredientModel ingredient238 = new IngredientModel(238, "Mì", 80);
        IngredientModel ingredient239 = new IngredientModel(239, "Rau cải", 80);
        IngredientModel ingredient240 = new IngredientModel(240, "Nước mắm pha chay", 80);
        IngredientModel ingredient241 = new IngredientModel(241, "Súp chay", 81);
        IngredientModel ingredient242 = new IngredientModel(242, "Nước dùng chay", 81);
        IngredientModel ingredient243 = new IngredientModel(243, "Rau cải", 81);
        IngredientModel ingredient244 = new IngredientModel(244, "Nấm", 81);

// Cooking Steps
        CookingStepModel step231 = new CookingStepModel(231, "Chuẩn bị bánh mỳ, pate chay và chả cá chay", 1, 77);
        CookingStepModel step232 = new CookingStepModel(232, "Làm bánh mỳ chay", 2, 77);
        CookingStepModel step233 = new CookingStepModel(233, "Đem ra", 3, 77);
        CookingStepModel step234 = new CookingStepModel(234, "Chuẩn bị rau sống và nước mắm pha chay", 1, 78);
        CookingStepModel step235 = new CookingStepModel(235, "Làm salad chay", 2, 78);
        CookingStepModel step236 = new CookingStepModel(236, "Đem ra", 3, 78);
        CookingStepModel step237 = new CookingStepModel(237, "Chuẩn bị bún, nước dùng chay và rau sống", 1, 79);
        CookingStepModel step238 = new CookingStepModel(238, "Nấu phở chay", 2, 79);
        CookingStepModel step239 = new CookingStepModel(239, "Đem ra", 3, 79);
        CookingStepModel step240 = new CookingStepModel(240, "Chuẩn bị mì, rau cải và nước mắm pha chay", 1, 80);
        CookingStepModel step241 = new CookingStepModel(241, "Xào mì chay", 2, 80);
        CookingStepModel step242 = new CookingStepModel(242, "Đem ra", 3, 80);
        CookingStepModel step243 = new CookingStepModel(243, "Chuẩn bị nước dùng chay, rau cải và nấm", 1, 81);
        CookingStepModel step244 = new CookingStepModel(244, "Nấu súp chay", 2, 81);
        CookingStepModel step245 = new CookingStepModel(245, "Đem ra", 3, 81);

// Dishes
        DishModel dish77 = new DishModel(77, "Bánh mỳ chay", 1, "https://media.urbanistnetwork.com/urbanisthanoi/article-images/2020/09/03/ngo-nooks/07h.jpg", new ArrayList<>(Arrays.asList(ingredient226, ingredient227, ingredient228, ingredient229)), new ArrayList<>(Arrays.asList(step231, step232, step233)));
        DishModel dish78 = new DishModel(78, "Salad chay", 2, "https://cdn.tgdd.vn/Files/2020/09/01/1285897/mach-ban-5-cach-lam-salad-chay-thom-ngon-de-thuc-hien-202009010948504943.jpg", new ArrayList<>(Arrays.asList(ingredient230, ingredient231, ingredient232)), new ArrayList<>(Arrays.asList(step234, step235, step236)));
        DishModel dish79 = new DishModel(79, "Phở chay", 3, "https://daotaobeptruong.vn/wp-content/uploads/2019/09/pho-chay.jpg", new ArrayList<>(Arrays.asList(ingredient233, ingredient234, ingredient235, ingredient236)), new ArrayList<>(Arrays.asList(step237, step238, step239)));
        DishModel dish80 = new DishModel(80, "Mì xào chay", 4, "https://img-global.cpcdn.com/recipes/aa05093d2f7621c2/1360x964cq70/mi-goi-xao-chay-recipe-main-photo.webp", new ArrayList<>(Arrays.asList(ingredient237, ingredient238, ingredient239, ingredient240)), new ArrayList<>(Arrays.asList(step240, step241, step242)));
        DishModel dish81 = new DishModel(81, "Súp chay", 5, "https://ameovat.com/wp-content/uploads/2018/10/cach-lam-soup-chay-thap-cam-01-1-600x450.jpg", new ArrayList<>(Arrays.asList(ingredient241, ingredient242, ingredient243, ingredient244)), new ArrayList<>(Arrays.asList(step243, step244, step245)));

// Meal Times
        MealTimeModel breakfast14 = new MealTimeModel(38, "Breakfast", 8, "Bắt đầu ngày với bánh mỳ chay.");
        MealTimeModel lunch14 = new MealTimeModel(39, "Lunch", 13, "Bữa trưa với salad chay và phở chay.");
        MealTimeModel dinner14 = new MealTimeModel(40, "Dinner", 18, "Kết thúc ngày với mì xào chay và súp chay.");

// Day Plan
        DailyMenuModel dailyMenu14 = new DailyMenuModel(14, new ArrayList<>(Arrays.asList(breakfast14, lunch14, dinner14)), new ArrayList<>(Arrays.asList(dish77, dish78, dish79, dish80, dish81)));


        return new ArrayList<>(Arrays.asList(dailyMenu1, dailyMenu2, dailyMenu3,dailyMenu4,dailyMenu5,dailyMenu6,dailyMenu7,dailyMenu8,dailyMenu9,dailyMenu10,dailyMenu11,dailyMenu12,dailyMenu13,dailyMenu14));
    }
}
