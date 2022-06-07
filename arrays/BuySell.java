public class BuySell {

    //Brute forces solution that is not optimal for large inputs

    /* public static int maxProfit(int[] price){
        int max = 0;
        for(int i=0;i<price.length;i++){
            for(int j=i+1;j<price.length;j++){
                if(price[i]>price[j]){
                    continue;
                }else{
                    if(price[j]-price[i]>max){
                        max = price[j]-price[i];
                    }
                }
            }
        }
        return max;
    }  */  

    //optimal one

    public static int maxProfit(int prices[]){
        int left = 0, right = 1;
        int max = 0;
        while(right<prices.length){
            if(prices[right]>prices[left]){
                max=(max>(prices[right]-prices[left]))?max:(prices[right]-prices[left]);
            }else{
                left=right;
            }
            right+=1;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }    
}
