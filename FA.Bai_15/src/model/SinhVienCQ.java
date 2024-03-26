package model;

import java.time.LocalDate;
import java.util.List;

public class SinhVienCQ {
	private int id;
	private String hoTen;
	private LocalDate DOB;
	private int namNhapHoc;
	private int diemDauVao;
	private List<KetQuaHocTap> ketQuaHocTap;

	public SinhVienCQ(int id, String hoTen, LocalDate dOB, int namNhapHoc, int diemDauVao,
			List<KetQuaHocTap> ketQuaHocTap) {
		super();
		this.id = id;
		this.hoTen = hoTen;
		DOB = dOB;
		this.namNhapHoc = namNhapHoc;
		this.diemDauVao = diemDauVao;
		this.ketQuaHocTap = ketQuaHocTap;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public int getNamNhapHoc() {
		return namNhapHoc;
	}

	public void setNamNhapHoc(int namNhapHoc) {
		this.namNhapHoc = namNhapHoc;
	}

	public int getDiemDauVao() {
		return diemDauVao;
	}

	public void setDiemDauVao(int diemDauVao) {
		this.diemDauVao = diemDauVao;
	}

	public List<KetQuaHocTap> getKetQuaHocTap() {
		return ketQuaHocTap;
	}

	public void setKetQuaHocTap(List<KetQuaHocTap> ketQuaHocTap) {
		this.ketQuaHocTap = ketQuaHocTap;
	}

	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", hoTen=" + hoTen + ", DOB=" + DOB + ", namNhapHoc=" + namNhapHoc
				+ ", diemDauVao=" + diemDauVao + ", ketQuaHocTap=" + ketQuaHocTap + "]";
	}

}
