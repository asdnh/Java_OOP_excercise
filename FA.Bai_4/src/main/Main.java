package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.HoGiaDinh;
import model.Nguoi;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n ho dan: ");
		int n = sc.nextInt();
		List<HoGiaDinh> listHoDan = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("-----------Ho Dan---------");
			System.out.println("So nha: ");
			int soNha = sc.nextInt();
			System.out.println("So nguoi: ");
			int soNguoi = sc.nextInt();
			sc.nextLine();
			List<Nguoi> listNguoi = new ArrayList<>();
			for (int j = 0; j < soNguoi; j++) {
				System.out.println("-----------------------");
				System.out.println("Ho ten: ");
				String hoTen = sc.nextLine();
				System.out.println("Tuoi: ");
				int tuoi = sc.nextInt();
				sc.nextLine();
				System.out.println("Nghe nghiep: ");
				String nghe = sc.nextLine();
				System.out.println("CCCD: ");
				String cccd = sc.nextLine();
				Nguoi nguoi = new Nguoi(hoTen, tuoi, nghe, cccd);
				listNguoi.add(nguoi);
			}
			HoGiaDinh hoGiaDinh = new HoGiaDinh(soNha, listNguoi);
			listHoDan.add(hoGiaDinh);
		}
		listHoDan.forEach(System.out::println);
	}
}
