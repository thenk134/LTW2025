package model;

import java.sql.Date;

public class donhang {
	private String madonhang;
	private String makhachhang;
	private String masanpham;
	private Date ngaydathang;
	private Date ngaygiaohang;
	private String hinhthucthanhtoan;
	private String trangthaithanhtoan;
	private String diachinhanhang;
	public donhang(String madonhang, String makhachhang, String masanpham, Date ngaydathang, Date ngaygiaohang,
			String hinhthucthanhtoan, String trangthaithanhtoan, String diachinhanhang) {
		super();
		this.madonhang = madonhang;
		this.makhachhang = makhachhang;
		this.masanpham = masanpham;
		this.ngaydathang = ngaydathang;
		this.ngaygiaohang = ngaygiaohang;
		this.hinhthucthanhtoan = hinhthucthanhtoan;
		this.trangthaithanhtoan = trangthaithanhtoan;
		this.diachinhanhang = diachinhanhang;
	}
	public donhang() {
		super();
	}
	public String getMadonhang() {
		return madonhang;
	}
	public void setMadonhang(String madonhang) {
		this.madonhang = madonhang;
	}
	public String getMakhachhang() {
		return makhachhang;
	}
	public void setMakhachhang(String makhachhang) {
		this.makhachhang = makhachhang;
	}
	public String getMasanpham() {
		return masanpham;
	}
	public void setMasanpham(String masanpham) {
		this.masanpham = masanpham;
	}
	public Date getNgaydathang() {
		return ngaydathang;
	}
	public void setNgaydathang(Date ngaydathang) {
		this.ngaydathang = ngaydathang;
	}
	public Date getNgaygiaohang() {
		return ngaygiaohang;
	}
	public void setNgaygiaohang(Date ngaygiaohang) {
		this.ngaygiaohang = ngaygiaohang;
	}
	public String getHinhthucthanhtoan() {
		return hinhthucthanhtoan;
	}
	public void setHinhthucthanhtoan(String hinhthucthanhtoan) {
		this.hinhthucthanhtoan = hinhthucthanhtoan;
	}
	public String getTrangthaithanhtoan() {
		return trangthaithanhtoan;
	}
	public void setTrangthaithanhtoan(String trangthaithanhtoan) {
		this.trangthaithanhtoan = trangthaithanhtoan;
	}
	public String getDiachinhanhang() {
		return diachinhanhang;
	}
	public void setDiachinhanhang(String diachinhanhang) {
		this.diachinhanhang = diachinhanhang;
	}
	
}
