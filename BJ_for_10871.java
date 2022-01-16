import java.util.Scanner;

public class BJ_for_10871 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
			
		int[] arr = new int[N];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int j=0;j<N;j++) {
			if(arr[j]<X) {
				System.out.print(arr[j]+" ");
			}
				
		}
		
	}

}
