package ru.javawebinar.topjava.dao;

import ru.javawebinar.topjava.model.Meal;

import java.util.Map;

public interface MealDao {
    void addMeal(Meal meal);

    void deleteMeal(Long id);

    Map<Integer, Meal> getAll();
}
