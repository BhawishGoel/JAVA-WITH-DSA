package patterns;

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;
        int row = 1;
        int space = -1;
        while(row <= n){
            // star prep
                int i = 1;
                while (i <= star) {
                    System.err.print("* ");
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
            if(row == 1){
                k = 2;
            }
            while(k <= star){
                System.out.print("* ");
                k++;
            }

            // next line prep
                System.out.println();
                row++;
                space += 2;
                star--;
        }
    }
    
}
