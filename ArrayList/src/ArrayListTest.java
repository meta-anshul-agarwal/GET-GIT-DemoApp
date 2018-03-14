import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayListTest {

	ArrayList arrayList;
	@Before
	public void setUp() {
		arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add(5);
		arrayList.add(3);
		arrayList.add(7);
	}
	
	@Test
	public void addElementTest() {
		int[] expected = new int[] {1,5,3,7,2};
		int[] actual = arrayList.add(2);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void addElementAtPositionTest() {
		int[] expected = new int[] {1,5,3,6,7};
		int[] actual = arrayList.add(6 , 4);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void getElementByIndexTest() {
		int expected = 1;
		int actual = arrayList.getElementByIndex(1);
		assertEquals(expected, actual);
	}
	
	@Test
	public void getIndexByElementTest() {
		int expected = 2;
		int actual = arrayList.getIndexByElement(5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void deleteByIndexTest() {
		int[] expected = new int[] {1,5,7};
		int[] actual = arrayList.deleteByIndex(3);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void deleteByElementTest() {
		int[] expected = new int[] {1,3,7};
		int[] actual = arrayList.deleteByElement(5);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void clearAllTest() {
		int[] expected = new int[] {};
		int[] actual = arrayList.clearAll();
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void reverseTest() {
		int[] expected = new int[] {7,3,5,1};
		int[] actual = arrayList.reverse();
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void sortTest() {
		int[] expected = new int[] {1,3,5,7};
		int[] actual = arrayList.sort();
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void mergeTest() {
		int[] expected = new int[] {1,5,3,7,8,9,6};
		ArrayList newArrayList = new ArrayList();
		newArrayList.add(8);
		newArrayList.add(9);
		newArrayList.add(6);
		int[] actual = arrayList.merge(newArrayList);
		assertArrayEquals(expected, actual);
	}
}
