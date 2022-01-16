import java.util.Scanner;

public class BJ_array_10818 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		
		int max=-100000;
		int min=100000;
		
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
				if(arr[i]>max) {
					max = arr[i];
				} 
				if(arr[i]<min) {
					min = arr[i];
			}
		}
		sc.close();
		System.out.println(min+" "+max);
	
	}

}
