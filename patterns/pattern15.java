package patterns;

import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space = n - 1;
        int number = 1;
        while (row <= n) {
            // space prep
            int i = 1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }
            // number prep
            int j = 1;
            while (j <= number) {
                System.out.print("1 ");
                j++;
            }
            // next row prep
            System.out.println();
            row++;
            space--;
            number += 2;
        }
    }
}
