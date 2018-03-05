package ru.javawebinar.topjava.services;

import ru.javawebinar.topjava.dao.MealDao;
import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.MealWithExceed;
import ru.javawebinar.topjava.util.MealsUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MealServiceImpl implements MealService{

    private MealDao mealDao;

    public MealServiceImpl() {
        this.mealDao = new MealDao();
    }

    public void saveMeal(Meal meal){
        mealDao.saveMeal(meal);
    }

    public void deleteMeal(Long id){
        mealDao.deleteMeal(id);
    }

    @Override
    public List<MealWithExceed> getAllWithExceed() {
        List<Meal> listMeal = new ArrayList<>();
        mealDao.getAll().forEach((k, v) -> listMeal.add(v));
        return MealsUtil.getFilteredWithExceeded2(listMeal, 2000);
    }
}
