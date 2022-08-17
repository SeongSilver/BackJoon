package Math;

import java.math.BigInteger;
import java.util.Scanner;

public class BJ_Math1_10757 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		BigInteger A = sc.nextBigInteger();
//		BigInteger B = sc.nextBigInteger();
		BigInteger A = new BigInteger(sc.next());
		BigInteger B = new BigInteger(sc.next());
		
		System.out.println(A.add(B));
	}

}
