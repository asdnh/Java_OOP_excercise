package service;

import java.util.List;

import model.HocSinh;

public class QuanLyHocSinh {
	private List<HocSinh> listHocSinh;

	public QuanLyHocSinh(List<HocSinh> listHocSinh) {
		super();
		this.listHocSinh = listHocSinh;
	}

	public void addHocSinh(HocSinh hocSinh) {
		System.out.println(hocSinh);
		listHocSinh.add(hocSinh);
	}

	public void showHocSinh() {
		listHocSinh.stream().filter((o) -> o.getTuoi() == 20).forEach(System.out::println);
		;
	}

	public long countHocSinh() {
		return listHocSinh.stream().filter((o) -> {
			return (o.getTuoi() == 23 && o.getQueQuan().equals("DN"));
		}).count();
	}
}
