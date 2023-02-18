class Solution {
    public int missingNumber(int[] nums) 
    {
        int i=0;
        while (i<nums.length)
        {
            int correct=nums[i];
        if (nums[i]< nums.length && nums[i] != nums[correct])
        swap(nums,i,nums[i]);
        else
        i++;
        }
        int ans=find(nums);
        return ans;
        }
    public void swap(int[] nums, int first, int second)
    {
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    public int find(int[] nums)
    {
        for (int i=0;i<nums.length;i++)
        {
            if (i !=nums[i])
                return i;
        }
        return nums.length;  //when missing no is out array;
    }
    
}