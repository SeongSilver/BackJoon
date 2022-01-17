package array;
import java.util.Scanner;

public class BJ_array_10818 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int max=arr[0];
		int min=arr[0];
		for(int j=0;j<arr.length;j++) {
				if(arr[j]>max) {
					max = arr[j];
				} else if(arr[j]<min) {
					min = arr[j];
			}
		}
		sc.close();
		System.out.println(min+" "+max);
	}
}
