package com.rameshify.solutions.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> itemIndexMap = new HashMap<>();
    for (int idx = 0; idx < nums.length; idx++) {
      if (itemIndexMap.containsKey(target - nums[idx])) {
        return new int[]{itemIndexMap.get(target - nums[idx]), idx};
      }
      itemIndexMap.put(nums[idx], idx);
    }
    return new int[0];
  }

  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    System.out.println(Arrays.toString(new TwoSum().twoSum(nums, 9)));
  }
}
