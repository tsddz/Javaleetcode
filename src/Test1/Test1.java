package Test1;

import java.util.*;

public class Test1 {
    public static void main(String[] args)
    {
        var S=new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] k=S.twoSum(nums,target);
        for (int element:k){
            System.out.println(element);
        }
    }

}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}


