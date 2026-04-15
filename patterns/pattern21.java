package patterns;

import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = 1;
        int star = n/2;
        while(row <= n){
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
            //star prep
            int k = 1 ;
            while(k <= star){
                System.out.print("* ");
                k++;
            }
            row++;
            star--;
            space += 2;
            System.out.println(); 
        }
    }
}
