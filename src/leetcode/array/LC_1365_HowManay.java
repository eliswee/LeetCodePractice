package leetcode.array;

public class LC_1365_HowManay {
	
	public int[] smallerNumbersThanCurrent(int[] nums) {
		
	/*
	 * 2 <= nums.length <= 500
	 * 0 <= nums[i] <= 100
	 * need Review
	 * */
		
		int [] bucket = new int [101]; 
		int [] res = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			bucket[nums[i]]++;
		}
		
		for (int i = 1; i < bucket.length; i++) {
			bucket[i] += bucket[i-1];
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				res[i] = 0;
			}else {
				res[i] = bucket[nums[i] - 1];
			}
		}
		
		return res;
	}
	
	
	public int[] smallerNumbersThanCurrent_1(int[] nums) {
		int[] res = new int[nums.length];
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] < nums[i]) {
					temp++;
				}
			}
			res[i] = temp;
			temp = 0;
		}
        return res;
    }
}
