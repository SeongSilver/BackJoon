package function;

import java.util.Scanner;

public class BJ_function_1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//등차수열이란 같은 수만큼 증가하는 나열된 수를 말한다 점화식은 an= a1 + (n-1)d이다
		//첫 항을 뺀 나머지 수에 d를 계속 더해주는 것이다
		
		//한수는 각 자리수가 등차수열을 이루는 수이다. 
		//예를들면 12345/ 13579/ 147과 같이 각 자리의 숫자의 차이가 동일한 숫자이다.
		//1의자리수는 비교할 대상이 없기 때문에 무조건 한수이고 10자리 수도 비교할 대상이 한개이기 때문에 무조건 한수이다
		//100의자리수는 각 숫자를 비교한 후 한수를 구해야 한다
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		System.out.println(hanSoo(N));
		
		sc.close();
		}
	public static int hanSoo(int N) {
		int count = 0;
		
		if(N<100) return N;
		else {
			count = 99;  //10의자리 수까지는 모든 숫자가 한수이때문에 100이상의 숫자에서는 한수의 count가 99가 된다.
			
			//이부분은 잘 이해가 안가는데 입력값중 최대값은 100이고 어차피 등차수열도 아니고 
			//1000보다 큰 수는 입력받지 않기 떄문에 N이 1000일 경우 999로 변경해준다고 하네요(이게 예외처리라고..)
			if(N==1000) N = 999; 
			
			
			for(int i=100 ; i<=N ; i++) {
				int hundred = i/100; //100의 자리수 구하기
				int ten = (i/10)%10;	//10의 자리수 구하기
				int one = i%10;	//1의 자리수 구하기
			
				//100의자리-10의자리와 10의자리-1의자리가 같다면 각 자리수가 등차 수열인 한수가 된다는  if문
				//이 숫자가 한수라면 count++해준다.
			if((hundred-ten)==(ten-one)) {  
				count++;
			}
			}
			
		}
		return count;
	}
}

