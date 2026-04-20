package patterns;

import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 0;
        int row = 1;
        int star = 2*n -1;

        while(row <= n){
            // space prep
            int i =1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }
            //star prep
            int j = 1 ;
            while(j <= star){
                System.out.print("* ");
                j++;
            }
            // space prep 
            int k = 1;
            while(k <= space){
                System.out.print("  ");
                k++;
            }
            //next row prep
            System.out.println();
            row++;
            star -= 2 ;
            space++;
        }
    }
}
