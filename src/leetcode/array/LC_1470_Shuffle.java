package leetcode.array;

public class LC_1470_Shuffle {
	public int[] shuffle(int[] nums, int n) {
		int [] res = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			
			if (i % 2 == 0) {
				res[i] = nums[i/2];
			}
			else {
				res[i] = nums[(i-1)/2+n];
			}
		}
        return res;
    }
}
