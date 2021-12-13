<%@include file="CoreJSP/head.jsp"%>
<title>Title</title>
</head>
<body>
<%@include file="CoreJSP/header.jsp"%>
<main>
    <div class="container">
        <h1 class="h1 text-center text-black-50"> Login Page </h1>
        <form action="LoginController" method="post">
            <div class="row">
                <div class="col-2">
                    <label for="user">User ID: </label>
                    <input type="text" id="user" name="user" class="form-control-md">
                    <span class="text-danger"><%= request.getAttribute("user") != null ? request.getAttribute("user") : ""%></span>
                </div>
            </div>
            <div class="row">
                <div class="col-2">
                    <label for="pass">Password: </label>
                    <input type="password" id="pass" name="pass" class="form-control-md">
                    <span class="text-danger"><%= request.getAttribute("pass") != null ? request.getAttribute("pass") : ""%></span>
                </div>
            </div> <br/>
            <div class="row">
                <div class="col-2">
                    <input type="submit" id="btn" name="btn" class="btn btn-primary" value="Log In">
                </div>
            </div>
        </form>
        <span class="text-danger"><%= request.getAttribute("error") != null ? request.getAttribute("error") : ""%></span>
    </div>
</main>
<%@ include file="CoreJSP/footer.jsp"%>
</body>
</html>
