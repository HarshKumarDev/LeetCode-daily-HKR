class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
        Arrays.sort(arr);
     ArrayList<Integer> hs =new ArrayList<>(); 
        int count=1;
        int i=0;
     for ( i=0;i<arr.length-1;i++)
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
        if (arr.length-1 == i)
        {
          if(hs.contains(count))
          {
              return false;
          }
            hs.add(count);
        }
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
         
             
             