package BackJoon;

public class BackJoon2444 {
    public static void main(String[] args) {
        final int DIAMOND = 5;
        
        /*i는 안의 for문들한테 영향을 줘야되기 때문에 0이 아니라 1
        5번 반복해야되기 때문에 상수 DIAMOND 값에 +1의 범위를 주고 증가*/
        for(int i=1;i<DIAMOND+1;i++){
            /*i가 1~5일때 공백은 4~0찍혀야됌
            j값은 1로 고정해두고 조건식을 반복문이 돌 수록 점점 작아지게 해야하기 떄문에
            고정값 상수 DIAMOND에 1씩커지는 i값을 빼주는 범위로 두면
            공백이 1씩 줄어서 4~0이 된다.*/ 
            for(int j=1;j<=DIAMOND-i;j++){
                System.out.print(" ");
            }
            /*i의값은 5까지 증가로 정해져 있고 i값이 1 증가 할 때마다
            별의 개수가 1~9까지 2씩 증가해야 되기 때문에 홀수를 찍기위해 
            범위를 i*2-1로 정하고 i가 1일때 별이 1개 찍혀야 하기 때문에 
            k값을 0으로 둠*/ 
            for(int k=0;k<i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*위의 for문은 5번 반복이지만 아래 역삼각형은 4번 반복이므로 
        DIAMOND 이하가 아닌 미만으로 조건식을 잡았다. */
        for(int l=1;l<DIAMOND;l++){
            /*l값이 1~4가 될 때 공백이 똑같이 1~4개 찍혀야 하므로
            첫 반복때는 1이 나오도록 l값을 1 조건식을 m<=l로 두어 값을 같게 하였다.*/
            for(int m=1;m<=l;m++){
                System.out.print(" ");
            }
            /*별의 개수가 7~1로 2씩 줄어드는 홀수가 나오게 하기 위해서
            조건식은 DIAMOND*2-1인 9 미만으로 두고 반복될 때마다 n값을 증가시키기 위해
            l*2로하여 1~7가 되게 만들었다. */
            for(int n=l*2;n<DIAMOND*2-1;n++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
