package ru.javawebinar.topjava.model;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class StartMealData {

    private static StartMealData instance = new StartMealData();

    private Map<Integer, Meal> mealMap;

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private StartMealData(){

        this.mealMap = new ConcurrentHashMap<>();

        List<Meal> meals = Arrays.asList(
                new Meal(LocalDateTime.of(2015, Month.MAY, 30, 10, 0), "Завтрак", 500),
                new Meal(LocalDateTime.of(2015, Month.MAY, 30, 13, 0), "Обед", 1000),
                new Meal(LocalDateTime.of(2015, Month.MAY, 30, 20, 0), "Ужин", 500),
                new Meal(LocalDateTime.of(2015, Month.MAY, 31, 10, 0), "Завтрак", 1000),
                new Meal(LocalDateTime.of(2015, Month.MAY, 31, 13, 0), "Обед", 500),
                new Meal(LocalDateTime.of(2015, Month.MAY, 31, 20, 0), "Ужин", 510)
        );

        meals.forEach(this::putMeal);
    }

    public void putMeal(Meal meal){
        int id = atomicInteger.incrementAndGet();
        meal.setId(id);
        mealMap.put(id, meal);
    }

    public static StartMealData getInstance() {
        return instance;
    }

    public Map<Integer, Meal> getMealMap() {
        return mealMap;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

}
