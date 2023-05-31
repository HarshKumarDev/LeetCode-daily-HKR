class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
        Arrays.sort(arr);
     ArrayList<Integer> hs =new ArrayList<>(); 
        int count=1;
     for (int i=0;i<arr.length-1;i++)
     { 
         int n=arr[i];
         if (arr[i] == arr[i+1])
         {
             count++;
         }
         else
               {
             if (hs.contains(count))
                 return false;
             hs.add(count);
             count=1;
         }
     }
       // hs.add(count);  // last element
                if(hs.contains(count)) 
                    return false;
        else
            return true;
     }
}
        
        
//              if (hs.contains(count))
//                  return false;
//              hs.add(count);
//              count=1;
//          }
//      }
//        // hs.add(count);  // last element
//                 if(hs.contains(count)) 
//                     return false;
//         else
//             return true;
//      }
// }
         
             
             