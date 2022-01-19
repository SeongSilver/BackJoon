package function;

import java.util.Scanner;

public class BJ_function_15596 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Test t1 = new Test();
		int[] arr = new int[n];
		
		System.out.println(t1.sum(arr));
	}

}
class Test{
	long sum(int[] a) {
		long sum = 0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
}