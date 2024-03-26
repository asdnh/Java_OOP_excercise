package model;

public class ThiSinh {
	private int sbd;
	private String hoTen;
	private String diaChi;
	private int uuTien;

	public ThiSinh(int sbd, String hoTen, String diaChi, int uuTien) {
		super();
		this.sbd = sbd;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.uuTien = uuTien;
	}

	public int getSbd() {
		return sbd;
	}

	public void setSbd(int sbd) {
		this.sbd = sbd;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getUuTien() {
		return uuTien;
	}

	public void setUuTien(int uuTien) {
		this.uuTien = uuTien;
	}

	@Override
	public String toString() {
		return "ThiSinh [sbd=" + sbd + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", uuTien=" + uuTien + "]";
	}

}
