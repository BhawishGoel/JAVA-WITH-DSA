package patterns;

import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = 2 * n - 3;
        // int space = 7;
        int row = 1;
        while (row <= n){
            // star prep 
            int i = 1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }
            // space prep
            int j = 1;
            while(j <= space){
                System.out.print("  ");
                j++;
            }
            // star prep
            int k = 1;
            if(row == n){
                k = 2;
            }
            while(k <= star){
                System.out.print("* ");
                k++;
            }
            // next row prep
            System.out.println();
            row++;
            star++;
            space = space - 2;
        }
        sc.close();
    }
}
