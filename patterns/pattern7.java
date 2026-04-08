package patterns;

public class pattern7 {
    public static void main(String[] args) {
        int n = 5;
        int star = n;
        int row = 1;
        int space = 0;
        while (row <= n) {
            // space prep
            int i = 1;
            while (i <= space){
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
            star--;
            space = space + 2;
        }
    }
}
