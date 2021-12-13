package com.example.abccompanywebapp.controller;

import com.example.abccompanywebapp.dao.DisplayData;
import com.example.abccompanywebapp.model.Product;
import com.example.abccompanywebapp.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProductController", value = "/ProductController")
public class ProductController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DisplayData displayData = new DisplayData();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("list_products.jsp");
        String rows = "";

        for (Product product: displayData.getAllProducts()) {
            rows += "<tr>" +
                    "<td>" + product.getProdId() + "</td>" +
                    "<td>" + product.getName() + "</td>" +
                    /*"<td>" + user.getUserName() + "</td>" +
                    "<td>" + user.getPhone() + "</td>" +
                    "<td>" + user.getEmail() + "</td>" +
                    "<td>" + user.getAddress() + "</td>" +*/
                    "</tr>";
        }
        request.setAttribute("rows", rows);
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
