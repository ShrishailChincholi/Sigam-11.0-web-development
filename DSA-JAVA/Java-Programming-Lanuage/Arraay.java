// ARRAYS – ASSIGNMENT
// Question 1: Contains Duplicate
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// Example 1:
// Input: nums = [1, 2, 3, 1]
// Output: true
// Example 2:
// Input: nums = [1, 2, 3, 4]
// Output: false
// Example 3:
// Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
// Output: true
// Constraints:
// - 1 <= nums.length <= 10⁵
// - -10⁹ <= nums[i] <= 10⁹

import java.util.HashSet;

public class Main {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        System.out.println(containsDuplicate(nums));
    }
}




// Question 2: Search in Rotated Sorted Array
// There is an integer array nums sorted in ascending order with distinct values. Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length).
// For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
// You must write an algorithm with O(log n) runtime complexity.
// Example 1:
// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4
// Example 2:
// Input: nums = [4,5,6,7,0,1,2], target = 3
// Output: -1
// Example 3:
// Input: nums = [1], target = 0
// Output: -1
// Constraints:
// - 1 <= nums.length <= 5000
// - -10⁴ <= nums[i] <= 10⁴
// - All values of nums are unique.
// - nums is an ascending array that is possibly rotated.
// - -10⁴ <= target <= 10⁴

public class Main {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println(search(nums, target));
    }
}