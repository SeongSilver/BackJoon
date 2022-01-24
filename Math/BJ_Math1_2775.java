package Math;

import java.util.Scanner;

public class BJ_Math1_2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a층 b호에 살려면 a-1층의 1~b호의 사람 수의 합만큼 데려와 살아야함
		//k층에 n호에는 몇명사는지 출력
		//0층부터 존재하며 i호에는 i명이 산다
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		for(int m=0;m<test;m++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int[][] apart = new int[15][15]; //문제에서 1<k,n<14라고 했지만 0층이 존재한다고 해서 15로 함
			
			for(int i=0;i<15;i++) {
				apart[i][1] =1; //1호실은 이전 층의 1호실만을 더한 수인데 그게 모두 1이라서 1로 초기화
				apart[0][i]=i; //0층의 i호실의 사람 수는 i명이라고 문제에서 정의해줬음
			}
			
			for(int j=1;j<15;j++) { //0층의 값은 호실의 수와 동일하기 때문에 제외하고 1층부터 시작
				for(int l=2;l<15;l++) { //모든 층 1호실의 값은 1이기 때문에 int i인 for문에서 미리 초기화 해줬음 / 2호실부터 계산
					apart[j][l]=apart[j-1][l]+apart[j][l-1];
				}
			}
			System.out.println(apart[k][n]);
		}
	}

}
