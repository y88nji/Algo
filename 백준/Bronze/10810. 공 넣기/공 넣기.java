import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int loop = sc.nextInt();
		
		int arr[] = new int [size];
		
		for(int i = 0; i < loop; i++) {
			int start = sc.nextInt() - 1;
			int end = sc.nextInt() - 1;
			int content = sc.nextInt();
			
			for (int j = start; j <= end; j++) {
				arr[j] = content;
			}
		}
		
		for(int k = 0; k < size; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}