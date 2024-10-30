package com.example.servlet;

import com.example.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

public class GetUsersServlet  extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Set<User> users = Warehouse.getInstance().getUsers();
        request.setAttribute("users", users);
        request.getRequestDispatcher("/jsp/users.jsp").forward(request, response);
    }
}
