<%@include file="CoreJSP/adminHead.jsp"%>
<title>Admin Portal</title>
</head>
<body>
<header>
    <%@include file="CoreJSP/adminHeader.jsp"%>
</header>
<main>
    <div class="container">
        <h2 class="text-black-50 text-center">Welcome to Admin Panel</h2>
        <p class="text-success"><%= request.getAttribute("success") != null ? request.getAttribute("success") : ""%></p>
    </div>
</main>
</body>
</html>
