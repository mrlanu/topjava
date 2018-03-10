package ru.javawebinar.topjava.dao;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.StartMealData;

import java.util.Map;

public class MealDaoImpl implements MealDao {

    private StartMealData startMealData;

    public MealDaoImpl() {
        this.startMealData = StartMealData.getInstance();
    }

    @Override
    public void addMeal(Meal meal){
        startMealData.getMealMap().put(startMealData.getAtomicInteger().incrementAndGet(), meal);
    }

    @Override
    public void deleteMeal(Long id){
        startMealData.getMealMap().remove(id);
    }

    @Override
    public Map<Integer, Meal> getAll(){
        return startMealData.getMealMap();
    }
}
