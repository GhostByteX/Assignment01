import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({ ArrayClassTest.class, ArrayListClassTest.class, CircularLinkedListTest.class,
		DoublyLinkedListTest.class, LinkedListTest.class, QueueArrayTest.class, QueueListTest.class,
		StackArrayClassTest.class, StackLinkedListTest.class, TestSuite.class })
public class AllTests {

}
