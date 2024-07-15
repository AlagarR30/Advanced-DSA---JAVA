import java.util.*;

class Main{

    public static void main(String args[]){
        //fill your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter postfix expression to be evaluated:");
        String exp = sc.next();
       Postfix p = new Postfix();
        System.out.println("Result is : "+p.evaluate(exp).intValue());
        
    }
}