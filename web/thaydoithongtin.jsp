<%-- 
    Document   : thaydoithongtin
    Created on : Jan 3, 2024, 12:52:00 PM
    Author     : AD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.KhachHang"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thông tin khách hàng</title>
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
                String hoVaTen = khachHang.getHoVaTen();
                String gioiTinh = khachHang.getGioiTinh();
                String diaChi = khachHang.getDiaChi();
                String diaChiNhanHang = khachHang.getDiaChiNhanHang();
                String diaChiMuaHang = khachHang.getDiaChiMuaHang();
                String ngaySinh = khachHang.getNgaySinh().toString();
                String soDienThoai = khachHang.getSoDienThoai();
                String email = khachHang.getEmail();
                boolean dangKyNhanBangTin = khachHang.isDangKyNhanBangTin();
        %>
        <div class="container">
            <h1 class="text-center mt-5 mb-4 text-info">THÔNG TIN KHÁCH HÀNG</h1>
            <form action="khach-hang" method="POST">
                <input type="hidden" name="action" value="change-info">
                <div class="row">
                    <div class="col-md-6">
                        <span class="require" id="msg"></span>
                        <h3 class="mt-3">Thông tin khách hàng</h3>
                        <label class="form-label" for="hoVaTen">Họ và Tên</label>
                        <input class="form form-control" type="text" name="hoVaTen" id="hoVaTen" value="<%=hoVaTen%>">
                        <label class="form-label" for="gioiTinh">Giới tính</label>
                        <select class="form form-control" name="gioiTinh" id="gioiTinh">
                            <option value=""></option>
                            <option value="Nam" <%=(gioiTinh.equals("Nam"))?"selected='selected'":""%>>Nam</option>
                            <option value="Nu" <%=(gioiTinh.equals("Nu"))?"selected='selected'":""%>>Nữ</option>
                        </select>
                        <label class="form-label" for="ngaySinh">Ngày Sinh</label>
                        <input class="form form-control" type="date" name="ngaySinh" id="ngaySinh" value="<%=ngaySinh%>">
                    </div>
                    <div class="col-md-6">
                        <h3 class="mt-3">Địa chỉ</h3>
                        <label class="form-label" class="" for="diaChiKhachHang">Địa chỉ khách hàng</label>
                        <input class="form form-control" type="text" name="diaChi" id="diaChi" required value="<%=diaChi%>">
                        <label class="form-label" class="" for="diaChiMuaHang">Địa chỉ mua hàng</label>
                        <input class="form form-control" type="text" name="diaChiMuaHang" id="diaChiMuaHang" required value="<%=diaChiMuaHang%>">
                        <label class="form-label" for="diaChiNhanHang">Địa chỉ nhận hàng</label>
                        <input class="form form-control" type="text" name="diaChiNhanHang" id="diaChiNhanHang" value="<%=diaChiNhanHang%>">
                        <label class="form-label" class="" for="sdt">Số điện thoại</label>
                        <input class="form form-control" type="text" name="sdt" id="sdt" required value="<%=soDienThoai%>">
                        <label class="form-label" class="" for="email">Email</label>
                        <input class="form form-control" type="email" name="email" id="email" required value="<%=email%>">

                        <br>
                        <label class="form-label" for="thongBao">Nhận email thông báo</label> <span class="require">*</span>
                        <input class="form-check-input" type="checkbox" name="thongBao" id="thongBao" <%=dangKyNhanBangTin?"checked":""%>>
                        <br>
                        <div class="require" id="baoLoi">
                            <%=baoLoi%>
                        </div>
                        <input class="btn btn-info form-control" type="submit" name="submit-btn" id="submit-btn" style="" value="Lưu">
                    </div>
                </div>
            </form>
        </div>
        <%
            }
        %>
    </body>
</html>
