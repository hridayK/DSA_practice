class maximumSubArray{

	//aka kadane's algorithm
	public static int maxSubArray(int[] nums) {
		int sum = 0;
		if(nums.length==1){
			return nums[0];
		}
		int max  = Integer.MIN_VALUE;

		for(int i=0;i<nums.length;i++){
            if(sum<0)
            	sum=0;
            sum += nums[i];
            max = sum>max?sum:max;
        }
		return max;
    }

	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[]{2,1,-3,4,-1,2,1,-5,4}));
	}
}