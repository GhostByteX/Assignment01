import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QueueArrayTest {

	
	private QueueArrayClass object;
	@Before
	public void initialize() { object= new QueueArrayClass(5); }
	
	
	@Test
	public void enqueueTest()
	{
		int [] result= {34,4,65,87,9};
		
		object.enqueue(34);
		object.enqueue(4);
		object.enqueue(65);
		object.enqueue(87);
		object.enqueue(9);
		
		for (int i=0;i<object.size;i++)
		{
			assertEquals(result[i],object.dequeue());
		}
	
	}
	
	@Test
	public void dequeueTest()
	{
		int [] result= {65,87,9};
		
		object.enqueue(34);
		object.enqueue(4);
		object.enqueue(65);
		object.enqueue(87);
		object.enqueue(9);
		
		int a=0,b=0;
		a=object.dequeue();
		b=object.dequeue();
		
		for (int i=0;i<object.size;i++)
		{
			assertEquals(result[i],object.dequeue());
		}
		
		assertEquals(a,34);
		assertEquals(b,4);
		assertNotEquals(a,4);
		assertNotEquals(b,34);
	
	}
	
}