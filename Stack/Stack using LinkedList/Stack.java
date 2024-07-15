class Node{
    int data ;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class Stack{
    Node top;
    int size;
    int count = 0;
    Stack(int data){
        top = null;
        size = data;
    }

    public void push(int data){
        if(top == null) top = new Node(data);
        else{
            Node tp = new Node(data);
            tp.next = top;
            top = tp;
        }
        count++;
    }

    public int pop(){
        if(top == null) return -1000;
        int d = top.data;
        top  = top.next;
        count--;
        return d;
    }

    public void display(){
        if(top ==null) System.out.print("Empty");
        Node tp = top;
        while(tp!= null){
            System.out.print(" " +tp.data);
            tp = tp.next;
        }
        System.out.println(" ");
    }
    
}