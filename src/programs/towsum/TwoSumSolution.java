package programs.towsum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {
    public static void main(String[] args) {
        int nums[] = {2,7,8,9};
        twoSum(nums,9);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(target-nums[i])!=null){
                result[0]=map.get(target-nums[i]);
                result[1]=i;
                break;
            } else{
                map.put(nums[i],i);
            }
        }
        return result;
    }
}
