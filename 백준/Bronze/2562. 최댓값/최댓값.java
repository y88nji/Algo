import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		
		for(int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int maxIndex = 0;
		for(int i = 1; i < 9; i++) {
			if (max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		
		System.out.println(max);
		System.out.println(maxIndex + 1);
		
	}

}