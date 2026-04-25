package patterns;

import java.util.Scanner;

public class patternMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int space = -1 ;
        while(row <= 2 * n - 1 ){
            // star prep 
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            // space prep
            int j = 1;
            while( j <= space){
                System.out.print("  ");
                j++;
            }
            //star prep 
            int k = 1;
            if(row == 1 || row == 2 * n -1 ){
                k = 2;
            }
            while( k <= star){
                System.out.print("* ");
                k++;
            }
            // mirror concept
            if(row <n){
            star--;
            space += 2;
            }else{
                star++;
                space -= 2; 
            }
            row++;
            System.out.println();
        }
    }
}
