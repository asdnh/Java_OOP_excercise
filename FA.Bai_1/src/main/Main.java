package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.canBo;
import model.congNhan;
import model.kySu;
import model.nhanVien;
import service.QLCB;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<canBo> canBoList = new ArrayList<>();
		QLCB qlcb = new QLCB(canBoList);
		while (true) {
			mainMenu();
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				subMenu();
				choice = sc.nextInt();
				sc.nextLine();
				System.out.print("Ho ten: ");
				String hoTen = sc.nextLine();
				System.out.print("Tuoi: ");
				int tuoi = sc.nextInt();
				System.out.print("Gioi tinh: ");
				sc.nextLine();
				String gioiTinh = sc.nextLine();
				System.out.print("Dia chi: ");
				String diaChi = sc.nextLine();

				switch (choice) {
				case 1: {
					System.out.println("Bac: ");
					int bac = sc.nextInt();

					canBo congNhan = new congNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
					qlcb.addCanBo(congNhan);
					System.out.println(congNhan);
					break;
				}
				case 2: {
					System.out.println("Nganh: ");
					String nganh = sc.nextLine();
					canBo kySu = new kySu(hoTen, tuoi, gioiTinh, diaChi, nganh);
					qlcb.addCanBo(kySu);
					System.out.println(kySu);
					break;
				}
				case 3: {
					System.out.println("Cong viec: ");
					String congViec = sc.nextLine();
					canBo nhanVien = new nhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
					qlcb.addCanBo(nhanVien);
					System.out.println(nhanVien);
					break;
				}
				default:
					break;
				}
				break;
			}
			case 2: {
				System.out.print("Ho ten: ");
				String input = sc.nextLine();
				List<canBo> searchResult = qlcb.searchByName(input);
				searchResult.forEach((c) -> System.out.println(c));
				break;
			}
			case 3: {
				qlcb.showAll();
				break;
			}
			case 4: {
				sc.close();
				return;
			}
			default:
				sc.close();
				return;
			}
		}
	}

	private static void mainMenu() {
		System.out.println("1. add can bo\n" + "2. search by name\n" + "3. show all\n" + "4. exit\n");
	}

	private static void subMenu() {
		System.out.println("1. Cong nhan\n" + "2. Ky su\n" + "3. Nhan vien\n");
	}
}
