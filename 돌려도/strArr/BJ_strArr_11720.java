package strArr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_strArr_11720 {

	public static void main(String[] args)throws IOException {
		// TODO 자동 생성된 메소드 스텁
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int sum=0;
		for(int i=0;i<N;i++) {
			sum+=str.charAt(i)-'0';
		}
		br.close();
		System.out.println(sum);
	}

}
