package leetcode.array;

public class LC_1486_XOR {
	
public int xorOperation(int n, int start) {
		int res = start;
		for (int i = 1; i < n; i++) {
			res ^= (start + 2*i);
		}
		return res;
    }
}