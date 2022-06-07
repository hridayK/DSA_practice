import java.util.*;

class productOfArrayExceptSelf{

	/*
	Brute Forced Solution:

	public static int product(int index, int arr[]){
		int product = 1;
		for(int i=0;i<arr.length;i++){
			if(i==index)
				continue;
			product*=arr[i];
		}
		return product;
	}

	public static int[] productExceptSelf(int[] nums) {
		int resultant[] = new int[nums.length];

		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i=0;i<nums.length;i++){
			//resultant[i] = product(i,nums);
			if(map.containsKey(nums[i]))
				resultant[i] = map.get(nums[i]);
			else{
				resultant[i] = product(i,nums);
				map.put(nums[i],resultant[i]);
			}
		}
    	return resultant;
    }
	*/

	//optimal attempt
	/*
	optimal but complex for third person to read
	static int containsZero(int arr[]){
		int product=1;
		int count=0;
		for(int x:arr)
			if(x==0)
				count++;

		if(count==1){
			for(int x:arr){
				if(x!=0){
				    product*=x;
                }
			}
		}else if(count>1){
			product=0;
		}else if(count==0){
            product=-1;
        }
		return product;
	}

	public static int[] productExceptSelf(int[] nums) {
		int flag = containsZero(nums);
        int resultant[] = new int[nums.length];
        
		if(flag==-1){
			int netProduct = 1;
	    	for(int i=0;i<nums.length;i++){
	    		netProduct*=nums[i];
	    	}
	    	for(int i=0;i<nums.length;i++){
	    		resultant[i]=netProduct/nums[i];
	    	}
		}else if(flag==0){
			for(int i=0;i<nums.length;i++)
				resultant[i]=0;
		}else{
			for (int i=0; i<nums.length; i++) {
				if(nums[i]==0)
					resultant[i]=flag;
				else
					resultant[i]=0;
			}
		}
    	return resultant;
    }
	*/


	// simpler and optimal solution

	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int result[] = new int[n];

		// for(int i=0;i<n;i++){
		// 	result[i]=1;
		// }

		int prefix=1;
		for(int i=0;i<n;i++){
			result[i] = prefix;
			prefix*=nums[i];
		}

		int postfix=1;
		for(int i=n-1;i>=0;i--){
			result[i] *= postfix;
			postfix *= nums[i];
		}

		return result;
	}


	public static void main(String[] args) {
		System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
	}
}