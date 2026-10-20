class Solution {

    public int removeElement(int[] nums, int val) {

        int j=nums.length-1; // j =4
       // 3
       // 2
    for(int i=0;i<=j;i++) {

        while( j>=i && nums[j]==val)
        j--;

        if(i>j)
        break;

        if(nums[i]!=val)
        continue;

       

        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        j--;

    }

    return j+1;


       
    }
}








// int res = 0;
//         int j = nums.length-1;
//         for(int i=0;i<nums.length;i++)
//         {
            
//             while(j>=0 && nums[j]==val ) {
//                 j--;
//             };

//             if(nums[i]==val && i<j) {

//                 int temp = nums[j];
//                 nums[j]=nums[i];
//                 nums[i]=temp;
//             }
//         }

//         return j+1;