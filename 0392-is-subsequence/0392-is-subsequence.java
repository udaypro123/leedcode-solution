class Solution {
    public boolean isSubsequence(String s, String t) {

    int i=0;
    int j=0;

    while(i < s.length() && j< t.length()){
        char ch= s.charAt(i);
        char ch1= t.charAt(j);
        if(ch == ch1){
            i++;
        }
        j++;
    }

    return i== s.length();
        
    }
}