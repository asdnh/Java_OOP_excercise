package model;

public class KetQuaHocTap {
	private String tenHocKy;
	private int diemTB;

	public KetQuaHocTap(String tenHocKy, int diemTB) {
		super();
		this.tenHocKy = tenHocKy;
		this.diemTB = diemTB;
	}

	public String getTenHocKy() {
		return tenHocKy;
	}

	public void setTenHocKy(String tenHocKy) {
		this.tenHocKy = tenHocKy;
	}

	public int getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(int diemTB) {
		this.diemTB = diemTB;
	}

	@Override
	public String toString() {
		return "KetQuaHocTap [tenHocKy=" + tenHocKy + ", diemTB=" + diemTB + "]";
	}

}
