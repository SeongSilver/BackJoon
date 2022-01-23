import java.util.Scanner;

public class BJ_for2_10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] arr = new int[a];
		
		for(int i=0; i<a;i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			arr[i] = A+B;
		}
		for(int j : arr) {
			System.out.println(j);
		}
	}

}
