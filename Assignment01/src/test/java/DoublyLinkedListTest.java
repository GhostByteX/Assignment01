import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DoublyLinkedListTest {

	private DoublyLinkedList object;
	@Before
	public void initialize() { object= new DoublyLinkedList(); }
	
	
	
	@Test
	public void pushFrontTest1() {
		
		int[] result= {12,7,4,2};
		
		
		
		object.pushFront(2);
		object.pushFront(4);
		object.pushFront(7);
		object.pushFront(12);
		
	for (int i=0;i<object.size;i++)
	{
		assertEquals(result[i],object.head.key);
		object.head=object.head.next;
	}
	
	
	}

	@Test
	public void pushBackTest1() {
		
		int[] result= {2,4,7,12};
		
		
		
		object.pushBack(2);
		object.pushBack(4);
		object.pushBack(7);
		object.pushBack(12);
		
	for (int i=0;i<object.size;i++)
	{
		assertEquals(result[i],object.head.key);
		object.head=object.head.next;
	}
	
	
	}
	
	@Test
	public void popBackTest1() {
		
		int[] result= {2,4};
		
		
		
		object.popBack();
		object.popBack();
		object.pushBack(2);
		object.pushBack(4);
		object.pushBack(7);
		object.pushBack(12);
		object.popBack();
		object.popBack();
		
	for (int i=0;i<object.size;i++)
	{
		assertEquals(result[i],object.head.key);
		object.head=object.head.next;
	}
	
	
	}
	
	@Test
	public void popFrontTest1() {
		
		int[] result= {7,12};
		
		
		
		object.popFront();
		object.popFront();
		object.pushBack(2);
		object.pushBack(4);
		object.pushBack(7);
		object.pushBack(12);
		object.popFront();
		object.popFront();
		
	for (int i=0;i<object.size;i++)
	{
		assertEquals(result[i],object.head.key);
		object.head=object.head.next;
	}
	
	
	}
	
	
	
	

}
