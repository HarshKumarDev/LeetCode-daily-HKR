class Solution {
    public boolean isPalindrome(String s) 
    {
        char a=s.charAt(0);
    //    if (a ==' ')
      //      return true;
        String st="";
        String str="";
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (ch !=' ')
                st=st+ch;
        }
        st = st.replaceAll("[^a-zA-Z0-9]", "");
        for (int j=0;j<st.length();j++)
        {
            char c=st.charAt(j);
            str=c+str;
        }
          if (st.equalsIgnoreCase(str))
            return true;
        else 
            return false;
      }
}