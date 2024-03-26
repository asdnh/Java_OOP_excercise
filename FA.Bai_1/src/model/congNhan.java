package model;

public class congNhan extends canBo {
	private int bac;

	public congNhan(String hoTen, int tuoi, String gioiTinh, String diachi, int bac) {
		super(hoTen, tuoi, gioiTinh, diachi);
		this.bac = bac;
	}

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	@Override
	public String toString() {
		return "congNhan [bac=" + bac + ", toString()=" + super.toString() + "]";
	}

}
