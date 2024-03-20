import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int [n];
		double[] arr2 = new double[n];
		double max = 0;
		
		for(int i =0; i<n; i++) {
			int num = sc.nextInt();
			arr[i] = num;
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		double sum = 0;
		for(int i = 0; i < n; i++) {
			arr2[i] = arr[i] / max * 100;
			sum += arr2[i];
		}
		
		System.out.println(sum / n);
	}

}
