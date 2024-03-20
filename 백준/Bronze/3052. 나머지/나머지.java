import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arr1[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int arr2[] = new int[42];
		for(int i = 0; i < 10; i++) {
			arr2[arr1[i] % 42] = 1;
			
		}
		
		int count = 0;
		for(int i = 0; i < 42; i++) {
			if(arr2[i] != 0) {
				count += 1;
			}
		}
		
		System.out.println(count);
		
	}

}