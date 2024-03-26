package model;

import java.util.ArrayList;
import java.util.List;

public class KhoiC extends ThiSinh {
	private List<String> monThi = new ArrayList<>();

	public KhoiC(int sbd, String hoTen, String diaChi, int uuTien) {
		super(sbd, hoTen, diaChi, uuTien);
		this.monThi.add("Van");
		this.monThi.add("Su");
		this.monThi.add("Dia");
	}

	@Override
	public String toString() {
		return "KhoiC [monThi=" + monThi + ", toString()=" + super.toString() + "]";
	}

}
