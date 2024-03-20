import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int loop = sc.nextInt();

		int arr[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i < loop; i++) {
			int A = sc.nextInt() - 1;
			int B = sc.nextInt() - 1;
			int temp = 0;
			
			temp = arr[A];
			arr[A] = arr[B];
			arr[B] = temp;
			
		}
		
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}