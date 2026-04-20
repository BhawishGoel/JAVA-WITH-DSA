package patterns;

import java.util.Scanner;

public class pattern27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n - 1;
        int star = 1;
        while(row <= n){
            // space prep
            int i = 1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }
            //star prep
            int val = 1;
            int j = 1;
            while(j <= star){
                System.out.print(val + " ");
                val++;
                j++;
            }
            // next row  prep 
            star += 2;
            space--;
            row++;
            System.out.println();
        }
    }
    
}
