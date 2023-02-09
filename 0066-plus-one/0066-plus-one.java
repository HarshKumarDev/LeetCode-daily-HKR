class Solution {
    public int[] plusOne(int[] digits) 
    {
        
         for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] <= 8){
                digits[i] = digits[i] + 1;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        int[] ans = new int[digits.length+1];
        ans[0] = 1;
        return ans;
    }
}
    //     for (int i=0;i<digits.length;i++)
    //     {
    //         int d=digits[i];
    //         int n=n*10+d;
    //     }
    //     int n=n+1;
    //     int l=digits.length;
    //     ArrayList<Integer>List=new ArrayList<>(10);
    //     for (int j=digits.length-1;j>=0;j--)
    //     {
    //         int d=n%10;
    //         List.add(d);
    //         n=n/10;
    //     }
    //     return List;
    // }