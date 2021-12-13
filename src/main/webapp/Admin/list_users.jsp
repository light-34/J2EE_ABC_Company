<%@include file="head.jsp"%>
    <title>List of Users</title>
</head>
<body>
<header>
    <%@include file="header.jsp"%>
</header>
<main>
    <div class="container">
        <a href="../UserController" class="btn btn-primary">All Users</a>
        <table class="table table-striped">
            <thead class="table-dark">
                <th>First Name</th>
                <th>Last Name</th>
                <th>User Name</th>
                <th>Phone</th>
                <th>Email</th>
                <th>Address</th>
            </thead>
            <tbody>
            <%= request.getAttribute("rows") != null ? request.getAttribute("rows") : "" %>
            </tbody>

        </table>

    </div>
</main>
</body>
</html>
