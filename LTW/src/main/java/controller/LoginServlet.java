package controller;

import dao.UserDAO;
import model.User;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String u = request.getParameter("username"); // Lấy từ input name="username" bên JSP
        String p = request.getParameter("password"); // Lấy từ input name="password" bên JSP

        UserDAO dao = new UserDAO();
        User user = dao.checkLogin(u, p);

        if (user == null) {
            // Đăng nhập sai
            request.setAttribute("mess", "Sai tài khoản hoặc mật khẩu!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            // Đăng nhập đúng -> Lưu vào Session
            HttpSession session = request.getSession();
            session.setAttribute("acc", user);

            // Kiểm tra quyền Admin hay User
            if (user.getRole() == 1) {
                response.sendRedirect("admin/dashboard.jsp"); // Tạo trang này sau
            } else {
                response.sendRedirect("index.jsp"); // Về trang chủ
            }
        }
    }
}