package printallsubsetsofanarray;

import static org.junit.Assert.*;

import printallsubsetsofanarray.PrintAllSubsetsOfAnArray;

import org.junit.Test;

public class PrintAllSubsetsOfAnArrayTest {

	@Test
	public void test1() {
		int[] nums = {1, 2, 3};
		assertEquals(PrintAllSubsetsOfAnArray.distInteger(nums).toString(), "[[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]");
	}
	
	@Test
	public void test2() {
		int[] nums = {8, 6, 7, 2};
		assertEquals(PrintAllSubsetsOfAnArray.distInteger(nums).toString(), "[[], [8], [8, 6], [8, 6, 7], [8, 6, 7, 2], [8, 6, 2], [8, 7], [8, 7, 2], [8, 2], [6], [6, 7], [6, 7, 2], [6, 2], [7], [7, 2], [2]]");
	}
	
	@Test
	public void test3() {
		int[] nums = {};
		assertEquals(PrintAllSubsetsOfAnArray.distInteger(nums).toString(), "[[]]");
	}
	
	@Test
	public void test4() {
		int[] nums = {1};
		assertEquals(PrintAllSubsetsOfAnArray.distInteger(nums).toString(), "[[], [1]]");
	}
}
