class Solution {
    public int[] searchRange(int[] nums, int target)
    {
       int[] x={-1,-1};
        int first=search(nums,target,true);
        int second=search(nums,target,false);
        x[0]=first;
        x[1]=second;
        return x;
    }
    public int search (int[] nums, int target, boolean findindex)
    {
        int start=0;
        int ans=-1;
        int end=nums.length-1;
        while (start<=end)
        {
            int mid=start +(end-start)/2;
            if (target>nums[mid])
                start=mid+1;
            else
                if (target<nums[mid])
                    end=mid-1;
            if (target==nums[mid])
            {
                ans=mid;
                if (findindex)
                    end=mid-1;
                else
                    start=mid+1;
            }
            }
        return ans;
        
}  
}