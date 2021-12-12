<%@ page import="com.example.abccompanywebapp.dao.Methods" %>
<%@include file="CoreJSP/head.jsp"%>
<% Methods methods = new Methods();%>
<title>Title</title>
</head>
<body>
<%@include file="CoreJSP/header.jsp"%>
<main>
    <div class="container">
        <h1 class="h1 text-center text-black-50"> Register a Device </h1>
        <form action="DeviceRegisterController" method="post">
            <div class="row mb-2">
                <div class="col-2">
                    <label for="user">User ID: </label>
                    <input type="text" id="user" name="user" class="form-control-md" value="${param.user}">
                    <span class="text-danger"><%= request.getAttribute("user") != null ? request.getAttribute("user") : ""%></span>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-2">
                    <label for="select">Select A Product : </label>
                    <select class="form-select form-select-sm" name="select" id="select">
                        <% for (String product : methods.products() ) { %>
                            <option value="<%= product %>"> <%= product %> </option>
                        <% } %>
                    </select>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-2">
                    <label for="serial">Serial Number: </label>
                    <input type="text" id="serial" name="serial" class="form-control-md" value="${param.serial}">
                    <span class="text-danger"><%= request.getAttribute("serial") != null ? request.getAttribute("serial") : ""%></span>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-2">
                    <label for="pdate" class="form-text-label">Purchase date: </label>
                    <input type="date" id="pdate" name="pdate" class="form-control-md" value="${param.pdate}">
                    <span class="text-danger"><%= request.getAttribute("pdate") != null ? request.getAttribute("pdate") : ""%></span>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-2">
                    <input type="submit" id="btn" name="btn" class="btn btn-primary" value="Register">
                </div>
            </div>
        </form>
        <span class="text-success"><%= request.getAttribute("success") != null ? request.getAttribute("success") : ""%></span>
    </div>
</main>
<%@ include file="CoreJSP/footer.jsp"%>
</body>
</html>
