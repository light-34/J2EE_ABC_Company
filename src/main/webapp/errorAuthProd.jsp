<%@ page import="com.example.abccompanywebapp.dao.Methods" isErrorPage="true" %>
<%@include file="CoreJSP/head.jsp"%>
<% Methods methods = new Methods();%>
<title>Title</title>
</head>
<body>
<%@include file="CoreJSP/header.jsp"%>
<main>
    <div class="container">
        <h1 class="text-danger">AUTHORIZATION FAILED</h1>
        <p class="text-danger">Please register before registering a product</p>
    </div>
</main>
<%@ include file="CoreJSP/footer.jsp"%>
</body>
</html>
