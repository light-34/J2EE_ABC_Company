<%@ include file="CoreJSP/head.jsp"%>
<title>ABC Company Home Page</title>
</head>
<body>
<%@ include file="CoreJSP/header.jsp"%>
<main>

    <div class="container">
        <h1 class="text-center text-black-50">WELCOME TO ABC COMPANY</h1>
        <div class="col">
        Home Page <a href="${pageContext.request.contextPath }/index.jsp">Click here</a>
        </div>
        <p> </p>
        <div class="col">
        Register <a href="${pageContext.request.contextPath }/register.jsp">Click here</a>
        </div>
        <span class="text-success"><%= request.getAttribute("success") != null ? request.getAttribute("success") : ""%></span>
    </div>

</main>
<%@ include file="CoreJSP/footer.jsp"%>
</body>
</html>