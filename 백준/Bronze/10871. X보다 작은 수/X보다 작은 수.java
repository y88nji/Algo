import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int x = sc.nextInt();
		
		int arr[] = new int[size];		
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < size; i++) {
			if(arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}
		
	}

}