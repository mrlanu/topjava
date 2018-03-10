package ru.javawebinar.topjava.web;

import ru.javawebinar.topjava.services.MealService;
import ru.javawebinar.topjava.services.MealServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MealServlet extends HttpServlet {

    private MealService mealService = new MealServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       req.setAttribute("mealList", mealService.getAllWithExceed());
       req.getRequestDispatcher("/meals.jsp").forward(req, resp);
    }
}
