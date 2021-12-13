<nav class="navbar navbar-expand-lg navbar-light bg-light header" id="header">
    <div class="container-fluid">
        <a class="navbar-brand" href="./admin_home.jsp"><h6 class="ms-4 text-black-50">ABC COMPANY ADMIN PANEL</h6></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="./admin_home.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="./list_users.jsp">Users</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="./list_registered_device.jsp">Registered Devices</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="./list_products.jsp">Products</a>
                </li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success me-4" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>