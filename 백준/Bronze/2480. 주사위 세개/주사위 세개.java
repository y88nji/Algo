import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int max = num1;
		
		if(num1 == num2 && num2 == num3) {
			System.out.println(10000 + num1 * 1000);
		} else if (num1 == num2) {
			System.out.println(1000 + num1 * 100);
		} else if (num2 == num3) {
			System.out.println(1000 + num2 * 100);
		} else if (num3 == num1) {
			System.out.println(1000 + num3 * 100);
		} else {
			if (max < num2) {
				max = num2;
			}
			if (max < num3) {
				max = num3;
			}
			System.out.println(max * 100);
		}
		
	}

}
