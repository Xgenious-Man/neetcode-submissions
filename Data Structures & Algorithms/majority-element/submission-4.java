class Solution {
    public int majorityElement(int[] nums) {
    //    int result =-1;
    //    HashMap<Integer,Integer> hm = new HashMap<>();
    //    int len =  nums.length;
    //    for(int i=0; i<len;i++) {
    //       hm.put(nums[i],hm.getOrDefault(nums[i], 0)+1);
    //        if(hm.get(nums[i])>len/2)
    //        {
    //             result = nums[i];
    //             break;
    //        } 
    //    }
    //    return result;

    int result;
    int count = 0;
    int candidate = 0;

// this is called Boyer-Moore Voting Algorithm.

// Imagine every occurrence of the majority element cancels out one occurrence of a different element.

// Since the majority appears more than n/2 times, it can never be completely canceled.

     for(int i=0; i<nums.length;i++) {
        if(count == 0) {
            candidate = nums[i];
            
        }
        if(nums[i] == candidate) {
            count++;
        }
        else {
            count--;
         }
        
        }
        return candidate;
     }
    }
