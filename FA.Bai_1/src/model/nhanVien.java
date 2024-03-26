package model;

public class nhanVien extends canBo {
	private String congViec;

	public nhanVien(String hoTen, int tuoi, String gioiTinh, String diachi, String congViec) {
		super(hoTen, tuoi, gioiTinh, diachi);
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	@Override
	public String toString() {
		return "nhanVien [congViec=" + congViec + ", toString()=" + super.toString() + "]";
	}

}
