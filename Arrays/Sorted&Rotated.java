class Solution {
    public int maxProfit(int[] prices) {
        int bp = Integer.MAX_VALUE;
        int mp = 0;
        for(int i=0; i<prices.length; i++){
            //check the minimum bp by comparing it to current price
            if(bp<prices[i]){
                int profit = prices[i] - bp;
                //to store the maximum profit
                mp = Math.max(mp,profit);
            }
            else{
                //here we update the bp , if currprice <<< than bp , then this
                bp = prices[i];
            }
        }
        return mp;
    }
}
