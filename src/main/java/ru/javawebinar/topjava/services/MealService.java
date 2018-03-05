package ru.javawebinar.topjava.services;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.MealWithExceed;

import java.util.List;
import java.util.Map;

public interface MealService {

    void saveMeal(Meal meal);
    void deleteMeal(Long id);
    List<MealWithExceed> getAllWithExceed();
}
