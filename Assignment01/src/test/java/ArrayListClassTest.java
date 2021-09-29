import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayListClassTest {

	private ArrayListClass object;
	@Before
	public void initialize() { object= new ArrayListClass(); }

	@Test
	public void addTest() {
		
		int[] positiveresult= {4,3,5,8,6,7,14,33};
		int[] negativeresult= {14,23,15,18,16,17,24,43};
		
		
		
		object.addElement(4);
		object.addElement(3);
		object.addElement(5);
		object.addElement(8);
		object.addElement(6);
		object.addElement(7);
		object.addElement(14);
		object.addElement(33);
		
		for (int i=0;i<object.size();i++)
		{
			assertEquals(positiveresult[i],object.array[i]);
		}
		
		for (int i=0;i<object.size();i++)
		{
			assertNotEquals(negativeresult[i],object.array[i]);
		}
			
	}

	
	@Test
	public void removeTest() {
		
		int[] positiveresult= {4,5,8,7,14,33};
		int[] negativeresult= {14,23,15,18,16};
		
		
		
		object.removeElement(1);
		object.removeElement(3);
		
		for (int i=0;i<object.size();i++)
		{
			assertEquals(positiveresult[i],object.array[i]);
		}
		
		for (int i=0;i<object.size();i++)
		{
			assertNotEquals(negativeresult[i],object.array[i]);
		}
		
	}
	
	
	@Test
	public void sizeTest()
	{
		int result1=6;
		int result2=8;
		
		object.addElement(4);
		object.addElement(3);
		object.addElement(5);
		object.addElement(8);
		object.addElement(6);
		object.addElement(7);
		
		
		assertEquals(result1,object.size());
		assertNotEquals(result2,object.size());
	}
	
	
}