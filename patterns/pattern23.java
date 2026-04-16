package patterns;

import java.util.Scanner;

public class pattern23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n/2;
        while(row <= n){
            //space prep
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            // star prep
            int j = 1;
            while(j <= star){
                System.out.print("* ");
                j++;
            }
            //mirror concept 
            if(row <= n/2){
                star +=2;
                space--;
            }else{
                star -= 2;
                space++;
            }
            row++;
            System.out.println();
        }
    }
}
