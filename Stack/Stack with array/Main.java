import java.util.*;  
public class Main{  
public static void main(String[] args) {  
    int choice=0;  
    Scanner sc = new Scanner(System.in);     
    System.out.println("Enter the maximum size of the stack");  
    int n=sc.nextInt();  
    Stack s = new Stack(n); 
    do{
        System.out.println("Choice 1 : Push\nChoice 2 : Pop\nChoice 3 : Display\nAny other choice : Exit");  
        System.out.println("Enter your choice");        
        choice = sc.nextInt();  
        switch(choice)  
        {  
            case 1:  
            {   
                System.out.println("Enter the element to be pushed");
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
                if(b!=-1000)
                System.out.println("The popped element is "+b);
                break;  
            }  
            case 3:  
            {  
		        System.out.print("The contents of the stack are ");
                //Fill your code here 
				s.display();
				System.out.println();
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