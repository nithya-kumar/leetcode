package sortedsearch;
import java.io.*;
import java.util.*;
public class Solution {
public static void main(String args[] ) throws Exception {
    /*Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int elements[] = new int[length];
    for (int i = 0; i < length; i ++) {
        elements[i] = sc.nextInt();
    }
    int target = sc.nextInt();*/
	int elements[] = {1,2,3,4,5};
	int target = 4;
	System.out.println(sorted_search(elements, target));
    int answer = sorted_search(elements, target);
    if (target == answer) {
        System.out.println("CORRECT");
    } else {
        System.out.println(elements.length);
        for (int i = 0; i < elements.length; i ++) {
            System.out.print(elements[i] + " ");            
        }
        System.out.println("");
        System.out.println(target);
    }
}

public static int sorted_search(int[] elements, int target) {
    if(elements == null || elements.length <= 0) return -1;
    
    int left = 0, right = elements.length -1;
    while (left < right) {
        int middle = (left + right + 1)/2;
        if (elements[middle] > target) {
            right = middle -1;
        } else {
            left = middle +1;
        }
    }
    if (elements[right] == target) return right;
    return -1;
}
}