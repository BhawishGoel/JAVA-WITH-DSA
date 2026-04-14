package patterns;

import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1 ;
        int star = 1;
        while ( row <= 2 * n -1){
            // star prep 
            int i = 1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }
            if (row < n ){
                star++;
            }
            else{
                star--;
            }
            // next row prep
            System.out.println();
            row++;
        }
    }
}
