class Solution {
    public boolean hasDuplicate(int[] nums) {

        boolean result = false;

        HashMap<Integer,Integer> hm = new HashMap();

        for(int i = 0;i< nums.length;i++) {

            if(hm.containsKey(nums[i]))
            result = true;
            else {
                hm.put(nums[i],5);
            }

        };

        return result;




        
    }
}