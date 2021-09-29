import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackLinkedListTest {

	
	private StackLinkedList object;
	@Before
	public void initialize() { object= new StackLinkedList(); }
	
	
	@Test
	public void pushTest()
	{
		int [] result= {4,8,9,1};
		
		
		object.push(1);
		object.push(9);
		object.push(8);
		object.push(4);
		
		for (int i=0;i<object.getSize();i++)
		{
			assertEquals(result[i],object.top());
			object.pop();
		}
	}

	@Test
	public void popTest()
	{
		int [] result= {9,1};
		
		
		object.push(1);
		object.push(9);
		object.push(8);
		object.push(4);
		
		object.pop();
		object.pop();
		
		for (int i=0;i<object.getSize();i++)
		{
			assertEquals(result[i],object.top());
			object.pop();
		}
	}
	
	@Test
	public void topTest()
	{
		int result=56;
		
		
		object.push(1);
		object.push(9);
		object.push(56);
		object.push(4);
		
		assertNotEquals(result,object.top());
		object.pop();
		assertEquals(result,object.top());
		
	}

	@Test
	public void sizeTest()
	{
		int result=3;
		
		
		object.push(1);
		object.push(9);
		object.push(8);
		object.push(4);
		
		assertNotEquals(result,object.getSize());
		
		object.pop();
		
		assertEquals(result,object.getSize());
	}



}
