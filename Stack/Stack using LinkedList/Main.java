import java.util.*;  
public class Main{  
public static void main(String[] args) {  
    int choice=0;  
    Scanner sc = new Scanner(System.in);     
    System.out.println("Enter the maximum size of stack");  
    int n=sc.nextInt();  

    Stack s = new Stack(n); 
    do{
        System.out.println("Linked Stack Operations");
        System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit");  
        System.out.println("Enter the option");        
        choice = sc.nextInt();  
        switch(choice)  
        {  
            case 1:  
            {   
                if(s.count == s.size) {
                   System.out.println("Stack OverFlow");
                   break;
               }
                System.out.println("Enter integer element to push");
                int a=sc.nextInt();
                sc.nextLine();
                //Fill your code here  
                s.push(a);
                break;  
            }  
            case 2:  
            {  
                //Fill your code here
                int b = s.pop();
                if(b!=-1000)System.out.println("Popped Element is "+b);
                else   System.out.println("Error : Underflow Exception");
                break;  
            }  
            case 3:  
            {  
                if(s.count==0){System.out.println("Stack element is Empty");break;}
		        // System.out.println("Elements in the stack are");
                System.out.print("Stack element is");
                //Fill your code here 
				s.display();
				//System.out.println();
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