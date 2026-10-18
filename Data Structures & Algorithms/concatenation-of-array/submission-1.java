class Solution {
    public int[] getConcatenation(int[] nums) {

        int length = nums.length;
        int arr[] = new int[2*length];
        // [1,4,1,2] ->
        // length = 4;
        for(int i=0;i<2*length;i++)
        {
            arr[i]=nums[i%length];
        }
        return arr;

    }
}

