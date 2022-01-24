package Math;

import java.util.Scanner;

public class BJ_Math1_10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i=0;i<test;i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			//YY는 층의 수 XX는 호실의 수
			int Y;
			int X;
			if(N%H==0) {
				//YYNN호실이기 때문에 *100해줌
				// Y/H=0이면 0층이 아니라 맨 꼭대기 층임 고로 층수는 높이(H)
				Y=H*100; 
				
				//호실의 수는 곧 몫 ex)3/3=1 3/6=2 3/9=3 사람의 수가 층수의 배수이면 해당 호실의 모든 층이 꽉 차기 때문에 N/H의 몫이 호실 수가 된다.
				X=N/H;
				System.out.println(Y+X);
			} else {
				//사람의 수가 층의 배수가 아니라면 나머지가 층을 의미
				Y=(N%H)*100; 
				//0호실은 있을 수 없기 때문에 +1
				X=(N/H)+1; 
				System.out.println(Y+X);
			}
		}
	}

}
