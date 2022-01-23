package basicMath;

import java.util.Scanner;

public class BJ_Math1_1712 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		//손익분기점 넘기려면 C*n > A+B*n이 되어야함
		//횟수인 n을 구하면 A/(C-B)+1이다
		// 1을 더한 이휴는 n=A/(C-B)에서는 손익분기점이 같기 때문에 이익이 발생하지 않기 때문 우측항을 더 크게 해주기 위함
		//-1이 출력되게 하려면 손익분기점이 음수나 0이 되어야하기 때문에 C-B<=0이 되어야 함 - if문에 포함시켜서 -1을 출력하게함
		//그 외에 경우는 n의 값이 나오게 출력
		if(C<=B) System.out.println("-1");
		
		else{
		int count = A/(C-B)+1;
		System.out.println(count);
		}
	}
}
