package strArr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_strArr_1152 {

	public static void main(String[] args)throws IOException {
		// TODO 자동 생성된 메소드 스텁
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		System.out.println(st.countTokens());
		br.close();
		
		
	}

}
