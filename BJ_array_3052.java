package array;
import java.util.Scanner;

public class BJ_array_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int same = 0;
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			int x = sc.nextInt();
			arr[i] = x%42;
		}
		
		for(int j=0;j<arr.length;j++) {
			same = 0;
			for(int k=j+1;k<arr.length;k++) {
				if(arr[j] == arr[k]) {
					same++;
				}
			}
			if(same == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
