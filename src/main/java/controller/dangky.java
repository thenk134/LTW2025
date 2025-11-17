package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.khachhang;

import java.io.IOException;
import java.sql.Date;
import java.util.Random;

import DAO.khachhangDAO;
import Util.mahoa;

/**
 * Servlet implementation class dangky
 */
public class dangky extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dangky() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	
		String tendangnhap = request.getParameter("tendangnhap");
		String matkhau = request.getParameter("matkhau");
		String matKhauNhapLai = request.getParameter("matKhauNhapLai");
		String tenkhachhang = request.getParameter("tenkhachhang");
		String email = request.getParameter("email");
		
		request.setAttribute("tendangnhap", tendangnhap);		
		request.setAttribute("tenkhachhang", tenkhachhang);
		request.setAttribute("email", email);	
		
		
		String url = "";
		String baoLoi = "";
		khachhangDAO khachHangDAO = new khachhangDAO();

		if(khachHangDAO.kiemTraTenDangNhap(tendangnhap)) {
			baoLoi +="Tên đăng nhập đã tồn tại, vui lòng chọn tên đăng nhập khác.<br/>";
		}
		if(!matkhau.equals(matKhauNhapLai)) {
			baoLoi += "Mat khau khong khop. <br/>";
		}else {
			tenkhachhang = tenkhachhang;
			matkhau = mahoa.toSHA1(matkhau);
		}
		request.setAttribute("baoLoi", baoLoi);
		
		
		if(baoLoi.length()>0) {
			url = "/register.jsp";
		}else {
			Random rd = new Random();
			String maKhachHang = System.currentTimeMillis() + rd.nextInt(1000) +"";
			khachhang kh = new khachhang(maKhachHang, tenkhachhang, tendangnhap, matkhau, email, new Date(1-1-1970), null, null, null);
			khachhangDAO.getIn().insert(kh);
			url = "/thanks.jsp";
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
