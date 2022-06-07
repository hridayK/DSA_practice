import java.util.*;

class twoSum{

    public static int[] TwoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = new int[2];
        
        for(int i=0;i<nums.length;i++){
            int compliment = target - nums[i];
            if(map.containsKey(compliment)){
                arr = new int[]{map.get(compliment),i};
                break;
            }
            map.put(nums[i],i);
        }
        
        return arr;
    }
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        System.out.println("input: " + Arrays.toString(nums));
        System.out.println("target: " + target);
        System.out.println("\noutput:\n"+Arrays.toString(TwoSum(nums, target)));
    }
}