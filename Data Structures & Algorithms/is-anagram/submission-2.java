class Solution {
    public boolean isAnagram(String s, String t) {

        int[] arr= new int[26];

        if(s.length()!=t.length())
        return false;

        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }

        for(int i=0;i<t.length();i++) {
            arr[t.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
            return false;
        }

        return true;

    }
}





















    //  HashMap<Character,Integer> hm = new HashMap<>();

    //     if(s.length()!=t.length())
    //     return false;

    //     for(int i = 0;i<s.length();i++)
    //     {
    //         hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i), 0)+1);
    //     }

    //     for(int i=0;i<t.length();i++)
    //     {
    //         if(hm.containsKey(t.charAt(i))){
    //             hm.put(t.charAt(i),hm.getOrDefault(t.charAt(i),0)-1);
    //             if(hm.get(t.charAt(i)) == 0){
    //                 hm.remove(t.charAt(i));
    //             }
    //         } 
    //         else{
    //             return false;
    //         }
    //     }

    //     if(hm.size() == 0)
    //     return true;

    //     return false;