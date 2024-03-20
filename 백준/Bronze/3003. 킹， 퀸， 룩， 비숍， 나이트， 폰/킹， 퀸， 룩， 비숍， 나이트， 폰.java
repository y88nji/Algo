import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] base = {1, 1, 2, 2, 2, 8};
		int[] input = new int [base.length];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		for (int i = 0; i < base.length; i++) {
			if(base[i] < input[i])
				System.out.print((input[i] * -1 + base[i]) + " ");
			else
				System.out.print((base[i] - input[i]) + " ");
		}
	}

}
