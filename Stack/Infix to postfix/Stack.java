class Node{
    char data ;
    Node next;
    Node(char data){
        this.data = data;
        next = null;
    }
}
class Stack{
    Node top;
    Stack(){
        top = null;
    }

    public void push(char data){
        if(top == null) top = new Node(data);
        else{
            Node tp = new Node(data);
            tp.next = top;
            top = tp;
        }
    }

    public char pop(){
        if(top == null) return '$';
        char d = top.data;
        top  = top.next;
        //count--;
        return d;
    }

 public char peek(){
     return top==null?'$':top.data;
 }
 public int priority(char c ){
     if(c=='*' || c=='/' || c=='%'){
         return 2;
     }
     else if(c=='+' || c=='-'){
         return 1;
     }
     else return 0;
 }
 public String infixToPrefix(String exp){
         StringBuilder sb = new StringBuilder();
         for(char c:exp.toCharArray()){
             if(Character.isAlphabetic(c)) sb.append(c);
             else if(c == '(') push(c);
             else if(c==')'){
                 while(peek() != '('){
                     sb.append(pop());
                 }
                 pop();
             }
             else if(c =='+' || c =='-' || c=='*' || c=='/') {
                 while(top!=null && priority(peek())>= priority(c)){
                     sb.append(pop());
                 }
                 push(c);
             }
             else return "Invalid input";
         }
 while(top!=null){
     sb.append(pop());
 }
 System.out.println("The postfix expression is");
 return sb.toString();
 }

}