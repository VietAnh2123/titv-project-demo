<%-- 
    Document   : success
    Created on : Dec 31, 2023, 6:51:35 PM
    Author     : AD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.KhachHang"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>!!!</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <link rel="stylesheet" href="../styleRegister.css">
        <style>
            a{
                text-decoration: none;
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
        %>
        <div class="container text-center mt-5">
            <h1>Chúc mừng bạn đăng ký tài khoản thành công !</h1>
            <a href="index.jsp">Trang chủ</a> | <a href="dangnhap.jsp">Đăng nhập ngay</a>
        </div>
        <%
            }
        %>
    </body>
    <script>
        setTimeout(function (){
            window.location.href = 'index.jsp';
        },5000);
    </script>
</html>
