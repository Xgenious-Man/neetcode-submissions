class Solution {
    public int subarraySum(int[] nums, int k) {

        int result = 0;
        HashMap<Integer,Integer> hm = new HashMap();
        hm.put(0,1);

        int prefix_sum = 0;
        
        for(int i=0;i<nums.length;i++) {

            prefix_sum=prefix_sum+nums[i];

            if(hm.containsKey(prefix_sum-k))
            {
                result = result+hm.get(prefix_sum-k);
            }
           
            hm.put(prefix_sum,hm.getOrDefault(prefix_sum,0)+1);   
        };
        
        return result;

        // int result = 0;
        // for(int i=0;i<nums.length;i++) {
        //      int sum = nums[i];
        //     if(sum == k)
        //     result++;
        //     for(int j=i+1;j<nums.length;j++) {
        //         sum = sum+nums[j];
        //         if(sum==k)
        //         result++;
        //     }
        // }

        // return result;
    }
}