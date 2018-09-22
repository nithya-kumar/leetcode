package majorityelement;

public class MajorityElement {
	public int majorityElement(int[] nums) {
        int count = 0;
        int majorityEle = 0;
        for (int n : nums) {
            if (count == 0) {
                majorityEle = n;
            } 
            if (n != majorityEle) {
                count --;
            } else {
                count ++;
            }            
        }
        return majorityEle;
    }
}
