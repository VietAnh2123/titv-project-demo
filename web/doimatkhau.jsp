<%-- 
    Document   : doimatkhau
    Created on : Jan 2, 2024, 10:23:25 PM
    Author     : AD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.KhachHang"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đổi mật khẩu</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <style>
        .require{
            color: red;
        }
        </style>
    </head>
    <body>
        <%
            Object obj = session.getAttribute("KhachHang");
            KhachHang khachHang = null;
            if(obj!=null){
                khachHang = (KhachHang) obj;
            }
            if(khachHang == null){
        %>
        <div class="container text-center mt-5">
            <h1 class="">Bạn chưa <a class="text-warning" href="dangnhap.jsp">Đăng nhập</a> vào hệ thống! Vui lòng quay lại <a href="index.jsp">Trang chủ</a>.</h1>
        </div>
        <%
            }else{
                String baoLoi = request.getAttribute("baoLoi") +"";
                if(baoLoi==null || baoLoi.equals("null")){
                    baoLoi = "";
                }
        %>
        <div class="container text-center">
            <h1>Đổi mật khẩu</h1>
            <form action="khach-hang" method="POST">
                <input type="hidden" name="action" value="change-password">
                <div class="">
                    <label class="mt-3"><input type="password" name="oldPassword" id="oldPassword" value="" class="form form-control" placeholder="Mật khẩu cũ"></label><br>
                    <label class="mt-3"><input type="password" name="newPassword" id="newPassword" value="" class="form form-control" placeholder="Mật khẩu mới" onkeyup="kiemTraMatKhauMoi()"></label><br>
                    <span class="require" id="msg"></span><br>
                    <label class="mt-3"><input type="password" name="confirmNewPassword" id="confirmNewPassword" value="" class="form form-control" placeholder="Xác nhận mật khẩu mới"></label><br>

                    <span class="require">
                        <%=baoLoi%>
                    </span><br>

                    <input class="btn btn-primary mt-5" type="submit" name="changePassword-btn" id="changePassword-btn" value="Xác nhận" onclick="setTimeout(function (){
                        window.location.href = "index.jsp";
                    },2000)"><br>
                    <a><a href="index.jsp">Trang chủ</a>
                </div>
            </form>
        </div>
        <%
                }
        %>
    </body>
    <script>
        function kiemTraMatKhauMoi(){
            matKhauCu = document.getElementById("oldPassword").value;
            matKhauMoi = document.getElementById("newPassword").value;
        
            if(matKhauCu == matKhauMoi){
                document.getElementById("msg").innerHTML = "Mật khẩu mới không được trùng với mật khẩu cũ!";
            return false;
            }else{
                document.getElementById("msg").innerHTML = "";
                return true;
            }
        }
    </script>
</html>