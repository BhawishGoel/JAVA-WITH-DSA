package patterns;

import java.util.*;

public class pattern9 {
    public static void main(String[] args) {

        // using input 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n-1;
        int star = 1;
        while(row <= n){
            // space prep
            int i = 1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }
            // star prep
            int j = 1;
            while(j <= star){
                System.out.print("* ");
                j++;
            }
            // next row prep
            System.out.println();
            row++;
            space--;
            star = star + 2;
        }
        sc.close();
    }
    
}
