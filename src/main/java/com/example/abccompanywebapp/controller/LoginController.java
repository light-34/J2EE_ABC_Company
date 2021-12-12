package com.example.abccompanywebapp.controller;

import com.example.abccompanywebapp.dao.CreateData;
import com.example.abccompanywebapp.dao.UserAuth;
import com.example.abccompanywebapp.model.RegisteredProduct;
import com.example.abccompanywebapp.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginController", value = "/LoginController")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
        UserAuth authorize = new UserAuth();
        String message = "Cant be empty";
        if (request.getParameter("user").isEmpty()) {
            request.setAttribute("user", message);
            requestDispatcher.forward(request,response);
        } else if (request.getParameter("pass").isEmpty()) {
            request.setAttribute("pass", message);
            requestDispatcher.forward(request,response);
        } else {
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            if (authorize.userAuthorize(user,pass)) {
                    RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                    request.setAttribute("success", user + " logged in.");
                    rd.forward(request, response);
            } else {
                request.setAttribute("error", "User name or Password did not match");
                requestDispatcher.forward(request, response);
            }

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
