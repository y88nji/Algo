import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		System.out.println(num1 * (num2 % 10));
		System.out.println(num1 * ((num2 % 100) - ((num2 % 10))) / 10);
		System.out.println(num1 * ((num2 % 1000) - ((num2 % 100))) / 100);
		System.out.println(num1 * num2);
	}

}