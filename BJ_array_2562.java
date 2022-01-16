import java.util.Scanner;

public class BJ_array_2562 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];

		int max = -100000000;
		int maxindex = 0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>max) {
					max = arr[j];
					maxindex = j+1;
				}
			}
		}
		sc.close();
		System.out.println(max);
		System.out.println(maxindex);
		
	}

}
