class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String fir = strs[0];
        String last=strs[strs.length-1];
        for(int i=0;i<Math.min(fir.length(),last.length());i++){
               if(fir.charAt(i)!=last.charAt(i)){
                return ans.toString();
               }
               ans.append(fir.charAt(i));
        }

         return ans.toString();
    }
}
