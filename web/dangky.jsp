<%-- 
    Document   : dangky
    Created on : Dec 28, 2023, 10:30:45 PM
    Author     : AD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <title>Đăng Ký</title>
    <style>
        .require{
            color: red;
        }
    </style>
</head>
<body>
    <%
        String baoLoi = request.getAttribute("baoLoi") +"";
        if(baoLoi == null || baoLoi.equals("null")){
            baoLoi = "";
        }
        String tenDangNhap = request.getAttribute("tenDangNhap") +"";
        if(tenDangNhap == null || tenDangNhap.equals("null")){
            tenDangNhap = "";
        }
        String matKhauNhapLai = request.getAttribute("matKhauNhapLai") +"";
        if(matKhauNhapLai == null || matKhauNhapLai.equals("null")){
            matKhauNhapLai = "";
        }
        String hoVaTen = request.getAttribute("hoVaTen") +"";
        if(hoVaTen == null || hoVaTen.equals("null")){
            hoVaTen = "";
        }
        String gioiTinh = request.getAttribute("gioiTinh") +"";
        if(gioiTinh == null || gioiTinh.equals("null")){
            gioiTinh = "";
        }
        String diaChi = request.getAttribute("diaChi") +"";
        if(diaChi == null || diaChi.equals("null")){
            diaChi = "";
        }
        String diaChiNhanHang = request.getAttribute("diaChiNhanHang") +"";
        if(diaChiNhanHang == null || diaChiNhanHang.equals("null")){
            diaChiNhanHang = "";
        }
        String diaChiMuaHang = request.getAttribute("diaChiMuaHang") +"";
        if(diaChiMuaHang == null || diaChiMuaHang.equals("null")){
            diaChiMuaHang = "";
        }
        String ngaySinh = request.getAttribute("ngaySinh") +"";
        if(ngaySinh == null || ngaySinh.equals("null")){
            ngaySinh = "";
        }
        String soDienThoai = request.getAttribute("soDienThoai") +"";
        if(soDienThoai == null || soDienThoai.equals("null")){
            soDienThoai = "";
        }
        String email = request.getAttribute("email") +"";
        if(email == null || email.equals("null")){
            email = "";
        }
        String dangKyNhanBangTin = request.getAttribute("thongBao") +"";
        if(dangKyNhanBangTin == null || dangKyNhanBangTin.equals("null")){
            dangKyNhanBangTin = "";
        }
    %>
    <div class="container">
        <form action="khach-hang" method="POST">
            <input type="hidden" name="action" value="register">
            <h1 class="text-center mt-5">Thông tin đăng ký</h1>
            <div class="row">
                <div class="col-md-6">
                    <h3>Tài Khoản</h3>
                    <label class="form-label" for="tenDangNhap">Tên đăng nhập</label><span class="require">*</span>
                    <input class="form form-control" type="text" name="tenDangNhap" id="tenDangNhap" required>
                    <label class="form-label" for="matKhau">Mật khẩu</label><span class="require">*</span>
                    <input class="form form-control" type="password" name="matKhau" id="matKhau" required onkeyup="kiemTraMatKhau()">
                    <label class="form-label" for="matKhauNhapLai">Nhập lại mật khẩu</label><span class="require">*</span>
                    <input class="form form-control" type="password" name="matKhauNhapLai" id="matKhauNhapLai" onkeyup="kiemTraMatKhau()">
                    <span class="require" id="msg"></span>
                    <h3 class="mt-3">Thông tin khách hàng</h3>
                    <label class="form-label" for="hoVaTen">Họ và Tên</label>
                    <input class="form form-control" type="text" name="hoVaTen" id="hoVaTen" value="<%=hoVaTen%>">
                    <label class="form-label" for="gioiTinh">Giới tính</label>
                    <select class="form form-control" name="gioiTinh" id="gioiTinh">
                        <option value=""></option>
                        <option value="Nam">Nam</option>
                        <option value="Nu">Nữ</option>
                    </select>
                    <label class="form-label" for="ngaySinh">Ngày Sinh</label>
                    <input class="form form-control" type="date" name="ngaySinh" id="ngaySinh">
                </div>
                <div class="col-md-6">
                    <h3>Địa chỉ</h3>
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
                    <label class="form-label" for="dieuKhoan">Đồng ý với điều khoản công ty</label> <span class="require">*</span>
                    <input class="form-check-input" type="checkbox" name="dieuKhoan" id="dieuKhoan" onchange="kiemTraDongY()">
                    <br>
                    <label class="form-label" for="thongBao">Nhận email thông báo</label> <span class="require">*</span>
                    <input class="form-check-input" type="checkbox" name="thongBao" id="thongBao" onchange="kiemTraDongY()">
                    <br>
                    <div class="require" id="baoLoi">
                        <%=baoLoi%>
                    </div>
                    <input class="btn btn-secondary form-control" type="submit" name="submit-btn" id="submit-btn" style="visibility: hidden;">
                </div>
            </div>
        </form>
    </div>
</body>
<script>
    function kiemTraMatKhau(){
        matKhau = document.getElementById("matKhau").value;
        matKhauNhapLai = document.getElementById("matKhauNhapLai").value;
        
        if(matKhau != matKhauNhapLai){
            document.getElementById("msg").innerHTML = "Mật khẩu không khớp!";
            return false;
        }else{
            document.getElementById("msg").innerHTML = "";
            return true;
        }
    }
    
    function kiemTraDongY(){
        dieuKhoan = document.getElementById("dieuKhoan");
        if(dieuKhoan.checked==true){
            document.getElementById("submit-btn").style.visibility="visible";
        }else{
            document.getElementById("submit-btn").style.visibility="hidden";
        }
        
    }
</script>
</html>
