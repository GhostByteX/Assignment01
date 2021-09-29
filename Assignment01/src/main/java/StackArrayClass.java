public class StackArrayClass{
	static int [] array; //array to store numbers.
	static int size; //stores the number of elements in the array.
	static int addPointer; //points to the position, where new number is to be added.

	public StackArrayClass(){
		array=new int[100]; //length = 100
		size=0;  //initial size = 0.
		addPointer=0; //initially points to position = 0;
	}
	
	//function to add elements in the stack.
	static public void push(int number){
		//if stack is full.
		if(addPointer>=array.length){
			System.out.println("Stack is Full!");
			return;
		}
		
		
		
		//else just add the element.
		array[addPointer]=number;
		addPointer++;
		size++;
	}
	
	//function to remove the top element.
	static public int pop(){
		//if stack is empty.
		if(addPointer==0){
			System.out.println("Stack is Empty!");
			return -1;
		}
		
		

		//else just return and remove the element.
		addPointer--;
		size--;
		return array[addPointer];
		
	}


	
}