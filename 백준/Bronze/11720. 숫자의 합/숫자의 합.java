import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		int sum = 0;
		String str = sc.nextLine();
		
		for(int j = 0; j<N; j++) {
			int num = str.charAt(j) - '0';
			sum += num;
		}
			
		System.out.print(sum);	
	}

}