package printallsubsetsofanarray;

import java.util.ArrayList;
import java.util.List;

/* 
 * Recursive solution for generating all unique subsets of an array.
 */

/* 
 * Worst case Time Complexity O(2 ^ n) where n = total number of elements
 */

/* 
 * Worst case Space Complexity O(1)
 */

/* 
 * More test cases are in PrintAllSubsetsOfAnArrayTest.java
 */

public class PrintAllSubsetsOfAnArray {

	public static void main(String[] args) {
		List<List<Integer>> finalSet = new ArrayList<List<Integer>>();
	    int[] nums = {1, 2, 3};
	    finalSet = distInteger(nums);
	    System.out.println(finalSet);
    }
	
	public static List<List<Integer>> distInteger(int[] nums) {
		List<List<Integer>> finalSet = new ArrayList<List<Integer>>();
		List<Integer> subSet = new ArrayList<Integer>();
		/*
		 * Null set
		 */
        finalSet.add(subSet);
        /* 
         * Recursively find and add subsets starting from 0th index of the array
         */
        findSubset(nums, finalSet, subSet, 0);
        return finalSet;
	}

	private static void findSubset(int[] nums,  List<List<Integer>> finalSet,  List<Integer> subSet, int index) {
		if (index != nums.length) {
			for(int j = index; j < nums.length; j++) {
				subSet.add(nums[j]);
				finalSet.add(new ArrayList<Integer>(subSet));
				findSubset(nums, finalSet, subSet, j + 1);
				subSet.remove(subSet.get(subSet.size() - 1)); // remove duplicates
			}
		}
	}
}

/* I referred online to solve the problem.
 * I felt this solution is optimal because its worst case time and space complexity is lower
 */