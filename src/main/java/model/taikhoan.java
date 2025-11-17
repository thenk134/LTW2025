package model;

public class taikhoan {
	private String tendangnhap;
	private String matkhau;
	public taikhoan(String tendangnhap, String matkhau) {
		super();
		this.tendangnhap = tendangnhap;
		this.matkhau = matkhau;
	}
	public taikhoan() {
		super();
	}
	public String getTendangnhap() {
		return tendangnhap;
	}
	public void setTendangnhap(String tendangnhap) {
		this.tendangnhap = tendangnhap;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	
	}
