package patterns;

public class pattern4 {
    public static void main(String[] args) {
        int n = 5;
        int star = n;
        int row = 1;
        while (row <= n) {
            // star prep
            int i=1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }
            // next line prep
            System.out.println();
            row++;
            star--;
        }
    }
}
