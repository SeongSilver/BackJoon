package sort;

import java.util.Arrays;

public class Knumber {
	public int [] solution(int[] array, int[][] commands) {
		int[] answer = {};
		 answer = new int[commands.length];
		 
		 for(int i=0;i<commands.length;i++) {
			 // 2�����迭 commands�� i��° �� ���� �ϳ��ϳ� �޾Ƽ� �ٸ� �ӽ� �迭�� �����ϴ� ��ҷ� ���
			 int a = commands[i][0];
			 int b = commands[i][1];
			 int c = commands[i][2];
			 
			 int[] tmp = Arrays.copyOfRange(array, a-1, b);
			 //����
			 Arrays.sort(tmp);
			 //ũ�Ⱑ commands.length�� �迭�� i��° ��ҿ� c���� ã�� ���ؼ��� -1�� ���༭ �ε������� ����� ��
			 answer[i]=tmp[c-1];
		 }
		return answer;                                                                                                                                                                                                                                     
	}
	
	public static void bubbleSort(int[] arr, int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=n-1;j>0;j--) {
				if(arr[j-1]>arr[j]) {
					int tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}
