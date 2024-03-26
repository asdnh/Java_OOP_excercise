package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.HocSinh;
import service.QuanLyHocSinh;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<HocSinh> listHocSinh = new ArrayList<>();
		QuanLyHocSinh quanly = new QuanLyHocSinh(listHocSinh);
		while (true) {
			mainMenu();
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				System.out.print("Ho ten: ");
				String hoTen = sc.nextLine();
				System.out.print("Tuoi: ");
				int tuoi = sc.nextInt();
				sc.nextLine();
				System.out.print("Que Quan: ");
				String que = sc.nextLine();
				HocSinh hocSinh = new HocSinh(hoTen, tuoi, que);
				quanly.addHocSinh(hocSinh);
				break;
			}
			case 2: {
				quanly.showHocSinh();
				break;
			}
			case 3: {
				System.out.println("Co " + quanly.countHocSinh() + " hoc sinh 23 tuoi o DN");
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
		System.out.println("1. Them hoc sinh moi\n" + "2. Hien thi hoc sinh 20 tuoi\n"
				+ "3. Dem so luong hoc sinh 23 tuoi o DN\n" + "4. exit\n");
	}

}
