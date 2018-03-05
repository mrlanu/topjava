package ru.javawebinar.topjava.model;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StartMealMap {

    private static StartMealMap instance = new StartMealMap();

    Map<Long, Meal> mealMap;

    private StartMealMap(){

        this.mealMap = new ConcurrentHashMap<>();

        mealMap.put(new Long(0), new Meal(LocalDateTime.of(2015, Month.MAY, 30, 10, 0), "Завтрак", 500));
        mealMap.put(new Long(1), new Meal(LocalDateTime.of(2015, Month.MAY, 30, 13, 0), "Обед", 1000));
        mealMap.put(new Long(2), new Meal(LocalDateTime.of(2015, Month.MAY, 30, 20, 0), "Ужин", 500));
        mealMap.put(new Long(3), new Meal(LocalDateTime.of(2015, Month.MAY, 31, 10, 0), "Завтрак", 1000));
        mealMap.put(new Long(4), new Meal(LocalDateTime.of(2015, Month.MAY, 31, 13, 0), "Обед", 500));
        mealMap.put(new Long(5), new Meal(LocalDateTime.of(2015, Month.MAY, 31, 20, 0), "Ужин", 510));
    }

    public static StartMealMap getInstance() {
        return instance;
    }

    public Map<Long, Meal> getMealMap() {
        return mealMap;
    }
}
