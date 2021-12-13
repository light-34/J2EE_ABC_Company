<nav class="navbar navbar-expand-lg navbar-light bg-light header" id="header">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp"><h4 class="ms-4 text-black-50">ABC COMPANY</h4></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="about.jsp">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="contact.jsp" >Contact</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                       data-bs-toggle="dropdown" aria-expanded="false">
                        Services
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="regdevice.jsp">Device Register</a></li>
                        <%--<li><hr class="dropdown-divider"></li>
                        <li><a class="dropdown-item" href="update.jsp">Update</a></li>
                        <li><hr class="dropdown-divider"></li>
                        <li><a class="dropdown-item" href="insert.jsp">Insert</a></li>--%>
                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="register.jsp">Register</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="login.jsp" >Login</a>
                </li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success me-4" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>