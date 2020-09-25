package leetcode.array;

import java.util.ArrayList;

public class LC_1389_CreateTarget {
	
	public int[] createTargetArray(int[] nums, int[] index) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < index.length; i++) {
			list.add(index[i], nums[i]);
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
	
	public int[] createTargetArray_1(int[] nums, int[] index) {
		int [] res = null;
		for (int i = 0; i < index.length; i++) {
			
			int [] temp = null;
			if (res == null) {
				res = new int[1];
				res[0] = nums[0];
				continue;
			}else {
				temp = new int [res.length + 1];
			}
			
			for (int j = 0; j < index[i]; j++) {
				temp[j] = res[j];
			}
			
			temp[index[i]] = nums[i];
			
			if (res.length > index[i]) {
				for (int j = index[i] + 1; j < res.length + 1; j++) {
					temp[j] = res[j-1];
				}
			}
			res = temp;
		}
		return res;
    }
}
