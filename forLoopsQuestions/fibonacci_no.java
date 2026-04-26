package forLoopsQuestions;

public class fibonacci_no {
    public static void main(String[] args) {
        int n = 8;
        int a = 0;
        int b = 1;
        for(int i = 0 ;  i < n; i++){
            // if we want to print series add syso
            // System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }
}
