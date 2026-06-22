class Solution {
    public int[] getConcatenation(int[] nums) {

        int arr_size = 2 * nums.length;
        int[] result = new int[arr_size];

        for(int i=0;i<nums.length;i++)
        {
            result[i]=nums[i];
            result[i+nums.length] = nums[i];
        }

        return result;

    }
}