package patterns;

import java.util.Scanner;

public class patternTriangle {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n - 1;
        int star = 1;
        int val = 1;
        // vertical mirroring is there 

        while(row <= n ){
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
            star += 2;
            space --;
            row++;
            val++;
            System.out.println();
        }
    }
    
}
