class Solution {
    public int[] sortArray(int[] nums) {

        int len = nums.length;
        for(int i=len-1;i>=0;i--)
        {
            for(int j=len-1;j>0;j--) {

                if(nums[j]<nums[j-1])
                {
                    int temp = nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }

            }
        }
        
        
        // for(int i=0;i<nums.length;i++) {
        //     for(int j=0;j<nums.length-i;j++) {
        //         if(nums[j+1]<nums[j])
        //         {
        //             int temp = nums[j+1];
        //             nums[j+1]=nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        // }

        return nums;
        
    }
}

// 10 9 1 1 1 2  3 1 
// 9 1 1 1 1 2 3 1 10 