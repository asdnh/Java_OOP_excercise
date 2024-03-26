package service;

import java.util.List;
import java.util.Optional;

import model.ThiSinh;

public class TuyenSinh {
	List<ThiSinh> list;

	public TuyenSinh(List<ThiSinh> list) {
		this.list = list;
	}

	public void addThiSinh(ThiSinh thiSinh) {
		this.list.add(thiSinh);
	}

	public void showAll() {
		this.list.forEach((t) -> System.out.println(t));
	}

	public ThiSinh searchBySBD(int sbd) {
		return this.list.stream().filter((t) -> t.getSbd() == sbd).findFirst().orElse(null);
	}
}
