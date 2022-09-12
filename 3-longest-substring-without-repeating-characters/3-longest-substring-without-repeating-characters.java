class Solution {
    public int lengthOfLongestSubstring(String s) {
        
     HashMap<Character, Integer> map = new HashMap<>();
        int curr =0, max =0,prev=0;
        char ch;
        
        for(int i=0; i < s.length(); i++)
        {
            ch = s.charAt(i);
            
            if(map.containsKey(ch) && map.get(ch) >= curr)
                curr = map.get(ch) +1;
            
            prev = i - curr + 1;
            
            map.put(ch , i);
            
            max = Math.max(prev , max);
        }
        return max;
    }
}