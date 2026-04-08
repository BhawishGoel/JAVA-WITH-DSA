package patterns;

public class pattern8 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = n-1;
        int star = 1;
        while(row <= n){
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
            // next row prep
            System.out.println();
            row++;
            space--;
            star = star + 2;
        }
    }
}
