<%@include file="CoreJSP/head.jsp"%>
    <title>Title</title>
</head>
<body>
<%@include file="CoreJSP/header.jsp"%>
<main>
    <div class="container">
        <h1 class="h1 text-center text-black-50"> Registration Form </h1>
        <form action="#" method="post">
            <div class="row">
                <div class="col-2">
                    <label for="fname">First Name: </label>
                    <input type="text" id="fname" name="fname" class="form-control-md">
                </div>
            </div>
            <div class="row">
                <div class="col-2">
                    <label for="lname">Last Name: </label>
                    <input type="text" id="lname" name="lname" class="form-control-md">
                </div>
            </div>
            <div class="row">
                <div class="col-2">
                    <label for="address">Address: </label>
                    <input type="text" id="address" name="address" class="form-control-md">
                </div>
            </div>
            <div class="row">
                <div class="col-2">
                    <label for="phone" class="form-text-label">Phone Number: </label>
                    <input type="text" id="phone" name="phone" class="form-control-md">
                </div>
            </div>
            <div class="row">
                <div class="col-2">
                    <label for="email">Email Address: </label>
                    <input type="text" id="email" name="email" class="form-control-md">
                </div>
            </div>
            <div class="row">
                <div class="col-2">
                    <label for="user">User ID: </label>
                    <input type="text" id="user" name="user" class="form-control-md">
                </div>
            </div>
            <div class="row">
                <div class="col-2">
                    <label for="pass">Password: </label>
                    <input type="password" id="pass" name="pass" class="form-control-md">
                </div>
            </div>
            <div class="row">
                <div class="col-2">
                    <label for="repass">User ID: </label>
                    <input type="text" id="repass" name="repass" class="form-control-md">
                </div>
            </div> <br/>
            <div class="row">
                <div class="col-2">
                    <input type="submit" id="btn" name="btn" class="btn btn-primary" value="Register">
                </div>
            </div>

        </form>


    </div>
</main>
<%@ include file="CoreJSP/footer.jsp"%>
</body>
</html>
