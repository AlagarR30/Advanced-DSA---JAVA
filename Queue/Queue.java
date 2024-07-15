class Node{
    int data;
    Node next ;
    public Node(int data){
        this.data = data;
        next = null;
    }
}

class Queue{
    Node front ;
    Node rear;
    public Queue(){
        front =null;
        rear = null;
    }

    public void enQueue(int data){
        Node nn = new Node(data);
        if(front ==null && rear == null){
            front = nn;
            rear = nn;
        }
        rear.next = nn;
        rear = nn;
    }
    public int deQueue(){
        if(front ==null){
            System.out.println("List is empty");
            return -1000;
        }
        int d = front.data;
        front = front.next;
        return d;
    }
    public void display(){
        if(front ==null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Contents of the Linked list are");
        Node tp = front;
        while(tp!=null){
            System.out.print(tp.data+" ");
            tp = tp.next;
        }
        System.out.println();
    }
}