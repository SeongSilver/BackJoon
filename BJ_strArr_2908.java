package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_strArr_2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader로 문자 A,B를 받아옴
		
		//A,B를 토큰화하여 분활나눔
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		//StringBuilder에 토큰화된 st1, 2를 저장 후 reverse()로 뒤집고 문자화 한다음
		//Integer.parseInt()로 정수로 만든다음에 비교해서 출력
		int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.println(Math.max(a,b));
		br.close();
	}		
}
