class Solution {

    public int removeElement(int[] nums, int val) {
        int res = 0;
        int j = nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            
            while(j>=0 && nums[j]==val ) {
                j--;
            };

            if(j==-1)
            break;

            if(nums[i]==val && i<j) {

                int temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }

        return j+1;
    }
}