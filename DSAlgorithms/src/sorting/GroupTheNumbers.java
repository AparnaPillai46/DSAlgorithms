package sorting;

import java.util.Arrays;

public class GroupTheNumbers {

	public static void main(String[] args) {

		int[] input = { 2, 3, 4, 5, 6, 7, 8 };

		System.out.println(Arrays.toString(groupNumbers(input)));

	}

	/*
	 * Complete the function below.
	 */
	static int[] groupNumbers(int[] nums) {
		for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
			while (i < nums.length && nums[i] % 2 == 0) {
				i++;
			}
			while (j >= 0 && nums[j] % 2 != 0) {
				j--;
			}
			if (i < j) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		return nums;

	}

}
