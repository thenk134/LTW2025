package model;

public class chitietsp {
	private String tensanpham;
	private String masanpham;
	private String mota1;
	private String mota2;
	public String getTensanpham() {
		return tensanpham;
	}
	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}
	public String getMasanpham() {
		return masanpham;
	}
	public void setMasanpham(String masanpham) {
		this.masanpham = masanpham;
	}
	public String getMota1() {
		return mota1;
	}
	public void setMota1(String mota1) {
		this.mota1 = mota1;
	}
	public String getMota2() {
		return mota2;
	}
	public void setMota2(String mota2) {
		this.mota2 = mota2;
	}
	public chitietsp(String tensanpham, String masanpham, String mota1, String mota2) {
		super();
		this.tensanpham = tensanpham;
		this.masanpham = masanpham;
		this.mota1 = mota1;
		this.mota2 = mota2;
	}
}
