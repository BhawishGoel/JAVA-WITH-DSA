package patterns;

import java.util.Scanner;

public class pattern29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n - 1;
        int star = 1;

        while(row <= 2 * n - 1 ){
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
            if(row < n){
                star += 2;
                space --;
            }else{
                star -= 2;
                space++;
            }
            row++;
            System.out.println();
        }
    }
}
