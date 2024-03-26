package service;

import java.util.List;

import model.canBo;

public class QLCB {
	private List<canBo> list;

	public QLCB(List<canBo> list) {
		this.list = list;
	}

	public void addCanBo(canBo canBo) {
		this.list.add(canBo);
	}

	public List<canBo> searchByName(String hoTen) {

		return this.list.stream().filter((c) -> c.getHoTen().contains(hoTen)).toList();
	}

	public void showAll() {
		this.list.forEach(System.out::println);
	}
}
