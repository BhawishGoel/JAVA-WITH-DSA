package patterns;

import java.util.Scanner;

public class pattern29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n - 1;
        int star = 1;
        int val = 1;
        // both vertical and horizontal mirroring is there 

        while(row <= 2 * n - 1 ){
            // space prep 
            int i = 1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }

            // star prep 
            int j = 1;
            int p = val;
            while(j <= star){
                System.out.print(p + " ");
                // vertical mirroring 
                if(j <= star/2 ){
                    p++;
                }else{
                    p--;
                }
                j++;
            }
            // horizontal mirror concept
            if(row < n){
                star += 2;
                space --;
                val++;
            }else{
                star -= 2;
                space++;
                val--;
            }
            row++;
            System.out.println();
        }
    }
}
