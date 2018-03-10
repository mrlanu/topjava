package ru.javawebinar.topjava.services;

import ru.javawebinar.topjava.dao.MealDaoImpl;
import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.MealWithExceed;
import ru.javawebinar.topjava.util.MealsUtil;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MealServiceImpl implements MealService{

    private MealDaoImpl mealDaoImpl;

    public MealServiceImpl() {
        this.mealDaoImpl = new MealDaoImpl();
    }

    public void addMeal(Meal meal){
        mealDaoImpl.addMeal(meal);
    }

    public void deleteMeal(Long id){
        mealDaoImpl.deleteMeal(id);
    }

    @Override
    public List<MealWithExceed> getAllWithExceed() {
        List<Meal> listMeal = new ArrayList<>();

        mealDaoImpl.getAll().forEach((k, v) -> listMeal.add(v));
        return MealsUtil.getFilteredWithExceeded(listMeal, LocalTime.MIN, LocalTime.MAX, 2000);
    }
}
