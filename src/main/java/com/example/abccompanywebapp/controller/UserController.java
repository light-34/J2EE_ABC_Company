package com.example.abccompanywebapp.controller;

import com.example.abccompanywebapp.dao.CreateData;
import com.example.abccompanywebapp.dao.DbConnection;
import com.example.abccompanywebapp.dao.DisplayData;
import com.example.abccompanywebapp.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "UserController", value = "/UserController")
public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DisplayData displayData = new DisplayData();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Admin/list_users.jsp");
        String rows = "";

        for (User user: displayData.getAllUsers()) {
            rows += "<tr>" +
                    "<td>" + user.getFname() + "</td>" +
                    "<td>" + user.getLname() + "</td>" +
                    "<td>" + user.getUserName() + "</td>" +
                    "<td>" + user.getPhone() + "</td>" +
                    "<td>" + user.getEmail() + "</td>" +
                    "<td>" + user.getAddress() + "</td>" +
                    "</tr>";
        }
        request.setAttribute("rows", rows);
        requestDispatcher.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("register.jsp");
        CreateData createData = new CreateData();
        String message = "Cant be empty";
        if (request.getParameter("fname").isEmpty()) {
            request.setAttribute("fname", message);
            requestDispatcher.forward(request,response);
        } else if (request.getParameter("lname").isEmpty()) {
            request.setAttribute("lname", message);
            requestDispatcher.forward(request,response);
        } else if (request.getParameter("address").isEmpty()) {
            request.setAttribute("address", message);
            requestDispatcher.forward(request,response);
        } else if (request.getParameter("phone").isEmpty()) {
            request.setAttribute("phone", message);
            requestDispatcher.forward(request,response);
        } else if (request.getParameter("email").isEmpty()) {
            request.setAttribute("email", message);
            requestDispatcher.forward(request,response);
        } else if (request.getParameter("user").isEmpty()) {
            request.setAttribute("user", message);
            requestDispatcher.forward(request,response);
        } else if (request.getParameter("pass").isEmpty()) {
            request.setAttribute("pass", message);
            requestDispatcher.forward(request,response);
        } else if (request.getParameter("repass").isEmpty()) {
            request.setAttribute("repass", message);
            requestDispatcher.forward(request,response);
        } else if (!request.getParameter("repass").equals(request.getParameter("pass"))) {
            request.setAttribute("repass", "Password did not match");
            requestDispatcher.forward(request,response);
        } else {
            String name = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String address = request.getParameter("address");
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            String userName = request.getParameter("user");
            String pass = request.getParameter("pass");

            User user = new User(name,lname,address,phone,email,userName,pass);
            int result = createData.insertData(user);

            if(result > 0) {
                System.out.println("Data Inserted Successfully");
                RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
                request.setAttribute("success", "Data Inserted Successfully");
                rd.forward(request, response);
            }


        }

    }
}
