package com.example.abccompanywebapp.controller;

import com.example.abccompanywebapp.dao.CreateData;
import com.example.abccompanywebapp.dao.Methods;
import com.example.abccompanywebapp.dao.UserAuth;
import com.example.abccompanywebapp.model.RegisteredProduct;
import com.example.abccompanywebapp.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DeviceRegisterController", value = "/DeviceRegisterController")
public class DeviceRegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Methods methods = new Methods();
        UserAuth authorize = new UserAuth();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("regdevice.jsp");
        CreateData createData = new CreateData();
        String message = "Cant be empty";
        if (request.getParameter("user").isEmpty()) {
            request.setAttribute("user", message);
            requestDispatcher.forward(request,response);
        } else if (request.getParameter("serial").isEmpty()) {
            request.setAttribute("serial", message);
            requestDispatcher.forward(request,response);
        } else if (request.getParameter("pdate").isEmpty()) {
            request.setAttribute("pdate", message);
            requestDispatcher.forward(request,response);
        } else {
            String user = request.getParameter("user");
            String prodName = request.getParameter("select");
            String serial = request.getParameter("serial");
            String pDate = request.getParameter("pdate");
            if (authorize.prodAuthorize(user)) {
                RegisteredProduct regProd = new RegisteredProduct(user, prodName, serial, pDate);
                int result = createData.insertData(regProd);
                if(result > 0) {
                    System.out.println("Data Inserted Successfully");
                    RequestDispatcher rd = request.getRequestDispatcher("regdevice.jsp");
                    request.setAttribute("success", "Data Inserted Successfully");
                    rd.forward(request, response);
                }
            } else {
                    RequestDispatcher rd = request.getRequestDispatcher("errorAuthProd.jsp");
                    rd.forward(request, response);
            }
        }
    }
}
