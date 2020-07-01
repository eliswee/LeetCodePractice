package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_1313_Decompress {
	
	/* {65,44,72,15};
	 */
	
	public int[] decompressRLElist(int[] nums) {
		int size = 0; 
		
		if (nums.length == 2) {
			int [] res = new int[nums[0]];
			Arrays.fill(res, nums[1]);
			return res;
		}
		
		for (int i = 0; i < nums.length; i+=2) {
			size += nums[i];
		}
		System.out.print("size = " + size + "\n");
		int[] res = new int [size];
		int curIndex = 0;
		for (int i = 0; i < nums.length; i += 2) {
			System.out.println("i = " + i);
			Arrays.fill(res, curIndex, curIndex + nums[i], nums[i+1]);
			curIndex += nums[i];
		}
		
		return res;
	}
	
	public int[] decompressRLElist_1(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i+=2) {
			for (int j = 0; j < nums[i]; j++) {
				list.add(nums[i + 1]);
			}
		}
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
