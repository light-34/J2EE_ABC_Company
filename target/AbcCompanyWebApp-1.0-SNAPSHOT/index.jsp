<%@ include file="CoreJSP/head.jsp"%>
<title>ABC Company Home Page</title>
</head>
<body>
<%@ include file="CoreJSP/header.jsp"%>
<main>

    <div class="container">
        <h1 class="text-center text-black-50">MAIN PART</h1>
        <p>Insert a Camera <a href="${pageContext.request.contextPath }/insert.jsp">Click here</a> </p>
        <p>Display All Camera List <a href="${pageContext.request.contextPath }/display.jsp">Click here</a> </p>
    </div>

</main>
<%@ include file="CoreJSP/footer.jsp"%>
</body>
</html>