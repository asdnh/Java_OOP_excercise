package model;

import java.util.List;

public class HoGiaDinh {
	private int soNha;
	private List<Nguoi> list;

	public HoGiaDinh(int soNha, List<Nguoi> list) {
		super();
		this.soNha = soNha;
		this.list = list;
	}

	public int getSoNha() {
		return soNha;
	}

	public void setSoNha(int soNha) {
		this.soNha = soNha;
	}

	public List<Nguoi> getList() {
		return list;
	}

	public void setList(List<Nguoi> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "HoGiaDinh [soNha=" + soNha + ", list=" + list + "]";
	}

}
