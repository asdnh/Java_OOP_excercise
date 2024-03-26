package main;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

import model.KetQuaHocTap;
import model.Khoa;
import model.SinhVienCQ;
import model.SinhVienTC;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Khoa> listKhoa = new ArrayList<>();
		Khoa khoaA = new Khoa("KhoaA", new ArrayList<>());
		Khoa khoaB = new Khoa("KhoaB", new ArrayList<>());
		Khoa khoaC = new Khoa("KhoaC", new ArrayList<>());
		listKhoa.add(khoaA);
		listKhoa.add(khoaB);
		listKhoa.add(khoaC);

		while (true) {
			mainMenu();
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				khoaMenu();
				int khoaChoice = sc.nextInt();

				subMenu();
				choice = sc.nextInt();
				sc.nextLine();
				System.out.println("id: ");
				String id_input = sc.nextLine();
				int id = 0;
				try {
					id = Integer.parseInt(id_input);
				} catch (NumberFormatException e) {
					System.err.println("Invalid ID!");
				}

				System.out.println("Ho ten: ");
				String hoTen = sc.nextLine();
				System.out.println("DOB (yyyy-MM-dd): ");
				String DOBinput = sc.nextLine();
				LocalDate DOB = null;
				try {
					DOB = LocalDate.parse(DOBinput);
				} catch (DateTimeParseException e) {
					System.err.println("Invalid DOB!");
				}
				System.out.println("Nam Nhap Hoc: ");
				String namNhapHoc_input = sc.nextLine();
				int namNhapHoc = 0;
				try {
					namNhapHoc = Integer.parseInt(namNhapHoc_input);
				} catch (NumberFormatException e) {
					System.err.println("Invalid nam nhap hoc");
				}
				System.out.println("Diem dau vao: ");
				String diemDauVao_input = sc.nextLine();
				int diemDauVao = 0;
				try {
					diemDauVao = Integer.parseInt(diemDauVao_input);
				} catch (NumberFormatException e) {
					System.err.println("Invalid diem dau vao");
				}
				System.out.println("--------Danh sach ket qua hoc tap---------");
				System.out.println("So hoc ky: ");
				int soHocKy = sc.nextInt();
				sc.nextLine();
				List<KetQuaHocTap> listKetQuaHocTap = new ArrayList<>();
				for (int i = 0; i < soHocKy; i++) {
					System.out.println("Ten hoc ky: ");
					String tenHocKy = sc.nextLine();
					System.out.println("Diem trung binh: ");
					String diemTB_input = sc.nextLine();
					int diemTB = 0;
					try {
						diemTB = Integer.parseInt(diemTB_input);
					} catch (Exception e) {
						System.err.println("Invalid diem trung binh");
					}
					KetQuaHocTap ketQuaHocTap = new KetQuaHocTap(tenHocKy, diemTB);
					listKetQuaHocTap.add(ketQuaHocTap);
				}

				SinhVienCQ sinhVien;
				switch (choice) {
				case 1: {
					sinhVien = new SinhVienCQ(id, hoTen, DOB, namNhapHoc, diemDauVao, listKetQuaHocTap);
					break;
				}
				case 2: {
					System.out.println("Noi lien ket: ");
					String noiLienKet = sc.nextLine();
					sinhVien = new SinhVienTC(id, hoTen, DOB, namNhapHoc, diemDauVao, listKetQuaHocTap, noiLienKet);
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}

				switch (khoaChoice) {
				case 1: {
					listKhoa.get(0).getSinhVien().add(sinhVien);
					break;
				}
				case 2: {
					listKhoa.get(1).getSinhVien().add(sinhVien);
					break;
				}
				case 3: {
					listKhoa.get(2).getSinhVien().add(sinhVien);
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + khoaChoice);
				}
				break;
			}
			case 2: {
				// xac dinh sinh vien co phai chinh quy hay khong
				System.out.println("id: ");
				int id = sc.nextInt();
				SinhVienCQ sinhVienCQ = null;
				for (int i = 0; i < 3; i++) {
					if (sinhVienCQ != null) {
						break;
					}
					sinhVienCQ = listKhoa.get(i).getSinhVien().stream().filter((o) -> {
						return o.getId() == id;
					}).findFirst().orElse(null);
				}
				if (!(sinhVienCQ instanceof SinhVienTC)) {
					System.out.println("Sinh Vien Chinh Quy");
				} else {
					System.out.println("Khong phai Sinh Vien Chinh Quy");
				}
				break;
			}
			case 3: {
				System.out.println("id:");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Ten Hoc Ky: ");
				String tenHocKy = sc.nextLine();
				SinhVienCQ sinhVienCQ = null;
				for (int i = 0; i < 3; i++) {
					if (sinhVienCQ != null) {
						break;
					}
					sinhVienCQ = listKhoa.get(i).getSinhVien().stream().filter((o) -> {
						return o.getId() == id;
					}).findFirst().orElse(null);
				}
				if (sinhVienCQ == null) {
					System.out.println("Sinh vien khong ton tai");
				}
				int diemTB = sinhVienCQ.getKetQuaHocTap().stream().filter((o) -> o.getTenHocKy().equals(tenHocKy))
						.findFirst().orElse(null).getDiemTB();
				System.out.println("Diem TB: " + diemTB);
				break;
			}
			case 4: {
				for (int i = 0; i < 3; i++) {
					long count = listKhoa.get(i).getSinhVien().stream().filter((o) -> {
						return !(o instanceof SinhVienTC);
					}).count();
					System.out.println(listKhoa.get(i).getTen() + ": " + count + " SVCQ");
				}
				break;
			}
			case 5: {
				for (int i = 0; i < 3; i++) {
					if (listKhoa.get(i).getSinhVien().size() == 0) {
						continue;
					}
					SinhVienCQ sinhVien = listKhoa.get(i).getSinhVien().stream().max((o1, o2) -> {
						if (o1.getDiemDauVao() > o2.getDiemDauVao()) {
							return 1;
						} else if (o1.getDiemDauVao() < o2.getDiemDauVao()) {
							return -1;
						} else {
							return 0;
						}
					}).orElse(null);
					System.out.println(
							listKhoa.get(i).getTen() + ": " + sinhVien.getHoTen() + " " + sinhVien.getDiemDauVao());
				}
				break;
			}
			case 6: {
				System.out.println("Noi lien ket: ");
				String noiLienKet = sc.nextLine();
				for (int i = 0; i < 3; i++) {
					System.out.println(listKhoa.get(i).getTen());
					List<SinhVienCQ> listSinhVien = listKhoa.get(i).getSinhVien();
					for (int j = 0; j < listSinhVien.size(); j++) {
						SinhVienCQ sinhVienCQ = listSinhVien.get(j);
						if (sinhVienCQ instanceof SinhVienTC) {
							SinhVienTC sinhVienTC = (SinhVienTC) sinhVienCQ;
							if (sinhVienTC.getNoiLienKet().equals(noiLienKet)) {
								System.out.println(sinhVienTC);
							}
						}
					}
				}
				break;
			}
			case 7: {
				for (int i = 0; i < 3; i++) {
					System.out.println(listKhoa.get(i).getTen());
					listKhoa.get(i).getSinhVien().stream().filter((o) -> {
						return o.getKetQuaHocTap().get(o.getKetQuaHocTap().size() - 1).getDiemTB() >= 8;
					}).forEach(System.out::println);
				}
				break;
			}
			case 8: {
				for (int i = 0; i < 3; i++) {
					Khoa khoa = listKhoa.get(i);
					System.out.println(khoa.getTen());
					List<SinhVienCQ> listSinhVien = khoa.getSinhVien();
					int max = 0;
					for (int j = 0; j < listSinhVien.size(); j++) {

						List<KetQuaHocTap> listKetQuaHocTap = listSinhVien.get(j).getKetQuaHocTap();
						int diemTBMax = listKetQuaHocTap.stream().max((o1, o2) -> {
							if (o1.getDiemTB() > o2.getDiemTB()) {
								return 1;
							} else if (o1.getDiemTB() < o2.getDiemTB()) {
								return -1;
							} else {
								return 0;
							}
						}).orElse(null).getDiemTB();
						if (max < diemTBMax) {
							max = diemTBMax;
						}
					}
					System.out.println("Diem TB cao nhat: " + max);
				}
				break;
			}
			case 9: {
				for (int i = 0; i < 3; i++) {
					System.out.println(listKhoa.get(i).getTen());
					List<SinhVienCQ> listSinhVien = listKhoa.get(i).getSinhVien();
					Collections.sort(listSinhVien, new Comparator<SinhVienCQ>() {

						@Override
						public int compare(SinhVienCQ o1, SinhVienCQ o2) {
							if (o1 instanceof SinhVienTC && !(o2 instanceof SinhVienTC))
								return -1;
							else if (!(o1 instanceof SinhVienTC) && (o2 instanceof SinhVienTC))
								return 1;
							else {
								if (o1.getNamNhapHoc() < o2.getNamNhapHoc()) {
									return 1;
								} else if (o1.getNamNhapHoc() > o2.getNamNhapHoc()) {
									return -1;
								} else {
									return 0;
								}
							}
						}
					});
					listSinhVien.forEach(System.out::println);
				}
				break;
			}
			case 10: {
				for (int i = 0; i < 3; i++) {
					System.out.println(listKhoa.get(i).getTen());
					List<SinhVienCQ> listSinhVien = listKhoa.get(i).getSinhVien();
					HashMap<Integer, Integer> soLuongSinhVienTheoNam = new HashMap<>();
					for (SinhVienCQ s : listSinhVien) {
						int namNhapHoc = s.getNamNhapHoc();
						int soLuongHienTai = soLuongSinhVienTheoNam.getOrDefault(namNhapHoc, 0);
						soLuongSinhVienTheoNam.put(namNhapHoc, soLuongHienTai + 1);
					}
					for (Entry<Integer, Integer> e : soLuongSinhVienTheoNam.entrySet()) {
						System.out.println("Nam " + e.getKey() + " " + e.getValue());
					}
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
	}

	private static void mainMenu() {
		System.out.println("1. add\n"
				+ "2. isSVCQ\n"
				+ "3. getDiemTB\n"
				+ "4. Tong so SVCQ cua khoa\n"
				+ "5. SV co diem dau vao cao nhat\n"
				+ "6. Danh sach SVTC\n"
				+ "7. Diem TB cua hoc ky gan nhat >= 8.0\n"
				+ "8. Diem TB cao nhat\n"
				+ "9. Sap xep SV\n"
				+ "10. Thong Ke SV\n"
				+ "11. exit\n");
	}

	private static void subMenu() {
		System.out.println("1. SVCQ\n"
				+ "2. SVTC\n");
	}

	private static void khoaMenu() {
		System.out.println("1. Khoa A\n"
				+ "2. Khoa B\n"
				+ "3. Khoa C\n");
	}
}
