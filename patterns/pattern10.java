package patterns;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = n - 1;
        int row = 1;
        while (row <= n) {
            // space prep
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            // star prep
            int j = 1;
            while (j <= star) {
                if (j % 2 != 0) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("! ");
                }
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
