class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> unique = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();

        for(int i=0; i<= s.length()-10; i++){
            String curr = s.substring(i, i+10);
            if(unique.contains(curr)){
                repeated.add(curr);
            }else{
                unique.add(curr);
            }
        }

        List<String> ans= new ArrayList<>(); 

        for(String str:repeated){
            ans.add(str);
        }

        return ans;
    }
}