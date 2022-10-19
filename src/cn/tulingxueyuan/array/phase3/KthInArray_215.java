package cn.tulingxueyuan.array.phase3;

import java.util.Arrays;

/**
 * @author ：Mark老师
 * @description ：(LeetCode-215) 数组中的第K个最大元素
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，
 * 而不是第 k 个不同的元素。
 */
public class KthInArray_215 {

    /*数组排序后，直接返回第 k 个元素*/
    public int findKthLargest(int[] nums, int k) {
        final int N = nums.length;
        Arrays.sort(nums);
        return nums[N - k];
    }
}
