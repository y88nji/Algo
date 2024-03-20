import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] alphabet = { { 'A', 'B', 'C' }, { 'D', 'E', 'F' }, { 'G', 'H', 'I' }, { 'J', 'K', 'L' },
				{ 'M', 'N', 'O' }, { 'P', 'Q', 'R', 'S' }, { 'T', 'U', 'V' }, { 'W', 'X', 'Y', 'Z' } };
		int[] seconds = { 3, 4, 5, 6, 7, 8, 9, 10 };

		String str = sc.nextLine();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < 8; j++) {
				for (int k = 0; k < alphabet[j].length; k++) {
					if (str.charAt(i) == (alphabet[j][k])){
						count += seconds[j];
						break;
					}

				}
			}
		}
		System.out.println(count);

	}
}
