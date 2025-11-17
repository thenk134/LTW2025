package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.khachhang;

import java.io.IOException;

import DAO.khachhangDAO;
import Util.mahoa;

/**
 * Servlet implementation class dangnhap
 */
public class dangnhap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dangnhap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tendangnhap = request.getParameter("tendangnhap");
		String matkhau = request.getParameter("matkhau");
		
		matkhau = mahoa.toSHA1(matkhau);
		
		khachhang kh =  new khachhang();
		kh.setTendangnnhap(tendangnhap);
		kh.setMatkhau(matkhau);
		
		khachhangDAO khd = new khachhangDAO();
		khachhang khachHang = khd.selectByUsernameAndPassWord(kh);
		String url = "";
		if(khachHang!=null) {
			HttpSession	session = request.getSession();
			session.setAttribute("khachHang", khachHang);
			url = "/index.jsp";
		}else {
			request.setAttribute("baoLoi", "Tên đăng nhập hoặc mật khẩu không đúng!");
			url = "/login.jsp";
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}
	

}
