package patterns;

import java.util.Scanner;

public class patternHollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space = n-1;
        int star = n;

        while(row <= n ){
            // space prep 
            int i = 1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }
            // star prep
            int j = 1;
            while(j <= star){
                if(row == 1 || row == n || j == 1 || j == star){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                j++;
            }
            row ++;
            space --;
            System.out.println();
        }
    }
}
