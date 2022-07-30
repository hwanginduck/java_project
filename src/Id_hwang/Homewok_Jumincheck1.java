package Id_hwang;

import java.util.Scanner;

public class Homewok_Jumincheck1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		String yn;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("주민번호 앞자리를 입력하세요");
			String jumin1 = sc.nextLine();
			if ((jumin1.length() != 6)) {
				System.out.println("다시 입력하세요");
				continue;
			}

			System.out.println("주민번호 뒷자리를 입력하세요");
			String jumin2 = sc.nextLine();
			if ((jumin2.length() != 7)) {
				System.out.println("다시 입력하세요");
				continue;
			}
			String jumin = jumin1 + jumin2;

			String[] jumin_i;
			jumin_i = jumin.split("");
			
			int[] jumin_int = new int[13];
			for (i = 0; i < jumin_int.length; i++) {
				jumin_int[i] = Integer.parseInt(jumin_i[i]);
			}
			
			int[] check1 = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
			int[] check2 = new int[13];
			int check3 = 0;
			for (i = 0; i < 12; i++) {
				check2[i] = jumin_int[i] * check1[i];
				check3 += check2[i];
			}
			
			int check = 11 - (check3%11);
			if (check >= 10) {
				check = check % 10;
				if (check == jumin_int[12]) {
					System.out.println("올바른 주민번호 입니다.");
				} else {
					System.out.println("틀린 주민번호 입니다. 다시 확인 후 입력하세요.");
				}
			} else if (check < 10) {
				if (check == jumin_int[12]) {
					System.out.println("올바른 주민번호 입니다.");
				} else {
					System.out.println("틀린 주민번호 입니다. 다시 확인 후 입력하세요.");
				}
			}
			System.out.print("계속할려면 y, 멈출려면 n을 입력?");
			yn = sc.nextLine();
			if (yn.equals("y") || yn.equals("Y")) {
				continue;
			} else if (yn.equals("n") || yn.equals("N")) {
				break;
			}
		} while (true);
	}
}
