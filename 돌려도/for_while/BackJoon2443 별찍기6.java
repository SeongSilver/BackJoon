package BackJoon;

public class BackJoon2443 {
    public static void main(String[] args) {
        final int star1 = 5;

        for(int i=1;i<=star1;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=star1*2-1;k>=i*2-1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 