package ru.javawebinar.topjava.dao;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.StartMealMap;

import java.util.Map;

public class MealDao {

    private Map<Long, Meal> startMealMap;

    public MealDao() {
        this.startMealMap = StartMealMap.getInstance().getMealMap();
    }

    public void saveMeal(Meal meal){
        startMealMap.put(new Long(startMealMap.size()), meal);
    }

    public void deleteMeal(Long id){
        startMealMap.remove(id);
    }

    public Map<Long, Meal> getAll(){
        return startMealMap;
    }
}
