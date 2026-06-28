class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int res[] = new int[2];
        hm.put(nums[0],0);
        for(int i=1;i<nums.length;i++)
        {
            int temp = target-nums[i];

            if(hm.containsKey(temp))
            {
                res[0]=hm.get(temp);
                res[1]=i;
            }
            else {
                hm.put(nums[i],i);
            }


        };
        return res;

        // int res[] = new int[2];
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]+nums[j] == target)
        //         {
        //             res[0]=i;
        //             res[1] =j;
        //         }
        //     }
        // }

        // return res;
        
    }
}
