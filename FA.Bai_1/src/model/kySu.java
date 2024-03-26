package model;

public class kySu extends canBo {
	private String nganh;

	public kySu(String hoTen, int tuoi, String gioiTinh, String diachi, String nganh) {
		super(hoTen, tuoi, gioiTinh, diachi);
		this.nganh = nganh;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	@Override
	public String toString() {
		return "kySu [nganh=" + nganh + ", toString()=" + super.toString() + "]";
	}

}
