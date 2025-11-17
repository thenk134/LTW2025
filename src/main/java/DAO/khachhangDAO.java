package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.khachhang;
import database.JDBCUtil;

public class khachhangDAO implements interfaceDAO<khachhang> {

	public static khachhangDAO getIn() {
		return new khachhangDAO();
	}

	@Override
	public int insert(khachhang t) {
		// TODO Auto-generated method stub

		try {
			// tao ket noi csdl
			Connection c = JDBCUtil.getConnection();
			// TAO ra doi tuong statement
			Statement statement = c.createStatement();
			// thuc thi
			String sql = "INSERT INTO khachhang(makhachhang, tenkhachhang, tendangnhap, matkhau, email, ngaysinh, dienthoai, gioitinh, diachi) "
					+ " VALUES ('" + t.getMakhachhang() + "' , '" + t.getTenkhachhang() + "' , '" + t.getTendangnnhap()
					+ "' , '" + t.getMatkhau() + "' , '" + t.getEmail() + "' , '" + t.getNgaysinh() + "' , '"
					+ t.getDenthoai() + "' , '" + t.getGioitinh() + "' , '" + t.getDiachi() + "')";

			System.out.println(sql);

			System.out.println("ban da thuc thi " + sql);

			int ketqua = statement.executeUpdate(sql);

			System.out.println("da thuc thi: " + sql);
			System.out.println("dong bi thay doi" + ketqua + "dong bi thay doi");

			JDBCUtil.closeConnection(c);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int update(khachhang t) {
		// TODO Auto-generated method stub

		try {
			// tao ket noi csdl
			Connection c = JDBCUtil.getConnection();
			// TAO ra doi tuong statement
			Statement statement = c.createStatement();
			// thuc thi

			String sql = "UPDATE khachhang " + " SET " + "tenkhachhang='" + t.getTenkhachhang() + "'"
					+ ", tendangnhap='" + t.getTendangnnhap() + "'" + ", matkhau='" + t.getMatkhau() + "'" + ", email='"
					+ t.getEmail() + "'" + ", ngaysinh='" + t.getNgaysinh() + "'" + ", dienthoai='" + t.getDenthoai()
					+ "'" + ", gioitinh='" + t.getNgaysinh() + "'" + ", diachi='" + t.getDiachi() + "'"
					+ " WHERE makhachhang='" + t.getMakhachhang() + "\'";

			System.out.println(sql);

			System.out.println("ban da thuc thi " + sql);

			int ketqua = statement.executeUpdate(sql);

			System.out.println("da thuc thi: " + sql);
			System.out.println("dong bi thay doi" + ketqua + "dong bi thay doi");

			JDBCUtil.closeConnection(c);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int delete(khachhang t) {
		try {
			// tao ket noi csdl
			Connection c = JDBCUtil.getConnection();
			// TAO ra doi tuong statement
			Statement statement = c.createStatement();
			// thuc thi

			String sql = "DELETE from khachhang " + " WHERE id='" + t.getMakhachhang() + "'";

			System.out.println(sql);

			System.out.println("ban da thuc thi " + sql);

			int ketqua = statement.executeUpdate(sql);

			System.out.println("da thuc thi: " + sql);
			System.out.println("dong bi thay doi" + ketqua + "dong bi thay doi");

			JDBCUtil.closeConnection(c);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<khachhang> selectAll() {
		ArrayList<khachhang> list = new ArrayList<khachhang>();
		try {
			Connection c = JDBCUtil.getConnection();
			Statement st = c.createStatement();

			String sql = "SELECT * FROM khachhang";
			System.out.println(sql);
			ResultSet rs = st.executeQuery(sql);
			Date date = new Date(2003, 04, 13);
			//
			while (rs.next()) {
				String makhachhang = rs.getString("makhachhang");
				String tendangnhap = rs.getString("tendangnhap");
				String matkhau = rs.getString("matkhau");
				String tenkhachhang = rs.getString("tenkhachhang");
				String email = rs.getString("email");
				Date ngaysinh = date;
				String dienthoai = rs.getString("dienthoai");
				String gioitinh = rs.getString("gioitinh");
				String diachi = rs.getString("diachi");
				khachhang kh = new khachhang(makhachhang, tenkhachhang, tendangnhap, matkhau, email, ngaysinh,
						dienthoai, gioitinh, diachi);
				list.add(kh);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public khachhang selectById(khachhang t) {
		// TODO Auto-generated method stub
		khachhang ketqua = null;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM khachhang WHERE makhachhang=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getMakhachhang());

			// Bước 3: thực thi câu lệnh SQL
			System.out.println(sql);
			ResultSet rs = st.executeQuery();

			// Bước 4:
			while (rs.next()) {
				String makhachhang = rs.getString("makhachhang");
				String tendangnhap = rs.getString("tendangnhap");
				String matkhau = rs.getString("matkhau");
				String tenkhachhang = rs.getString("tenkhachhang");
				String email = rs.getString("email");
				Date ngaysinh = rs.getDate("ngaysinh");
				String dienthoai = rs.getString("dienthoai");
				String gioitinh = rs.getString("gioitinh");
				String diachi = rs.getString("diachi");
				ketqua = new khachhang(makhachhang, tenkhachhang, tendangnhap, matkhau, email, ngaysinh, dienthoai,
						gioitinh, diachi);
			}

			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketqua;
	}

	@Override
	public ArrayList<khachhang> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

	public khachhang selectByUsernameAndPassWord(khachhang t) {
		khachhang ketqua = null;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM khachhang WHERE tendangnhap=? and matkhau=?";
			PreparedStatement st = con.prepareStatement(sql);
			System.out.println(t.getTendangnnhap() + "/" + t.getMatkhau());
			st.setString(1, t.getTendangnnhap());
			st.setString(2, t.getMatkhau());

			// Bước 3: thực thi câu lệnh SQL
			System.out.println(sql);
			ResultSet rs = st.executeQuery();

			// Bước 4:
			while (rs.next()) {
				String makhachhang = rs.getString("makhachhang");
				String tendangnhap = rs.getString("tendangnhap");
				String matkhau = rs.getString("matkhau");
				String tenkhachhang = rs.getString("tenkhachhang");
				String email = rs.getString("email");
				Date ngaysinh = rs.getDate("ngaysinh");
				String dienthoai = rs.getString("dienthoai");
				String gioitinh = rs.getString("gioitinh");
				String diachi = rs.getString("diachi");
				ketqua = new khachhang(makhachhang, tenkhachhang, tendangnhap, matkhau, email, ngaysinh, dienthoai,
						gioitinh, diachi);
			}

			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketqua;
	}

	
	
	public boolean kiemTraTenDangNhap(String tendangnhap) {
		boolean ketQua = false;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM khachhang WHERE tendangnhap=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, tendangnhap);

			// Bước 3: thực thi câu lệnh SQL
			System.out.println(sql);
			ResultSet rs = st.executeQuery();

			// Bước 4:
			while (rs.next()) {
				ketQua = true;
			}

			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}
}
