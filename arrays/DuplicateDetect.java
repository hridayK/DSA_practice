import java.util.*;

class DuplicateDetect{

	public static boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				return true;
			}
			map.put(nums[i],i);
		}
    	return false;
    }

	public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[]{1,2,3,1}));
	}
}