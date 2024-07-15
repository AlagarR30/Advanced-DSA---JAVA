import java.util.*;  
public class Main{  
public static void main(String[] args) {   
    Scanner sc = new Scanner(System.in);
    BinarySearchTree bst = new BinarySearchTree(); 
    String ch="";
    int choice=0;
    System.out.println("Binary Search Tree Implementation.\n");  
    System.out.println("\nChoice 1: Insert an element.\nChoice 2: Delete an element.\nChoice 3: Display.\n\n"); 
    do{
         System.out.println("Enter your choice :");        
         choice = sc.nextInt();
         switch(choice)  
         {  
            case 1:  
            {   
                System.out.println("Enter the element to be inserted :");
                int n=sc.nextInt();
        	    sc.nextLine();
        	    //Fill your code here
				bst.insert(n); 
                break;  
            }  
            case 2:  
            {  
		        System.out.println("Enter the element to be deleted :");
                int b=sc.nextInt(); 
		        sc.nextLine();
				bst.delete(b);
        	    //Fill your code here    
                break;  
            }  
            case 3:  
            {  
                //Fill your code here  
				bst.display();
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