<%-- 
    Document   : index
    Created on : Dec 28, 2023, 10:31:21 PM
    Author     : AD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.KhachHang"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Cửa Hàng Sách</title>
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
            crossorigin="anonymous">
        <script
            src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
            integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
        crossorigin="anonymous"></script>
        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
            integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz"
        crossorigin="anonymous"></script>
    </head>
    <body>
        <!-- Navbar -->
        <nav class="navbar navbar-expand-lg bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#"> <img
                        src="https://1.bp.blogspot.com/-f_5JLvF9_gU/YZGM7p_fkFI/AAAAAAAAAVo/zHkM8tD3ioAvD1pFznG1kw-QOmOibu5ywCLcBGAsYHQ/s150/1-removebg-preview.png"
                        alt="Bootstrap" height="24">
                </a>
                <button class="navbar-toggler" type="button"
                        data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false"
                        aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item"><a class="nav-link active"
                                                aria-current="page" href="#">Trang chủ</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Combo
                                giảm giá</a></li>
                        <li class="nav-item dropdown"><a
                                class="nav-link dropdown-toggle" href="#" role="button"
                                data-bs-toggle="dropdown" aria-expanded="false"> Thể loại </a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="#">Quần Jean</a></li>
                                <li><a class="dropdown-item" href="#">Áo thun</a></li>
                                <li><hr class="dropdown-divider"></li>
                                <li><a class="dropdown-item" href="#">Áo sơ mi</a></li>
                            </ul></li>
                        </li>
                    </ul>
                    <form class="d-flex" role="search">
                        <input class="form-control me-2" type="search"
                               placeholder="Nội dung tìm kiếm" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Tìm</button>
                        <%
                            Object obj = session.getAttribute("KhachHang");
                            KhachHang khachHang = null;
                            if(obj!=null){
                                khachHang = (KhachHang) obj;
                            }
                            if(khachHang == null){
                        %>
                        <a class="btn btn-primary" style="white-space: nowrap; margin-left: 5px;" href="dangnhap.jsp">
                            Đăng Nhập 
                        </a>
                        <a class="btn btn-secondary" style="white-space: nowrap; margin-left: 5px;" href="dangky.jsp">
                            Đăng Ký 
                        </a>
                        <%
                            }else{
                        %>
                        <!--                        <a style="white-space: nowrap; margin-left: 20px; margin-right: 20px;">
                                                    <label>Xin chào <%=khachHang.getTenDangNhap().toUpperCase()%></label>
                                                </a>
                                                <a style="white-space: nowrap; margin-left: 10px; text-decoration: none;" class="btn btn-warning" href="do-logout">Đăng Xuất</a>-->
                        <div class="container">
                            <li style="margin-right: 100px; list-style: none; color: white; padding: 10px;" class="nav-item dropdown">
                                <a style="padding: 5px;" class="btn btn-secondary btn-outline-success nav-link dropdown-toggle me-2" href="#" role="button"
                                    data-bs-toggle="dropdown" aria-expanded="false"> Thông tin </a>
                                <ul class="dropdown-menu"">
                                    <li>
                                        <label>
                                            <a style="white-space: nowrap; margin-left: 20px; margin-right: 20px;">
                                                Xin chào <%=khachHang.getTenDangNhap().toUpperCase()%>
                                            </a>
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <a style="white-space: nowrap; margin-left: 20px; margin-right: 20px;" class="btn" href="thaydoithongtin.jsp">
                                                Thay đổi thông tin
                                            </a>
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <a style="white-space: nowrap; margin-left: 20px; margin-right: 20px;" class="btn" href="doimatkhau.jsp">
                                                Đổi mật khẩu
                                            </a>
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <a style="white-space: nowrap; margin-left: 20px; margin-right: 20px;" class="btn" href="dasboard">
                                                Danh sách khách hàng
                                            </a>
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <a style="white-space: nowrap; margin-left: 20px; margin-right: 20px;" class="btn" href="thaydoifile.jsp">
                                                Up load file 
                                            </a>
                                        </label>
                                    </li>
                                    <li>
                                        <a style="white-space: nowrap; margin-left: 20px; margin-right: 20px; text-decoration: none;" class="btn btn-danger" href="khach-hang?action=log-out">Đăng Xuất</a>
                                    </li>
                                </ul></li>
                        </div>

                </div>
                <%
                    }
                %>
                </form>
            </div>
        </div>
    </nav>
    <!-- End Navbar -->

    <!-- Page content -->
    <div class="container mt-4">
        <div class="row">
            <!-- Menu left -->
            <div class="col-lg-3">
                <div class="list-group ">
                    <a href="#" class="list-group-item list-group-item-action">
                        Thời trang nam </a> <a href="#"
                                           class="list-group-item list-group-item-action">Thời trang nữ</a> <a
                                           href="#" class="list-group-item list-group-item-action">Dành
                        cho bé</a>
                </div>
            </div>
            <!-- End Menu left -->

            <!-- Slider and Products -->
            <div class="col-lg-9">
                <!-- Slider -->
                <div id="carouselExampleIndicators" class="carousel slide mb-4"
                     data-bs-ride="true">
                    <div class="carousel-indicators">
                        <button type="button" data-bs-target="#carouselExampleIndicators"
                                data-bs-slide-to="0" class="active" aria-current="true"
                                aria-label="Slide 1"></button>
                        <button type="button" data-bs-target="#carouselExampleIndicators"
                                data-bs-slide-to="1" aria-label="Slide 2"></button>
                        <button type="button" data-bs-target="#carouselExampleIndicators"
                                data-bs-slide-to="2" aria-label="Slide 3"></button>
                    </div>
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img src="img/slide/1.png" class="d-block w-100" alt="...">
                        </div>
                        <div class="carousel-item">
                            <img src="img/slide/2.png" class="d-block w-100" alt="...">
                        </div>
                        <div class="carousel-item">
                            <img src="img/slide/3.png" class="d-block w-100" alt="...">
                        </div>
                    </div>
                    <button class="carousel-control-prev" type="button"
                            data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Previous</span>
                    </button>
                    <button class="carousel-control-next" type="button"
                            data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Next</span>
                    </button>
                </div>
                <!-- End Slider -->
                <!-- Products -->
                <div class="row">
