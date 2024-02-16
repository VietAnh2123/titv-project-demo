/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import database.KhachHangDAO;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.util.UUID;
import model.KhachHang;

/**
 *
 * @author AD
 */
public class KhachHangServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet KhachHangServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet KhachHangServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String action = request.getParameter("action");
            if(action.equals("log-in")){
                dangNhap(request, response);
            }else if(action.equals("register")){
                dangKy(request, response);
            }else if(action.equals("change-password")){
                doiMatKhau(request, response);
            }else if(action.equals("change-info")){
                doiThongTin(request, response);
            }else if(action.equals("log-out")){
                dangXuat(request, response);
            }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    private void dangKy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String tenDangNhap = request.getParameter("tenDangNhap");
        String matKhau = request.getParameter("matKhau");
        String matKhauNhapLai = request.getParameter("matKhauNhapLai");
        String hoVaTen = request.getParameter("hoVaTen");
        String gioiTinh = request.getParameter("gioiTinh");
        String diaChi = request.getParameter("diaChi");
        String diaChiNhanHang = request.getParameter("diaChiNhanHang");
        String diaChiMuaHang = request.getParameter("diaChiMuaHang");
        String ngaySinh = request.getParameter("ngaySinh");
        String soDienThoai = request.getParameter("sdt");
        String email = request.getParameter("email");
        String dangKyNhanBangTin = request.getParameter("thongBao");

        request.setAttribute("tenDangNhap", tenDangNhap);
        request.setAttribute("hoVaTen", hoVaTen);
        request.setAttribute("gioiTinh", gioiTinh);
        request.setAttribute("diaChi", diaChi);
        request.setAttribute("diaChiNhanHang", diaChiNhanHang);
        request.setAttribute("diaChiMuaHang", diaChiMuaHang);
        request.setAttribute("ngaySinh", ngaySinh);
        request.setAttribute("soDienThoai", soDienThoai);
        request.setAttribute("email", email);
        request.setAttribute("thongBao", dangKyNhanBangTin);

        String error = "";
        String url = "/";
        KhachHangDAO khDAO = new KhachHangDAO();
        if (khDAO.kiemTraTenDangNhap(tenDangNhap)) {
            error += "Tên đăng nhập đã tồn tại\n";
        }
        if (!matKhau.equals(matKhauNhapLai)) {
            error += "Mật khẩu không khớp!";
        }
        request.setAttribute("baoLoi", error);
        if (error.length() > 0) {
            url = "/dangky.jsp";
        } else {
            KhachHang kh = new KhachHang(UUID.randomUUID() + "", tenDangNhap, matKhau, hoVaTen, gioiTinh, diaChi, diaChiNhanHang, diaChiMuaHang, Date.valueOf(ngaySinh), soDienThoai, email, dangKyNhanBangTin != null);
            khDAO.insert(kh);
            HttpSession session = request.getSession();
            session.setAttribute("KhachHang", kh);
            url = "/success.jsp";
            
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }

    private void dangNhap(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        request.setAttribute("username", username);
        String errorMsg = "";
        String url="/";
        if(username==null || username.length() == 0){
            errorMsg +="Vui lòng điền tên đăng nhập!";
        }else if(password==null || password.length() == 0){
            errorMsg +="Vui lòng điền mật khẩu!";
        }
        
        if(errorMsg.length()>0){
            url="/dangnhap.jsp";
        }
        KhachHangDAO khDAO = new KhachHangDAO();
        KhachHang kh = new KhachHang();
        kh.setTenDangNhap(username);
        kh.setMatKhau(password);
        
        KhachHang khachHang = khDAO.kiemTraTaiKhoan(kh);
        if(khachHang != null){
            HttpSession session = request.getSession();
            session.setAttribute("KhachHang", khachHang);
            url = "/index.jsp";
        }else{
            errorMsg +="Tài khoản hoặc Mật khẩu không đúng!";
            url = "/dangnhap.jsp";
        }
        request.setAttribute("errorLogIn", errorMsg);
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }

    private void dangXuat(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        session.invalidate();
        String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
        
        response.sendRedirect(url+"/index.jsp");
    }

    private void doiMatKhau(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String oldPassword = request.getParameter("oldPassword");
        String newPassword = request.getParameter("newPassword");
        String confirmNewPassword = request.getParameter("confirmNewPassword");
        
        String errorMsg = "";
        String url = "/";
        
        HttpSession session = request.getSession();
        Object obj = session.getAttribute("KhachHang");
        KhachHang kh = null;
        if(obj!=null){
            kh = (KhachHang) obj;
        }
        if(kh==null){
            errorMsg += "Bạn chưa đăng nhập vào hệ thống!";
            url = "/doimatkhau.jsp";
        }else{
            if(!oldPassword.equals(kh.getMatKhau())){
                errorMsg += "Mật khẩu cũ không đúng!";
                url = "/doimatkhau.jsp";
            }else if(oldPassword.equals(newPassword)){
                errorMsg += "Mật khẩu mới không được trùng với mật khẩu cũ!";
                url = "/doimatkhau.jsp";
            }else{
                if(!newPassword.equals(confirmNewPassword)){
                    errorMsg += "Mật khẩu mới không khớp!";
                    url = "/doimatkhau.jsp";
                }else{
                    kh.setMatKhau(newPassword);
                    KhachHangDAO khDAO = new KhachHangDAO();
                    if(!khDAO.changePassword(kh)){
                        errorMsg += "Thay đổi mật khẩu thành công";
                        url = "/doimatkhau.jsp";
                    }else{
                        errorMsg += "Thay đổi mật khẩu thất bại!";
                        url = "/doimatkhau.jsp";
                    }
                }
            }
        }
        request.setAttribute("baoLoi", errorMsg);
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }

    private void doiThongTin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String hoVaTen = request.getParameter("hoVaTen");
        String gioiTinh = request.getParameter("gioiTinh");
        String diaChi = request.getParameter("diaChi");
        String diaChiNhanHang = request.getParameter("diaChiNhanHang");
        String diaChiMuaHang = request.getParameter("diaChiMuaHang");
        String ngaySinh = request.getParameter("ngaySinh");
        String soDienThoai = request.getParameter("sdt");
        String email = request.getParameter("email");
        String dangKyNhanBangTin = request.getParameter("thongBao");
        
        String errorMsg = "";
        String url = "/";
        
        KhachHangDAO khDAO = new KhachHangDAO();
        HttpSession session = request.getSession();
        Object obj = session.getAttribute("KhachHang");
        KhachHang khachHang = null;
        
        if(errorMsg.length()>0){
            url = "/thaydoithongtin.jsp";
        }else{
            if(obj!=null){  
                khachHang = (KhachHang) obj;
                if(khachHang!=null){
                    String maKhachHang = khachHang.getMaKhachHang();
                    String tenDangNhap = khachHang.getTenDangNhap();
                    String matKhau = khachHang.getMatKhau();
                    KhachHang kh = new KhachHang(maKhachHang, "", "", hoVaTen, gioiTinh, diaChi, diaChiNhanHang, diaChiMuaHang, Date.valueOf(ngaySinh), soDienThoai, email, dangKyNhanBangTin!=null);
                    khDAO.update(kh);
                    
                    KhachHang khNewInfo = khDAO.selectById(kh);
                    session.setAttribute("KhachHang", khNewInfo);
                    url = "/changeinfosuccess.jsp";
                }
            }
        }
        request.setAttribute("baoLoi", errorMsg);
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
