package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class LC_1313_Decompress {
	public int[] decompressRLElist(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i+=2) {
			for (int j = 0; j < nums[i]; j++) {
				list.add(nums[i + 1]);
			}
		}
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
