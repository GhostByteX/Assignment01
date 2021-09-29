import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayClassTest {

	private ArrayClass object;
	@Before
	public void initialize() { object= new ArrayClass(); }
	
	
	
	@Test
	public void insertionTest() {
		
		int [] positiveresult= {67,34,23,89,22,34};
		
		int [] negativeresult= {56,23,112,9,2,4};
		
		
		ArrayClass.insert(67, 0);
		ArrayClass.insert(34, 1);
		ArrayClass.insert(23, 2);
		ArrayClass.insert(89, 3);
		ArrayClass.insert(22, 4);
		ArrayClass.insert(34, 5);
		
		
		for (int i=0;i<object.size;i++)
		{
			assertEquals(positiveresult[i],ArrayClass.array[i]);
		}
		
		for (int i=0;i<object.size;i++)
		{
			assertNotEquals(negativeresult[i],ArrayClass.array[i]);
		}
		
		
	}
	//	
	@Test
	public void deletionTest() {
		
		int [] positiveresult= {67,34,22,34};
		
		int [] negativeresult= {56,23,112,9,2,4};
		
		
		ArrayClass.delete(2);
		ArrayClass.delete(3);
		
		
		for (int i=0;i<object.size;i++)
		{
			assertEquals(positiveresult[i],ArrayClass.array[i]);
		}
		
		for (int i=0;i<object.size;i++)
		{
			assertNotEquals(negativeresult[i],ArrayClass.array[i]);
		}
		
		
	}	

	
	
	@Test
	public void linearSearchTest1()
	{
		int valueToCheck=3;
		
		ArrayClass.insert(2,0);
		ArrayClass.insert(4,1);
		ArrayClass.insert(3,2);
		ArrayClass.insert(12,3);
		ArrayClass.insert(5,4);
		
		assertTrue(ArrayClass.linearSearch(valueToCheck));
	}
		
	@Test
	public void linearSearchTest2()
	{
		int valueToCheck=3;
		
		ArrayClass.insert(2,0);
		ArrayClass.insert(4,1);
		ArrayClass.insert(33,2);
		ArrayClass.insert(12,3);
		ArrayClass.insert(5,4);
		
		assertFalse(ArrayClass.linearSearch(valueToCheck));
	}
		
	
	
	@Test
	public void binarySearchTest1()
	{
		int valueToCheck=3;
		int Max=12;
		int Min=2;
		
		
		ArrayClass.insert(2,0);
		ArrayClass.insert(4,1);
		ArrayClass.insert(3,2);
		ArrayClass.insert(12,3);
		ArrayClass.insert(5,4);
		
		ArrayClass.binarySearch(valueToCheck, Max, Min);
		
		assertTrue(ArrayClass.linearSearch(valueToCheck));
	}
		
	@Test
	public void binarySearchTest2()
	{
		int valueToCheck=33;
		int Max=12;
		int Min=2;
		
		
		ArrayClass.insert(2,0);
		ArrayClass.insert(4,1);
		ArrayClass.insert(3,2);
		ArrayClass.insert(12,3);
		ArrayClass.insert(5,4);
		
		ArrayClass.binarySearch(valueToCheck, Max, Min);
		
		assertFalse(ArrayClass.linearSearch(valueToCheck));
	}
	
	@Test
	public void bubbleSortTest1()
	{
		int [] result= {2,3,4,5,12};
		
		
		ArrayClass.insert(2,0);
		ArrayClass.insert(4,1);
		ArrayClass.insert(3,2);
		ArrayClass.insert(12,3);
		ArrayClass.insert(5,4);
		
		ArrayClass.bubbleSort();
		
		for (int i=0;i<object.size;i++)
		{
			assertEquals(result[i],ArrayClass.array[i]);
		}
	}	
	
	@Test
	public void bubbleSortTest2()
	{
		int [] result= {4,12,5,2,3};
		
		
		ArrayClass.insert(2,0);
		ArrayClass.insert(4,1);
		ArrayClass.insert(3,2);
		ArrayClass.insert(12,3);
		ArrayClass.insert(5,4);
		
		ArrayClass.bubbleSort();
		
		for (int i=0;i<object.size;i++)
		{
			assertNotEquals(result[i],ArrayClass.array[i]);
		}
	}	
	
	
	
}
