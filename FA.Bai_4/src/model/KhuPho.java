package model;

import java.util.List;

public class KhuPho {
	private List<HoGiaDinh> list;

	public KhuPho(List<HoGiaDinh> list) {
		super();
		this.list = list;
	}

	public List<HoGiaDinh> getList() {
		return list;
	}

	public void setList(List<HoGiaDinh> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "KhuPho [list=" + list + "]";
	}

}
