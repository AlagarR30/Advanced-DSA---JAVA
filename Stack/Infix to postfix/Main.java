import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix expression");
        String str = sc.next();
        
        Stack s = new Stack();
        System.out.println(s.infixToPrefix(str));
    }
}