package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class LC_1431_Kids {
	
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> list = new ArrayList<>();
		if (candies.length == 0) {
			return null;
		}
		int max = candies[0];
		
		for (int i = 0; i < candies.length; i++) {
			if (max < candies[i]) {
				max = candies[i];
			}
		}
		
		for (int i = 0; i < candies.length; i++) {
			if ((candies[i] + extraCandies) < max) {
				list.add(false);
			}else {
				list.add(true);
			}
		}
        return list;
    }
}
