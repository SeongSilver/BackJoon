package for2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ_for_15552 {

		//throw 이용 시
		//(1) 클래스를 import해주어야 한다. 
		//(2) main 클래스 옆에 throws IOException를 작성한다. 

	public static void main(String[] args) throws IOException {
		//InputStream is = System.in;
		//Reader reader = new InputStreamReader(is);
		//BufferedReader br = new BufferedReader(reader);
		
		//Scanner대신 BuufferedReader를 쓰는 이유는
		//버퍼 사이즈가 Scanner가 1024char인데 비해 BuffedReader는 8192char이기 떄문에 입력이 많을 때유리하고
		//Scanner에 비해 수행속도가 매우 빠르다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWrite도 위와 동일하지만 축약해서 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//StringTokenizer의 nextToken()함수를써서 readLine()을 통해 입력 받은 값을 공백 단위로 구분해서 호출
		//하거나 String의 split메서드로 공백단의 끊어 데이터 저장해서 사용 
		
		//StringTokenizer클래스는 문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스이다. 
		StringTokenizer st;
		
		//BufferedRead는 입력받은데이터가 String으로 고정되기 때문에 데이터를 Integer로 형변환해야 함.
		//입력은 readLine();메소드 사용
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			st= new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			
			bw.write(A+B+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
		}
	}


