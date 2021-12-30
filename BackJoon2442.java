package BackJoon;

public class BackJoon2442 {
    public static void main(String[] args) {
        
        final int star = 5;
        //for문으로 5줄만들기
        for(int i=1;i<=star;i++){
            //공백찍기
            for(int j=i;j<star;j++){
                System.out.print(" ");
            }
            //별찍기
            for(int k=0;k<i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*공백찍기
            j값을 i와 같게 해서 1부터 상수 star 5미만 의 개수로
            반복될때마다 하나씩 줄며 공백찍음(4 3 2 1 0)*/

/*별찍기
            줄마다 1 3 5 7 9 가 되게 하기 위해서 
            k를 0으로 두고 범위를 i*2-1홀수로 미만으로 둔다*/            