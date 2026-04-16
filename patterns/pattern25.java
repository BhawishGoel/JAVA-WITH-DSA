package patterns;

import java.util.Scanner;

public class pattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int star = 1;
        int space = n / 2;

        while (row <= n) {

            // space prep 
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            // stars prep (edge only)
            int j = 1;
            while (j <= star) {
                if (j == 1 || j == star) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // inner hollow space
                }
                j++;
            }

            // next row prep 
            if (row <= n / 2) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }

            row++;
            System.out.println();
        }
    }
}