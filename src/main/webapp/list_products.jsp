<%@include file="CoreJSP/adminHead.jsp"%>
<title>List of Products</title>
</head>
<body>
<header>
    <%@include file="CoreJSP/adminHeader.jsp"%>
</header>
<main>
    <div class="container">
        <div class="container">
            <div class="row mb-2">
                <div class="col">
                    <a href="ProductController" class="btn btn-primary">All Products</a>
                </div>
                <div class="col">
                    <a href="update_product.jsp" class="btn btn-primary">Add Product</a>
                </div>
            </div>
            <div class="row">
                <table class="table table-striped">
                    <thead class="table-dark">
                    <th>Product ID</th>
                    <th>Product Name</th>
                    <%--<th>Product Id</th>
                    <th>Purchase Date</th>--%>
                    </thead>
                    <tbody>
                    <%= request.getAttribute("rows") != null ? request.getAttribute("rows") : "" %>
                    </tbody>
                </table>
            </div>
    </div>

</main>


</body>
</html>
