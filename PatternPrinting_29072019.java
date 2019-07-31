package Pattern;

public class PatternPrinting_29072019 {
	public static void main(String[] args) {
		int a = 5;
		pattern1(a);
//		pattern2(a);
//		pattern3(a);
//		pattern4();
//		pattern5();
//		pattern6(a);
//		pattern7(a);
//		pattern8();
//		pattern9();
//		pattern10(a);
	}

//	*
//	**
//	***
//	****
//	*****
	private static void pattern10(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

//	EDCBA
//	EDCBA
//	EDCBA
//	EDCBA
//	EDCBA
	private static void pattern9() {
		for (char var = 'E'; var >= 'A'; var--) {
			for (char var2 = 'E'; var2 >= 'A'; var2--) {
				System.out.print(var2);
			}
			System.out.println();
		}

	}

//	EEEEE
//	DDDDD
//	CCCCC
//	BBBBB
//	AAAAA
	private static void pattern8() {
		for (char var = 'E'; var >= 'A'; var--) {
			for (char var2 = 'E'; var2 >= 'A'; var2--) {
				System.out.print(var);
			}
			System.out.println();
		}

	}

//	54321
//	54321
//	54321
//	54321
//	54321
	private static void pattern7(int a) {
		for (int i = a; i > 0; i--) {
			for (int j = a; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

//	55555
//	44444
//	33333
//	22222
//	11111
	private static void pattern6(int a) {
		for (int i = a; i > 0; i--) {
			for (int j = 1; j <= a; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

//	ABCDE
//	ABCDE
//	ABCDE
//	ABCDE
//	ABCDE
	private static void pattern5() {
		for (char var = 'A'; var <= 'E'; var++) {
			for (char var2 = 'A'; var2 <= 'E'; var2++) {
				System.out.print(var2);
			}
			System.out.println();
		}

	}

//	AAAAA
//	BBBBB
//	CCCCC
//	DDDDD
//	EEEEE
	private static void pattern4() {
		for (char var = 'A'; var <= 'E'; var++) {
			for (char var2 = 'A'; var2 <= 'E'; var2++) {
				System.out.print(var);
			}
			System.out.println();
		}

	}

//	 11111 
//	 22222 
//	 33333 
//	 44444 
//	 55555

	private static void pattern3(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

//	12345 
//	12345 
//	12345 
//	12345 
//	12345

	private static void pattern2(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

//	 *****
//	 *****
//	 *****
//	 *****

	private static void pattern1(int a) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
