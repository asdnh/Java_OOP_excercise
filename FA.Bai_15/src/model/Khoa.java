package model;

import java.util.List;

public class Khoa {
	private String ten;
	private List<SinhVienCQ> sinhVien;

	public Khoa(String ten, List<SinhVienCQ> sinhVien) {
		super();
		this.ten = ten;
		this.sinhVien = sinhVien;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public List<SinhVienCQ> getSinhVien() {
		return sinhVien;
	}

	public void setSinhVien(List<SinhVienCQ> sinhVien) {
		this.sinhVien = sinhVien;
	}

	@Override
	public String toString() {
		return "Khoa [ten=" + ten + ", sinhVien=" + sinhVien + "]";
	}

}
