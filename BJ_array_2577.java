import java.util.Scanner;

public class BJ_array_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		String str =A*B*C+" ";
		
		int[] arr = new int[] {0,1,2,3,4,5,6,7,8,9};
		int[] count = new int[] {};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(str.charAt(j)==arr[i]) {
					count[j]++;
				}
			}
		}
		for(int i=0;i<count.length;i++) {
			System.out.println(count[i]);
		}
	}

}
