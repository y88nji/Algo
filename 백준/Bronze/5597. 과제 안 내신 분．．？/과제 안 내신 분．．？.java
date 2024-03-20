import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int arr[] = new int [30];
		
		for(int i = 0; i < 30 - 2; i++) {
			int temp = sc.nextInt();
			arr[temp-1] = temp;
		}
		
		for(int i = 0; i < 30; i++) {
			if (arr[i] == 0) {
				System.out.println(i+1);
			}
		}
	}

}