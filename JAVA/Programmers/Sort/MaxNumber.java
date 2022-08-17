package sort;

import java.util.Arrays;
import java.util.Comparator;

public class MaxNumber {
	
	public String solution(int[] numbers) {
		String answer = "";
        
		String[] str = new String[numbers.length];
		
		for(int i=0;i<str.length;i++) {
			str[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(str, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return (s2+s1).compareTo(s1+s2);
			}
		});
		
		
		for(int j=0;j<str.length;j++) {
			answer+=str[j];
		}
		
		if(str[0]=="0") return "0";
		
		return answer;
		
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {6, 10, 2};
		int[] numbers2 = {3, 30, 34, 5, 9};
		
		MaxNumber mn = new MaxNumber();
		
		System.out.println(mn.solution(numbers));
		System.out.println(mn.solution(numbers2));
	}

}
