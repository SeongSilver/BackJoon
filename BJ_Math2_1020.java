package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_Math2_1020 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		getSosu(M,N);
		
		br.close();
	}
	
	public static void getSosu(int M, int N) {
		
		boolean[] isPrime = new boolean[N+1];
		Arrays.fill(isPrime, true);
		
		isPrime[0]=isPrime[1]=false;
		
		for(int i=2;i<=isPrime.length;i++) {
				for(int j=i*2;j<isPrime.length;j+=i) {
					isPrime[j]=false;
				}
		}
		for(int k=M;k<=N;k++) {
			if(isPrime[k]) System.out.println(k);
		}
		
	}
}

