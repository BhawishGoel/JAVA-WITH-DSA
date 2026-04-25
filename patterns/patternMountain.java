package patterns;

import java.util.Scanner;

public class patternMountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = 2 * n - 3 ;
        int val = 1;
        while (row <= n) {
            // star prep 
            int p = val;
            int i = 1;
            while(i <= star){
            System.out.print(p + " ");
            p++;
            i++;
            }
            // space prep 
            int j = 1;
            while(j <= space){
                System.out.print("  ");
                j++;
            }
            // star prep 
            p = star;
            int k = 1;
            if (row == n){
                p = star - 1;
                k =2;
            }
            while( k <= star){
                System.out.print(p +" ");
                p--;
                k++;
                
            }
            // next row prep
            // val++;
            star++;
            space -=2;
            row++;
            System.out.println();
        }
    }
    
}
