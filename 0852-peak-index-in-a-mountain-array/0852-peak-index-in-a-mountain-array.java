class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=1;
        int end=arr.length-2;
        while (start<=end)
        {
            int mid=start+(end-start);
            if (arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
             return mid;
                        
                                           if (arr[mid]>arr[mid-1])
                                               start=mid+1;
                                               if (arr[mid]>arr[mid+1])
                                               end=mid-1;
                                               }
                                               return-1;
                                           
}
        
    }