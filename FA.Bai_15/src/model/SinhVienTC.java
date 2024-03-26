package model;

import java.time.LocalDate;
import java.util.List;

public class SinhVienTC extends SinhVienCQ {
	private String noiLienKet;

	public SinhVienTC(int id, String hoTen, LocalDate dOB, int namNhapHoc, int diemDauVao, List<KetQuaHocTap> ketQuaHocTap,
			String noiLienKet) {
		super(id, hoTen, dOB, namNhapHoc, diemDauVao, ketQuaHocTap);
		this.noiLienKet = noiLienKet;
	}

	public String getNoiLienKet() {
		return noiLienKet;
	}

	public void setNoiLienKet(String noiLienKet) {
		this.noiLienKet = noiLienKet;
	}

	@Override
	public String toString() {
		return "SVTC [noiLienKet=" + noiLienKet + ", getId()=" + getId() + ", getHoTen()=" + getHoTen() + ", getDOB()="
				+ getDOB() + ", getNamNhapHoc()=" + getNamNhapHoc() + ", getDiemDauVao()=" + getDiemDauVao()
				+ ", getKetQuaHocTap()=" + getKetQuaHocTap() + "]";
	}

}
