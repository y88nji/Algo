import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		String[] arr = str.split(" ");
		
		int A = 0;
		int B = 0;
		
		A = (arr[0].charAt(2) - '0') * 100;
		A += (arr[0].charAt(1) - '0') * 10;
		A += (arr[0].charAt(0) - '0') * 1;
		
		B = (arr[1].charAt(2) - '0') * 100;
		B += (arr[1].charAt(1) - '0') * 10;
		B += (arr[1].charAt(0) - '0') * 1;
		
		if (A>B)
			System.out.println(A);
		else
			System.out.println(B);

	}

}