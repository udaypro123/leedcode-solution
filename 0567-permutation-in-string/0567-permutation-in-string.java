class Solution {
    public boolean checkInclusion(String s1, String s2) {

            int n=s1.length();
            int m=s2.length();

            int [] countFreq1 = new int[26];
            int [] countFreq2 = new int[26];

            if(n > m) return false;

            for(int i=0; i<n; i++){
                countFreq1[s1.charAt(i)-'a']++;
                countFreq2[s2.charAt(i)-'a']++;
            }


            for(int i=n; i<m; i++){
                if(Arrays.equals(countFreq1, countFreq2)) return true;

                countFreq2[s2.charAt(i)-'a']++;
                countFreq2[s2.charAt(i-n)-'a']--;
            }

            return (Arrays.equals(countFreq1, countFreq2));
    }
}