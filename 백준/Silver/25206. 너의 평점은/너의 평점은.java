import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = 20;
		String[][] str = new String[N][3];
		double[][] result = new double[N][2];

		// input
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < 3; j++) {
				str[i][j] = sc.next();
			}
		}
		// 학점변환
		for (int i = 0; i < str.length; i++) {
			for (int j = 2; j <= 2; j++) {
				if (str[i][j].equals("A+")) {
					result[i][j-1] = 4.5;
					result[i][j-2] = Double.parseDouble(str[i][j-1]);
				}
				if (str[i][j].equals("A0")) {
					result[i][j-1] = 4.0;
					result[i][j-2] = Double.parseDouble(str[i][j-1]);	
				}
				if (str[i][j].equals("B+")) {
					result[i][j-1] = 3.5;
					result[i][j-2] = Double.parseDouble(str[i][j-1]);
				}
				if (str[i][j].equals("B0")) {
					result[i][j-1] = 3.0;
					result[i][j-2] = Double.parseDouble(str[i][j-1]);
				}
				if (str[i][j].equals("C+")) {
					result[i][j-1] = 2.5;
					result[i][j-2] = Double.parseDouble(str[i][j-1]);
				}
				if (str[i][j].equals("C0")) {
					result[i][j-1] = 2.0;
					result[i][j-2] = Double.parseDouble(str[i][j-1]);
				}
				if (str[i][j].equals("D+")) {
					result[i][j-1] = 1.5;
					result[i][j-2] = Double.parseDouble(str[i][j-1]);
				}
				if (str[i][j].equals("D0")) {
					result[i][j-1] = 1.0;
					result[i][j-2] = Double.parseDouble(str[i][j-1]);
				}
				if (str[i][j].equals("P")) {
					result[i][j-1] = 0.0;
					result[i][j-2] = 0.0;
				}
				if (str[i][j].equals("F")) {
					result[i][j-1] = 0.0;
					result[i][j-2] = Double.parseDouble(str[i][j-1]);
				}
			}
		}
		
		double sum = 0;
		double count = 0;
		// 학점 계산
		for (int i = 0; i < result.length; i++) {
			count += result[i][0];
			sum += result[i][0] * result[i][1];
		}
		System.out.printf("%.6f", sum/count);
	}
}
