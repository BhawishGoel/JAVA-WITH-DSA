package patterns;

public class pattern_2 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = n;

        while(row <= n){
            int i =1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }
            row++;
            System.out.println();
        }
    }
}
