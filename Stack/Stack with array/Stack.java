import java.util.*;

public class Stack{

 	/* Initialize the value of top to -1 and initialize the value of maxsize */
	 int top;
	 int[] arr;
	 int size;
	 public Stack(int size){
		 arr = new int[size];
		 this.size = size;
		 top = -1;
	 }

	public void push(int data)
	{
	/* Fill your code here */
		if(top== size-1){
			System.out.println("Stack   is full");
		}else{
			//System.out.println("The ")
			arr[++top] = data;
		}
	}

	public int pop()
	{
	 /* Fill your code here */
	 if(top ==-1){

	  System.out.println("Stack is empty");
	  return -1000;
	}
	 else {
		// System.out.println("Thepopped element is "+arr[top]);
		return arr[top--];
		 //arr[top--] = 0;
	 }
	}

	public void display()
	{
		if(top==-1){
			System.out.println("{}");
			return;
		}
	/* Fill your code here */
	for(int i=0;i<top;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.print(arr[top]);

	}


}