package leetcode.array;

public class LC_1480_RunningSumOf1DArray {
	public int[] runningSum(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] += nums[i-1];
		}
		return nums;
	}
}
