package strArr;

import java.util.Scanner;

public class BJ_strArr_1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = N; 	//나중에 입력 값 중 그룹단어가 아닌 것이 있으면 count--하기 위해 입력 받은 단어 수로 초기화
		
		for(int i=0;i<N;i++) {
			String str = sc.next();
			boolean[] alphabet = new boolean[26];	//boolean의 기본값이 false임을 이용해서 그룹문자가 아닌것은 true로 바꿔줘서 count로 true개수 
			
				for(int j=0;j<str.length()-1;j++) {	//비교값이 j와 j+1이기 때문에 StringIndexOutOfBound예외 방지하기 위해 str.length()에 -1빼줌
					if(str.charAt(j)!=str.charAt(j+1)) {
						if(alphabet[str.charAt(j+1)-97]==true) {	//이전에 먼저 그룹단어였다면 또 같은 문자가 나왔기 때문에 ~해라라는 조건문
							alphabet[str.charAt(j+1)-97]=false;
							count--;	//기존 count=N에서 해당하지 않는 단어일때는 1빼줌
							break;	//break안해주면 단어에서 중복단어 나올 때마다 count--해서 음수가 나올 수있음
						}
					}
					alphabet[str.charAt(j)-97]=true;
				}
		}
		System.out.println(count);
	}

}
