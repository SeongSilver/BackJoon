package basicMath;

import java.util.Scanner;

public class BJ_Math1_1712 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(C<=B) System.out.println("-1");
		
		else{
		int count = A/(C-B)+1;
		System.out.println(count);
		}
	}
}
