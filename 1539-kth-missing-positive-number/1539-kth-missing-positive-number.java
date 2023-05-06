class Solution {
    public int findKthPositive(int[] arr, int k) 
    {
        int num=1;
        int n=arr.length;
        int i=0;
      while (i<n && k>0)
      {
          if (arr[i] == num) //not missing (so checking with next element by increasing i)
              i++; 
          else
          if (arr[i] != num)
          {
              k--;
          }
          num++;
      }
        while (k>=0)
        {
            k--;
            num++;
        }
        return num-2;
    }
}
              