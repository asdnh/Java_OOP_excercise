package model;

import java.util.ArrayList;
import java.util.List;

public class KhoiA extends ThiSinh {
	private List<String> monThi = new ArrayList<>();

	public KhoiA(int sbd, String hoTen, String diaChi, int uuTien) {
		super(sbd, hoTen, diaChi, uuTien);
		this.monThi.add("Toan");
		this.monThi.add("Ly");
		this.monThi.add("Hoa");
	}

	@Override
	public String toString() {
		return "KhoiA [monThi=" + monThi + ", toString()=" + super.toString() + "]";
	}

}
