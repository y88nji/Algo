import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력>>");
		int N = sc.nextInt();

		int M = (N*2-1);
		int n = M/2; // 2
		int m = M-n; // 3

		for (int i = 0; i < m; i++) {
			for (int k = n; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 2 * n - 2; k >= i * 2; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
