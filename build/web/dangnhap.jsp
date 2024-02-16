<%-- 
    Document   : dangnhap
    Created on : Jan 2, 2024, 9:09:23 AM
    Author     : AD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <style>
            a{
                text-decoration: none;
            }
            .require{
                color: red;
            }
        </style>
    </head>
    <body>
        <%
            String errorLogIn = request.getAttribute("errorLogIn")+"";
            if(errorLogIn==null || errorLogIn.equals("null")){
                errorLogIn = "";
            }
            String username = request.getAttribute("username") +"";
            if(username==null || username.equals("null")){
                username ="";
            }
        %>
        <div class="container text-center">
            <h1 class="text-center mt-5">Đăng Nhập Tài Khoản</h1>
            <form action="khach-hang" method="POST">
                <input type="hidden" name="action" value="log-in">
                <div class="">
                    <label class="mt-3"><input type="text" name="username" id="username" value="<%=username%>" class="form form-control" placeholder="Tên đăng nhập"></label><br>
                    <label class="mt-3"><input type="password" name="password" id="password" value="" class="form form-control" placeholder="Mật khẩu"></label><br>
                    <span class="require"><%=errorLogIn%></span><br>
                    <label class="py-3"><input type="checkbox" name="isRemember" id="isRemember" class="form-check-input"> Remember Me</label><br>
                    <input class="btn btn-primary mb-3 px-5" type="submit" name="submit-btn" value="Đăng Nhập"><br>
                    <p>Bạn chưa có tài khoản? <a href="dangky.jsp">Đăng ký đi</a></p>
                </div>
            </form>
        </div>
    </body>
</html>
