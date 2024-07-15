import java.util.*;  
public class Main{  
public static void main(String[] args) {  
    int choice=0;  
    Scanner sc = new Scanner(System.in);      
    Queue q = new Queue(); 
    do{
        System.out.println("Enter your choice\n1 Insert rear\n2 Delete front\n3 Display\n4 Exit");  
        //System.out.println("Enter your choice");        
        choice = sc.nextInt();  
        switch(choice)  
        {  
            case 1:  
            {   
                System.out.println("Enter the data");
                int a=sc.nextInt();
                sc.nextLine();
                //Fill your code here 
				q.enQueue(a);
                break;  
            }  
            case 2:  
            {  
                //Fill your code here
				int b = q.deQueue();
                if(b!=-1000)
                System.out.println("Deleted data is "+b);
                break;  
            }  
            case 3:  
            {  
			//System.out.print("The contents of the queue are");
                //Fill your code here 
				q.display();
                break;  
            }  
            default:  
            {  
                System.exit(0);  
                break; 
            }    
    }
    }while(choice<4);
}
}  