<!--                    <div class="col-lg-4 col-md-6 mb-4">
                        <div class="card h-100">
                            <a href="#"><img class="card-img-top" src="img/product/1.png"
                                             alt=""></a>
                            <div class="card-body">
                                <h4 class="card-title">
                                    <a href="#">Áo thun Pro-S1</a>
                                </h4>
                                <h5>50.000</h5>
                                <p class="card-text">Sản phẩm thoáng mát, có độ bền tốt, giữ
                                    màu sắc tốt.</p>
                            </div>
                            <div class="card-footer">
                                <small class="text-muted">&#9733; &#9733; &#9733;
                                    &#9733; &#9734;</small>
                            </div>
                        </div>
                    </div>-->

                    <div class="col-lg-4 col-md-6 mb-4">
                        <div class="card h-100">
                            <a href="#"><img class="card-img-top" src="https://media2.coolmate.me/cdn-cgi/image/width=672,height=990,quality=85,format=auto/uploads/March2022/6-0.jpg"
                                             alt="" ></a>
                            <div class="card-body">
                                <h4 class="card-title">
                                    <a href="#">Áo thun Pro-S1</a>
                                </h4>
                                <h5>50.000</h5>
                                <p class="card-text">Sản phẩm thoáng mát, có độ bền tốt, giữ
                                    màu sắc tốt.</p>
                            </div>
                            <div class="card-footer">
                                <small class="text-muted">&#9733; &#9733; &#9733;
                                    &#9733; &#9734;</small>
                            </div>
                        </div>
                    </div>


                    <div class="col-lg-4 col-md-6 mb-4">
                        <div class="card h-100">
                            <a href="#"><img class="card-img-top" src="https://media2.coolmate.me/cdn-cgi/image/width=672,height=990,quality=85,format=auto/uploads/March2023/thumb_tee_prmx_navy.jpg"
                                             alt="" ></a>
                            <div class="card-body">
                                <h4 class="card-title">
                                    <a href="#">Áo thun Pro-S1</a>
                                </h4>
                                <h5>50.000</h5>
                                <p class="card-text">Sản phẩm thoáng mát, có độ bền tốt, giữ
                                    màu sắc tốt.</p>
                            </div>
                            <div class="card-footer">
                                <small class="text-muted">&#9733; &#9733; &#9733;
                                    &#9733; &#9734;</small>
                            </div>
                        </div>
                    </div>

<!--                    <div class="col-lg-4 col-md-6 mb-4">
                        <div class="card h-100">
                            <a href="#"><img class="card-img-top" src="img/product/1.png"
                                             alt="" ></a>
                            <div class="card-body">
                                <h4 class="card-title">
                                    <a href="#">Áo thun Pro-S1</a>
                                </h4>
                                <h5>50.000</h5>
                                <p class="card-text">Sản phẩm thoáng mát, có độ bền tốt, giữ
                                    màu sắc tốt.</p>
                            </div>
                            <div class="card-footer">
                                <small class="text-muted">&#9733; &#9733; &#9733;
                                    &#9733; &#9734;</small>
                            </div>
                        </div>
                    </div>-->
                </div>
                <!-- End Products -->
            </div>
            <!-- End Slider and Products -->
        </div>
    </div>
    <!-- End Page content -->

    <!-- Footer -->
    <footer class="py-3 my-4">
        <ul class="nav justify-content-center border-bottom pb-3 mb-3">
            <li class="nav-item"><a href="#"
                                    class="nav-link px-2 text-muted">Trag chủ</a></li>
            <li class="nav-item"><a href="#"
                                    class="nav-link px-2 text-muted">Quy định giao hàng</a></li>
            <li class="nav-item"><a href="#"
                                    class="nav-link px-2 text-muted">Quy định trả hàng</a></li>
            <li class="nav-item"><a href="#"
                                    class="nav-link px-2 text-muted">Liên hệ</a></li>
            <li class="nav-item"><a href="#"
                                    class="nav-link px-2 text-muted">Blogs</a></li>
        </ul>
        <p class="text-center text-muted">© 2024 book.vn, Inc</p>
    </footer>
    <!-- End footer -->

</body>
</html>
