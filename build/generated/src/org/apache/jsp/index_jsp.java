package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.KhachHang;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Cửa Hàng Sách</title>\n");
      out.write("        <link\n");
      out.write("            href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            integrity=\"sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT\"\n");
      out.write("            crossorigin=\"anonymous\">\n");
      out.write("        <script\n");
      out.write("            src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\"\n");
      out.write("            integrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script\n");
      out.write("            src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js\"\n");
      out.write("            integrity=\"sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Navbar -->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg bg-light\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\"> <img\n");
      out.write("                        src=\"https://1.bp.blogspot.com/-f_5JLvF9_gU/YZGM7p_fkFI/AAAAAAAAAVo/zHkM8tD3ioAvD1pFznG1kw-QOmOibu5ywCLcBGAsYHQ/s150/1-removebg-preview.png\"\n");
      out.write("                        alt=\"Bootstrap\" height=\"24\">\n");
      out.write("                </a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\"\n");
      out.write("                        data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\n");
      out.write("                        aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\n");
      out.write("                        aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\"\n");
      out.write("                                                aria-current=\"page\" href=\"#\">Trang chủ</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Combo\n");
      out.write("                                giảm giá</a></li>\n");
      out.write("                        <li class=\"nav-item dropdown\"><a\n");
      out.write("                                class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\"\n");
      out.write("                                data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> Thể loại </a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">Quần Jean</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">Áo thun</a></li>\n");
      out.write("                                <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">Áo sơ mi</a></li>\n");
      out.write("                            </ul></li>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <form class=\"d-flex\" role=\"search\">\n");
      out.write("                        <input class=\"form-control me-2\" type=\"search\"\n");
      out.write("                               placeholder=\"Nội dung tìm kiếm\" aria-label=\"Search\">\n");
      out.write("                        <button class=\"btn btn-outline-success\" type=\"submit\">Tìm</button>\n");
      out.write("                        ");

                            Object obj = session.getAttribute("KhachHang");
                            KhachHang khachHang = null;
                            if(obj!=null){
                                khachHang = (KhachHang) obj;
                            }
                            if(khachHang == null){
                        
      out.write("\n");
      out.write("                        <a class=\"btn btn-primary\" style=\"white-space: nowrap; margin-left: 5px;\" href=\"dangnhap.jsp\">\n");
      out.write("                            Đăng Nhập \n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"btn btn-secondary\" style=\"white-space: nowrap; margin-left: 5px;\" href=\"dangky.jsp\">\n");
      out.write("                            Đăng Ký \n");
      out.write("                        </a>\n");
      out.write("                        ");

                            }else{
                        
      out.write("\n");
      out.write("                        <!--                        <a style=\"white-space: nowrap; margin-left: 20px; margin-right: 20px;\">\n");
      out.write("                                                    <label>Xin chào ");
      out.print(khachHang.getTenDangNhap().toUpperCase());
      out.write("</label>\n");
      out.write("                                                </a>\n");
      out.write("                                                <a style=\"white-space: nowrap; margin-left: 10px; text-decoration: none;\" class=\"btn btn-warning\" href=\"do-logout\">Đăng Xuất</a>-->\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <li style=\"margin-right: 100px; list-style: none; color: white; padding: 10px;\" class=\"nav-item dropdown\">\n");
      out.write("                                <a style=\"padding: 5px;\" class=\"btn btn-secondary btn-outline-success nav-link dropdown-toggle me-2\" href=\"#\" role=\"button\"\n");
      out.write("                                    data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> Thông tin </a>\n");
      out.write("                                <ul class=\"dropdown-menu\"\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <label>\n");
      out.write("                                            <a style=\"white-space: nowrap; margin-left: 20px; margin-right: 20px;\">\n");
      out.write("                                                Xin chào ");
      out.print(khachHang.getTenDangNhap().toUpperCase());
      out.write("\n");
      out.write("                                            </a>\n");
      out.write("                                        </label>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <label>\n");
      out.write("                                            <a style=\"white-space: nowrap; margin-left: 20px; margin-right: 20px;\" class=\"btn\" href=\"thaydoithongtin.jsp\">\n");
      out.write("                                                Thay đổi thông tin\n");
      out.write("                                            </a>\n");
      out.write("                                        </label>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <label>\n");
      out.write("                                            <a style=\"white-space: nowrap; margin-left: 20px; margin-right: 20px;\" class=\"btn\" href=\"doimatkhau.jsp\">\n");
      out.write("                                                Đổi mật khẩu\n");
      out.write("                                            </a>\n");
      out.write("                                        </label>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <label>\n");
      out.write("                                            <a style=\"white-space: nowrap; margin-left: 20px; margin-right: 20px;\" class=\"btn\" href=\"dasboard\">\n");
      out.write("                                                Danh sách khách hàng\n");
      out.write("                                            </a>\n");
      out.write("                                        </label>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <label>\n");
      out.write("                                            <a style=\"white-space: nowrap; margin-left: 20px; margin-right: 20px;\" class=\"btn\" href=\"thaydoifile.jsp\">\n");
      out.write("                                                Up load file \n");
      out.write("                                            </a>\n");
      out.write("                                        </label>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a style=\"white-space: nowrap; margin-left: 20px; margin-right: 20px; text-decoration: none;\" class=\"btn btn-danger\" href=\"khach-hang?action=log-out\">Đăng Xuất</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul></li>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <!-- End Navbar -->\n");
      out.write("\n");
      out.write("    <!-- Page content -->\n");
      out.write("    <div class=\"container mt-4\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <!-- Menu left -->\n");
      out.write("            <div class=\"col-lg-3\">\n");
      out.write("                <div class=\"list-group \">\n");
      out.write("                    <a href=\"#\" class=\"list-group-item list-group-item-action\">\n");
      out.write("                        Thời trang nam </a> <a href=\"#\"\n");
      out.write("                                           class=\"list-group-item list-group-item-action\">Thời trang nữ</a> <a\n");
      out.write("                                           href=\"#\" class=\"list-group-item list-group-item-action\">Dành\n");
      out.write("                        cho bé</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- End Menu left -->\n");
      out.write("\n");
      out.write("            <!-- Slider and Products -->\n");
      out.write("            <div class=\"col-lg-9\">\n");
      out.write("                <!-- Slider -->\n");
      out.write("                <div id=\"carouselExampleIndicators\" class=\"carousel slide mb-4\"\n");
      out.write("                     data-bs-ride=\"true\">\n");
      out.write("                    <div class=\"carousel-indicators\">\n");
      out.write("                        <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\"\n");
      out.write("                                data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\"\n");
      out.write("                                aria-label=\"Slide 1\"></button>\n");
      out.write("                        <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\"\n");
      out.write("                                data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n");
      out.write("                        <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\"\n");
      out.write("                                data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-inner\">\n");
      out.write("                        <div class=\"carousel-item active\">\n");
      out.write("                            <img src=\"img/slide/1.png\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item\">\n");
      out.write("                            <img src=\"img/slide/2.png\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item\">\n");
      out.write("                            <img src=\"img/slide/3.png\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <button class=\"carousel-control-prev\" type=\"button\"\n");
      out.write("                            data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"prev\">\n");
      out.write("                        <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                        <span class=\"visually-hidden\">Previous</span>\n");
      out.write("                    </button>\n");
      out.write("                    <button class=\"carousel-control-next\" type=\"button\"\n");
      out.write("                            data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"next\">\n");
      out.write("                        <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                        <span class=\"visually-hidden\">Next</span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <!-- End Slider -->\n");
      out.write("                <!-- Products -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("<!--                    <div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("                        <div class=\"card h-100\">\n");
      out.write("                            <a href=\"#\"><img class=\"card-img-top\" src=\"img/product/1.png\"\n");
      out.write("                                             alt=\"\"></a>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title\">\n");
      out.write("                                    <a href=\"#\">Áo thun Pro-S1</a>\n");
      out.write("                                </h4>\n");
      out.write("                                <h5>50.000</h5>\n");
      out.write("                                <p class=\"card-text\">Sản phẩm thoáng mát, có độ bền tốt, giữ\n");
      out.write("                                    màu sắc tốt.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-footer\">\n");
      out.write("                                <small class=\"text-muted\">&#9733; &#9733; &#9733;\n");
      out.write("                                    &#9733; &#9734;</small>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>-->\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("                        <div class=\"card h-100\">\n");
      out.write("                            <a href=\"#\"><img class=\"card-img-top\" src=\"https://media2.coolmate.me/cdn-cgi/image/width=672,height=990,quality=85,format=auto/uploads/March2022/6-0.jpg\"\n");
      out.write("                                             alt=\"\" ></a>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title\">\n");
      out.write("                                    <a href=\"#\">Áo thun Pro-S1</a>\n");
      out.write("                                </h4>\n");
      out.write("                                <h5>50.000</h5>\n");
      out.write("                                <p class=\"card-text\">Sản phẩm thoáng mát, có độ bền tốt, giữ\n");
      out.write("                                    màu sắc tốt.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-footer\">\n");
      out.write("                                <small class=\"text-muted\">&#9733; &#9733; &#9733;\n");
      out.write("                                    &#9733; &#9734;</small>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("                        <div class=\"card h-100\">\n");
      out.write("                            <a href=\"#\"><img class=\"card-img-top\" src=\"https://media2.coolmate.me/cdn-cgi/image/width=672,height=990,quality=85,format=auto/uploads/March2023/thumb_tee_prmx_navy.jpg\"\n");
      out.write("                                             alt=\"\" ></a>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title\">\n");
      out.write("                                    <a href=\"#\">Áo thun Pro-S1</a>\n");
      out.write("                                </h4>\n");
      out.write("                                <h5>50.000</h5>\n");
      out.write("                                <p class=\"card-text\">Sản phẩm thoáng mát, có độ bền tốt, giữ\n");
      out.write("                                    màu sắc tốt.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-footer\">\n");
      out.write("                                <small class=\"text-muted\">&#9733; &#9733; &#9733;\n");
      out.write("                                    &#9733; &#9734;</small>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("<!--                    <div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("                        <div class=\"card h-100\">\n");
      out.write("                            <a href=\"#\"><img class=\"card-img-top\" src=\"img/product/1.png\"\n");
      out.write("                                             alt=\"\" ></a>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title\">\n");
      out.write("                                    <a href=\"#\">Áo thun Pro-S1</a>\n");
      out.write("                                </h4>\n");
      out.write("                                <h5>50.000</h5>\n");
      out.write("                                <p class=\"card-text\">Sản phẩm thoáng mát, có độ bền tốt, giữ\n");
      out.write("                                    màu sắc tốt.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-footer\">\n");
      out.write("                                <small class=\"text-muted\">&#9733; &#9733; &#9733;\n");
      out.write("                                    &#9733; &#9734;</small>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>-->\n");
      out.write("                </div>\n");
      out.write("                <!-- End Products -->\n");
      out.write("            </div>\n");
      out.write("            <!-- End Slider and Products -->\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Page content -->\n");
      out.write("\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <footer class=\"py-3 my-4\">\n");
      out.write("        <ul class=\"nav justify-content-center border-bottom pb-3 mb-3\">\n");
      out.write("            <li class=\"nav-item\"><a href=\"#\"\n");
      out.write("                                    class=\"nav-link px-2 text-muted\">Trag chủ</a></li>\n");
      out.write("            <li class=\"nav-item\"><a href=\"#\"\n");
      out.write("                                    class=\"nav-link px-2 text-muted\">Quy định giao hàng</a></li>\n");
      out.write("            <li class=\"nav-item\"><a href=\"#\"\n");
      out.write("                                    class=\"nav-link px-2 text-muted\">Quy định trả hàng</a></li>\n");
      out.write("            <li class=\"nav-item\"><a href=\"#\"\n");
      out.write("                                    class=\"nav-link px-2 text-muted\">Liên hệ</a></li>\n");
      out.write("            <li class=\"nav-item\"><a href=\"#\"\n");
      out.write("                                    class=\"nav-link px-2 text-muted\">Blogs</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <p class=\"text-center text-muted\">© 2024 book.vn, Inc</p>\n");
      out.write("    </footer>\n");
      out.write("    <!-- End footer -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
