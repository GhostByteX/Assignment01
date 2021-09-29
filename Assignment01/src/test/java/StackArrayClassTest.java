import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackArrayClassTest {

	
	private StackArrayClass object;
	@Before
	public void initialize() { object= new StackArrayClass(); }
	
	
	@Test
	public void pushTest()
	{
		int [] result= {1,9,8,4};
		
		
		object.push(1);
		object.push(9);
		object.push(8);
		object.push(4);
		
		for (int i=0;i<object.size;i++)
		{
			assertEquals(result[i],object.array[i]);
			
		}
	}

	@Test
	public void popTest()
	{
		int [] result= {8,4};
		
		
		
		object.pop();
		object.pop();
		
		for (int i=0;i<object.size;i++)
		{
			assertEquals(result[i],object.array[i]);
			
		}
	}
	
	

	



}

