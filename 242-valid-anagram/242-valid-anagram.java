class Solution {
    public boolean isAnagram(String s, String t) {
    
        if(s.length()!=t.length())
            return false;
        
        String s1=sortString(s);
        String s2=sortString(t);
        
        if(s1.equals(s2)){
            return true;
        }
   return false;
    }
    
    
    
    public String sortString(String str){
        int [] fArr=new int[128];
        StringBuilder sb=new StringBuilder();
        
        for(int i=0; i<str.length(); i++){
            fArr[str.charAt(i)]++;
        }
        
        for(int i=0; i<128; i++){
            sb.append(makeString((char)i, fArr[i]));
        }
        return sb.toString();
    }
    
    
    public String makeString(char ch, int freq){
        StringBuilder sb=new StringBuilder();
        while(freq-- >0){
            sb.append(ch);
        }
        return sb.toString();
    }
}