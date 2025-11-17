package TEST;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.khachhangDAO;
import database.JDBCUtil;
import model.khachhang;
public class JDBCCONECTTEST {
//	public static void main(String[] args) {
//		try {
//			// tao ket noi
//			Connection c = JDBCUtil.getConnection();
//			// tao ra doi tuong statment
//			//Statement st = c.createStatement();
//			
//			Date ur = new Date(2003, 4,13);
////			khachhang kh1 = new khachhang("1", "thanh", "tro" , "123", "thanh@" , ur, "0123" , "nam",  "thongnhat");
////			
////			khachhangDAO.getIn().insert(kh1);
//			
////			
////			khachhang kh2 = new khachhang("1", "thanh", "trotan" , "123", "thanh@" , ur, "0123" , "nam",  "thongnhat");
////			
////
////			khachhangDAO.getIn().update(kh2);
//			
////			ArrayList<khachhang> list =  khachhangDAO.getIn().selectAll();
////				for (khachhang khachhang : list) {
////					System.out.println(khachhang.toString());
////				}
//			khachhang kh2 = new khachhang("1", "thanh", "trotan" , "123", "thanh@" , ur, "0123" , "nam",  "thongnhat");
//			
//			khachhang kh3 = new khachhang("1", "thanh", "tro" , "123", "thanh@" , ur, "0123" , "nam",  "thongnhat");
//			khachhangDAO.getIn().update(kh2);
//			
//			khachhangDAO.getIn().selectByUsernameAndPassWord(kh3);
////			ArrayList<khachhang> list =  khachhangDAO.getIn().selectAll();
////			for (khachhang khachhang : list) {
////				System.out.println(khachhang.toString());
////			}
//			System.out.println(khachhangDAO.getIn().selectById(kh3));
//			
//			// ngat
//			
//			JDBCUtil.printInfo(c);
//			JDBCUtil.closeConnection(c);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
	public static void main(String[] args) {
		// tao ket noi
		Connection c = JDBCUtil.getConnection();
		// tao ra doi tuong statment
		khachhang kh10= new khachhang("10", "hello", "xinchao" , "123", "hola@" , new Date(1-1-1970),  null ,  null,   null);
		khachhangDAO.getIn().insert(kh10);
	}
}
