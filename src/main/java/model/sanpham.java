package model;

public class sanpham {
	private String masanpham;
	private String tensanpham;
	private String hangsx;
	private double gianhap;
	private double giaban;
	private double giagoc;
	private int soluong;
	private String giamgia;
	public String getMasanpham() {
		return masanpham;
	}
	public void setMasanpham(String masanpham) {
		this.masanpham = masanpham;
	}
	public String getTensanpham() {
		return tensanpham;
	}
	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}
	public String getHangsx() {
		return hangsx;
	}
	public void setHangsx(String hangsx) {
		this.hangsx = hangsx;
	}
	public double getGianhap() {
		return gianhap;
	}
	public void setGianhap(double gianhap) {
		this.gianhap = gianhap;
	}
	public double getGiaban() {
		return giaban;
	}
	public void setGiaban(double giaban) {
		this.giaban = giaban;
	}
	public double getGiagoc() {
		return giagoc;
	}
	public void setGiagoc(double giagoc) {
		this.giagoc = giagoc;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public String getGiamgia() {
		return giamgia;
	}
	public void setGiamgia(String giamgia) {
		this.giamgia = giamgia;
	}
	public sanpham() {
		super();
	}
	public sanpham(String masanpham, String tensanpham, String hangsx, double gianhap, double giaban, double giagoc,
			int soluong, String giamgia) {
		super();
		this.masanpham = masanpham;
		this.tensanpham = tensanpham;
		this.hangsx = hangsx;
		this.gianhap = gianhap;
		this.giaban = giaban;
		this.giagoc = giagoc;
		this.soluong = soluong;
		this.giamgia = giamgia;
	}
}
