<%-- 
    Document   : changeinfosuccess
    Created on : Jan 3, 2024, 4:13:34 PM
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
        <div class="container text-center">
            <h1 class="text-success">Thành Công</h1>
            <p>Thông tin của quý khách đã được cập nhật !</p>
            <p class="text-secondary">Vui lòng đợi trong giây lát.</p>
        </div>
        <%
            }
        %>
    </body>
    <script>
        setTimeout(function (){
            window.location.href ="index.jsp";
        }, 3000);
    </script>
</html>
