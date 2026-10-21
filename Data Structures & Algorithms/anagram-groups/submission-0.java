class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

    HashMap<String,List<String>> hm = new HashMap<>();

    for(int i =0;i<strs.length;i++) {

        String s = strs[i];

        char [] arr = s.toCharArray();
        Arrays.sort(arr);

        String s1 = new String(arr);

        List<String> temp = new ArrayList<>();

        
        if(hm.containsKey(s1))
        {
            List<String> ls = hm.get(s1);
            ls.add(strs[i]);

            hm.put(s1,ls);
        }
        else
        {
            List<String> ls = new ArrayList<>();
            ls.add(strs[i]);
            hm.put(s1,ls);
        }

       
    }

    List<List<String>> result = new ArrayList<>(hm.values());

    return result;


    

        
   
    }
}
