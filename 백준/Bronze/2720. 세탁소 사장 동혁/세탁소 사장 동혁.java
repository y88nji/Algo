import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 0; tc < T; tc++) {

			int N = sc.nextInt();

			int quarter = N / 25;
			int temp = N - 25 * quarter;

			int dime = temp / 10;
			temp = temp - 10 * dime;

			int nickel = temp / 5;
			temp = temp - 5 * nickel;

			int penny = temp / 1;

			System.out.printf("%d %d %d %d\n", quarter, dime, nickel, penny);

		}

	}

}