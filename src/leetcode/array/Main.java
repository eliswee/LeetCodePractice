package leetcode.array;

import java.util.Iterator;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		LC_1313_Decompress decompress = new LC_1313_Decompress();
		int [] nums = {1, 1, 2, 3};
		int[] res = decompress.decompressRLElist(nums);
		printRes(res);
	}

	
	
	@SuppressWarnings("unused")
	private static void LC_1365() {
		LC_1365_HowManay howManay = new LC_1365_HowManay();
		int[] nums = {7,7,7,7};
		int[] res = howManay.smallerNumbersThanCurrent(nums);
		printRes(res);
	}
	
	
	@SuppressWarnings("unused")
	private void LC_1486() {
		LC_1486_XOR xor = new LC_1486_XOR();
		int res = xor.xorOperation(10, 5);
		System.out.print(res);
	}
	
	@SuppressWarnings("unused")
	private void LC_1431() {
		int [] data = {2, 3, 5, 1, 3}; int ext = 3;
		LC_1431_Kids kids = new LC_1431_Kids();
		List<Boolean> res = kids.kidsWithCandies(data, ext);
 		printBooleanList(res);
	}
	
	@SuppressWarnings("unused")
	private void LC_1470() {
		int[] data = {2, 5, 1, 3, 4, 7};
		LC_1470_Shuffle lc1470 = new LC_1470_Shuffle();
		int[] res = lc1470.shuffle(data, 3);
		printRes(res);
	}
	
	@SuppressWarnings("unused")
	private void LC_1480() {
		int [] data = {1, 2, 3, 4};
		LC_1480_RunningSumOf1DArray lc1480 = new LC_1480_RunningSumOf1DArray();
		int [] res = lc1480.runningSum(data);
		printRes(res);
	}
	
	private static void printRes(int []res) {
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
		}
	}
	
	private static void printBooleanList(List<Boolean>list) {
		Iterator<Boolean> iterator = list.iterator();
		while (iterator.hasNext()) {
			Boolean boolean1 = (Boolean) iterator.next();
			System.out.print(boolean1);
			System.out.print(", ");
		}
	}
	
}
