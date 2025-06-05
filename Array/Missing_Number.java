class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        for(int val:nums){
            sum-=val;
        }
        return sum;
    }
}
