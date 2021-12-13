<%@include file="CoreJSP/adminHead.jsp"%>
<title>List of Registered Devices</title>
</head>
<body>
<header>
    <%@include file="CoreJSP/adminHeader.jsp"%>
</header>
<main>
    <div class="container">
        <a href="DeviceRegisterController" class="btn btn-primary mb-2">All Registered Devices</a>
        <table class="table table-striped">
            <thead class="table-dark">
            <th>User Name</th>
            <th>Serial No</th>
            <th>Product Id</th>
            <th>Purchase Date</th>
            </thead>
            <tbody>
            <%= request.getAttribute("rows") != null ? request.getAttribute("rows") : "" %>
            </tbody>

        </table>

    </div>

</main>


</body>
</html>
