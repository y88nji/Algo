
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		int N3 = sc.nextInt();
		String N4 = Integer.toString(N1 * N2 * N3);
		char[] N5 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int[] N6 = new int [10];

		for (int i = 0; i < N4.length(); i++) {
			for (int j = 0; j < N5.length; j++) {
				if(N4.charAt(i) == N5[j]) {
					N6[j]++;
				}
			}
		}
		for (int i = 0; i < N6.length ; i++) {
			System.out.println(N6[i]);
		}
	}

}
