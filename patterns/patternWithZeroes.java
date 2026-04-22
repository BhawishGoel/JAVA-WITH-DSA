package patterns;

import java.util.Scanner;

public class patternWithZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int star = 1;
        int val = 1;
        while (row <= n) {
            // star prep 
            int i = 1;
            while (i <= star) {
                System.out.print(val + " ");
                i++;
            }
            // space prep
             row ++;
             star++;
             val++;
             System.out.println();
        }
    }
    
}
