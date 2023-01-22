class Solution {
    int c=0;
    public int findNumbers(int[] nums) 
    {
        int result=find(nums);
        System.out.println(result+ " is the count of numbers with even no of digits");
       return result;
    }
    public int find(int[] nums)
    {
        for (int i=0;i<nums.length;i++)
        {
            int n=nums[i];
     int ans=check(n);
        if (ans==1)
            c++;
        }
        return c;
            
    }
    public int check(int n)
    {
            int count=0;
            while (n>0)
            {
                int d=n%10;
                count++;
                n=n/10;
            }
            if (count%2==0)
                return 1;
                else
                    return 0;
                
        }
    }