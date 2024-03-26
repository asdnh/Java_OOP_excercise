package model;

public class Nguoi {
	private String hoTen;
	private int tuoi;
	private String ngheNghiep;
	private String cccd;

	public Nguoi(String hoTen, int tuoi, String ngheNghiep, String cccd) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.ngheNghiep = ngheNghiep;
		this.cccd = cccd;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getNgheNghiep() {
		return ngheNghiep;
	}

	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	@Override
	public String toString() {
		return "Nguoi [hoTen=" + hoTen + ", tuoi=" + tuoi + ", ngheNghiep=" + ngheNghiep + ", cccd=" + cccd + "]";
	}

}
