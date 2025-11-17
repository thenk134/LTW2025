package model;

import java.util.Date;

public class khachhang {
	@Override
	public String toString() {
		return "khachhang [makhachhang=" + makhachhang + ", tenkhachhang=" + tenkhachhang + ", tendangnnhap="
				+ tendangnnhap + ", matkhau=" + matkhau + ", email=" + email + ", ngaysinh=" + ngaysinh + ", denthoai="
				+ dienthoai + ", gioitinh=" + gioitinh + ", diachi=" + diachi + "]";
	}
	private String makhachhang;
	private String tenkhachhang;
	private String tendangnnhap;
	private String matkhau;
	private String email;
	private Date ngaysinh;
	private String dienthoai;
	private String gioitinh;
	private String diachi;
	public khachhang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public khachhang(String makhachhang, String tenkhachhang, String tendangnnhap, String matkhau, String email,
			Date ngaysinh, String dienthoai, String gioitinh, String diachi) {
		super();
		this.makhachhang = makhachhang;
		this.tenkhachhang = tenkhachhang;
		this.tendangnnhap = tendangnnhap;
		this.matkhau = matkhau;
		this.email = email;
		this.ngaysinh = ngaysinh;
		this.dienthoai = dienthoai;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
	}
	public String getMakhachhang() {
		return makhachhang;
	}
	public void setMakhachhang(String makhachhang) {
		this.makhachhang = makhachhang;
	}
	public String getTenkhachhang() {
		return tenkhachhang;
	}
	public void setTenkhachhang(String tenkhachhang) {
		this.tenkhachhang = tenkhachhang;
	}
	public String getTendangnnhap() {
		return tendangnnhap;
	}
	public void setTendangnnhap(String tendangnnhap) {
		this.tendangnnhap = tendangnnhap;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getDenthoai() {
		return dienthoai;
	}
	public void setDenthoai(String denthoai) {
		this.dienthoai = denthoai;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	
}
