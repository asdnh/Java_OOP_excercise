package model;

import java.util.ArrayList;
import java.util.List;

public class KhoiB extends ThiSinh {
	private List<String> monThi = new ArrayList<>();

	public KhoiB(int sbd, String hoTen, String diaChi, int uuTien) {
		super(sbd, hoTen, diaChi, uuTien);
		this.monThi.add("Toan");
		this.monThi.add("Hoa");
		this.monThi.add("Sinh");
	}

	@Override
	public String toString() {
		return "KhoiB [monThi=" + monThi + ", toString()=" + super.toString() + "]";
	}

}
