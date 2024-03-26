package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.KhoiA;
import model.KhoiB;
import model.KhoiC;
import model.ThiSinh;
import service.TuyenSinh;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<ThiSinh> thiSinhList = new ArrayList<>();
		TuyenSinh tuyenSinh = new TuyenSinh(thiSinhList);
		while (true) {
			mainMenu();
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				subMenu();
				choice = sc.nextInt();
				sc.nextLine();
				System.out.print("SBD: ");
				int sbd = sc.nextInt();
				sc.nextLine();
				System.out.print("Ho ten: ");
				String hoTen = sc.nextLine();
				System.out.print("Dia chi: ");
				String diaChi = sc.nextLine();
				System.out.print("Muc uu tien: ");
				int uuTien = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1: {
					ThiSinh khoiA = new KhoiA(sbd, hoTen, diaChi, uuTien);
					tuyenSinh.addThiSinh(khoiA);
					System.out.println(khoiA);
					break;
				}
				case 2: {
					ThiSinh khoiB = new KhoiB(sbd, hoTen, diaChi, uuTien);
					tuyenSinh.addThiSinh(khoiB);
					System.out.println(khoiB);
					break;
				}
				case 3: {
					ThiSinh khoiC = new KhoiC(sbd, hoTen, diaChi, uuTien);
					tuyenSinh.addThiSinh(khoiC);
					System.out.println(khoiC);
					break;
				}
				default:
					break;
				}
				break;
			}
			case 2: {
				tuyenSinh.showAll();
				break;
			}
			case 3: {
				System.out.print("SBD: ");
				int input = sc.nextInt();
				System.out.println(tuyenSinh.searchBySBD(input));
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
		System.out.println("1. add thi sinh\n" + "2. show all\n" + "3. search by sbd\n" + "4. exit\n");
	}

	private static void subMenu() {
		System.out.println("1. Khoi A\n" + "2. Khoi B\n" + "3. Khoi C\n");
	}
}
