package forLoopsQuestions;

public class Pascal_Triangle {
    public static void main(String[] args) {
        // here we apply combinations (ncr) where n = row and i = r 
        int n = 6;
        int row = 0;
        int star = 1;
        while(row < n){
            int i = 0;
            int val = 1;
            while(i < star){
                System.out.print(val + " ");
                val=((row-i)*val)/(i+1);
                i++;
            }
            // next row prep
            row++;
            star++;
            System.out.println();
        }
    }
}
