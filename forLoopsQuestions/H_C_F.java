package forLoopsQuestions;

public class H_C_F {
    public static void main(String[] args) {
        // here always dividend > divisor but if vice versa(dividend < divisor) then it also gave the same ans .....only work extra  loop is working there
        int dividend =60;
        int divisor = 36;
        while(dividend % divisor != 0){
           int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        System.out.println(divisor);
    }
    
}
