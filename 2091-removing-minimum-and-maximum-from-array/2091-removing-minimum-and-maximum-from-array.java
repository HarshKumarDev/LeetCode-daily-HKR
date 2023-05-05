class Solution {
    public int minimumDeletions(int[] nums) 
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int a=0;
        int b=0;
     for (int i=0;i<nums.length;i++)
     {
         if (nums[i]<min)
         {
             min=nums[i];
             a=i;
         }
         if (nums[i]>max)
         {
             max=nums[i];
             b=i;
         }
     }
        int left=Math.min(a,b);
        int right=Math.max(a,b);
        
        int del1=right+1;
        int del2=nums.length-left;
        int del3=left+1+(nums.length-right);
        int ans=Math.min(del1,Math.min(del2,del3));
        return ans;
        
    }
}