package brute_force_search;

public class Moeuigosa {
	
	public int[] solution(int[] answers) {
		int[]answer = {};
		
		int[] t1 = {1,2,3,4,5};
		int[] t2 = {2,1,2,3,2,4,2,5};
		int[] t3 = {3,3,1,1,2,2,4,4,5,5};
		
//		int t1grade=0, t2grade=0, t3grade=0;
		int[] grade = new int[3];
		
		for(int i=0;i<answer.length;i++) {
			if(t1[i]%5==answer[i]) grade[0]++;
			if(t2[i]%5==answer[i]) grade[1]++;
			if(t3[i]%5==answer[i]) grade[2]++;
			
		}
		
		int max = grade[0];
		for(int j=1;j<3;j++) {
			if(max<grade[j])
				max=grade[j];
		}
		int maxCount=0;
		for(int k=0;k<3;k++) {
			if(grade[k]==max) maxCount++;
		}
		answer = new int[maxCount];
		for(int l=0;l<3;l++) {
			if(grade[l]==max) answer[l++]=l+1;
		}
		return answer;
		
//		if(grade[0]==answer.length) System.out.println("수포자 1은 모든 문제를 맞혔습니다.");
//		if(grade[1]==answer.length) System.out.println("수포자 2는 모든 문제를 맞혔습니다.");
//		if(grade[2]==answer.length) System.out.println("수포자 3은 모든 문제를 맞혔습니다.");
//	
//		if(grade[0]==0) System.out.println("수포자 1은 모든 문제를 틀렸습니다.");
//		if(grade[1]==0) System.out.println("수포자 2는 모든 문제를 틀렸습니다.");
//		if(grade[2]==0) System.out.println("수포자 3은 모든 문제를 틀렸습니다.");
//
//		if(grade[0]==grade[1] && grade[0]==grade[2]) System.out.println("모든 사람이"+grade[0]+"문제씩을 맞췄습니다.");
//		
	}

	public static void main(String[] args) {

	}	

}
