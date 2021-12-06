<%--
  Created by IntelliJ IDEA.
  User: cezmi
  Date: 2021-11-15
  Time: 1:44 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<sql:setDataSource
        var="dbsource"
        driver="com.mysql.cj.jdbc.Driver"
        url = "jdbc:mysql://localhost:3306/self-study"
        user="root"
        password="mysql"
    />