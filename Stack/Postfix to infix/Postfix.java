import java.io.*;
import java.util.*;

class Postfix
{
     public  Double evaluate(String exp){
        //fill your code here
        Stack<Double> st = new Stack<>();
        for(char c:exp.toCharArray()){
            if(Character.isDigit(c)) {
                st.push((double)c - '0');
        }
            else {
                double b = st.pop();
                double a = st.pop();
    switch(c) {
        case '+': {
            st.push(a+b);
            break;
        }
        case '-': {
            st.push(a-b);
            break;
        }
        case '*': {
            st.push(a*b);
            break;
        }
        case '/': {
            st.push(a/b);
            break;
        }
        case '^':{
            st.push(Math.pow(a,b));
        }
        default:
            break;
    }
}

        }
        return (double)st.pop();
    }
    
}
