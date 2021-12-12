<%@include file="CoreJSP/head.jsp"%>
    <title>Title</title>
</head>
<body>
<%@include file="CoreJSP/header.jsp"%>
<main>
    <div class="container">
        <h1 class="h1 text-center text-black-50"> Registration Form </h1>
        <form action="UserController" method="post">
            <div class="row">
                <div class="col-2">
                    <label for="fname">First Name: </label>
                    <input type="text" id="fname" name="fname" class="form-control-md" value="${param.fname}">
                    <span class="text-danger"><%= request.getAttribute("fname") != null ? request.getAttribute("fname") : ""%></span>
                </div>
            </div>
            <div class="row">
                <div class="col-2">
                    <label for="lname">Last Name: </label>
                    <input type="text" id="lname" name="lname" class="form-control-md" value="${param.lname}">
                    <span class="text-danger"><%= request.getAttribute("lname") != null ? request.getAttribute("lname") : ""%></span>
                </div>
            </div>
            <div class="row">
                <div class="col-2">
                    <label for="address">Address: </label>
                    <input type="text" id="address" name="address" class="form-control-md" value="${param.address}">
                    <span class="text-danger"><%= request.getAttribute("address") != null ? request.getAttribute("address") : ""%></span>
                </div>
            </div>
            <div class="row">
                <div class="col-2">
                    <label for="phone" class="form-text-label">Phone Number: </label>
                    <input type="text" id="phone" name="phone" class="form-control-md" value="${param.phone}">
                    <span class="text-danger"><%= request.getAttribute("phone") != null ? request.getAttribute("phone") : ""%></span>
                </div>
            </div>
            <div class="row">
                <div class="col-2">
                    <label for="email">Email Address: </label>
                    <input type="text" id="email" name="email" class="form-control-md" value="${param.email}">
                    <span class="text-danger"><%= request.getAttribute("email") != null ? request.getAttribute("email") : ""%></span>
                </div>
            </div>
            <div class="row">
                <div class="col-2">
                    <label for="user">User ID: </label>
                    <input type="text" id="user" name="user" class="form-control-md" value="${param.user}">
                    <span class="text-danger"><%= request.getAttribute("user") != null ? request.getAttribute("user") : ""%></span>
                </div>
            </div>
            <div class="row">
                <div class="col-2">
                    <label for="pass">Password: </label>
                    <input type="password" id="pass" name="pass" class="form-control-md">
                    <span class="text-danger"><%= request.getAttribute("pass") != null ? request.getAttribute("pass") : ""%></span>
                </div>
            </div>
            <div class="row">
                <div class="col-2">
                    <label for="repass">Re-Password: </label>
                    <input type="password" id="repass" name="repass" class="form-control-md">
                    <span class="text-danger"><%= request.getAttribute("repass") != null ? request.getAttribute("repass") : ""%></span>
                </div>
            </div> <br/>
            <div class="row">
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
