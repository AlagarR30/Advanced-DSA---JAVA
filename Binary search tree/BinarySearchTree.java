import java.util.*;

public class BinarySearchTree{

 	/* create Node class, it containing left and right child of current node and key value */
	 class Node{
		 int data;
		 Node left,right;
		 Node(int data){
			 this.data = data;
			 left = right = null;
		 }
	 }

	Node root;
	public void insert(int data)
	{
	/* Fill your code here */
		root = insertRec(root,data);
	}
	public Node insertRec(Node r,int data){
		if(r==null) return new Node(data);
		else{
			if(r.data>data){
				r.left = insertRec(r.left,data);
			}
			else{
				r.right = insertRec(r.right,data);
			}
		}
		return r;
	}

	public void display()
	{
	 /* Fill your code here */
	 if(root == null) System.out.println("There are no elements in the BST.");
	 else displayRec(root);
	 System.out.println();
	}

	public void displayRec(Node root)
	{
	 /* Fill your code here */
	 if(root ==null) return;
	 displayRec(root.left);
	 System.out.print(root.data+" ");
	 displayRec(root.right);
	}

	public void delete(int data)  
    	{ 
        /* Fill your code here */ 
		if(root==null){
			System.out.println("Tree is empty");
			return;
		}
		root = deleteRec(root,data);
    	} 
   
    	public Node deleteRec(Node root,int data)  
    	{ 
        /* Fill your code here */
		if(root == null){
			System.out.println("Data to be deleted, not found");
			 return null;}
		else if (root.data == data){
			//case:1
			if(root.right == null && root.left == null) return  null;
			//case:2
			else if(root.left == null) return root.right;
			else if(root.right==null) return root.left;
			//case3
			else {
				int min = minValue(root.right);
				root.data = min;
				root.right = deleteRec(root.right,min);
			}
		}
		else if(data<root.data){
			root.left = deleteRec(root.left,data);
		}
		else{
			root.right = deleteRec(root.right,data);
		}
		return root;
    	} 
	
	public int minValue(Node root)
	{
	/* Fill your code here */
	while(root.left!=null){
		root = root.left;
	}
	return root.data;
	}

}