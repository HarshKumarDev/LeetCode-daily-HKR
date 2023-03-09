class Solution {
    public boolean rotateString(String s, String goal)
    {
       int l=s.length();
                int i=0;
                while (i<l)
                {
                    String str=" ";
                    char ch=s.charAt(0);
                    String st=" ";
                    st=s.substring(1,l);
                    str=st+ch;
                    s=str;
                    i++;
                    //System.out.println(str);
                    if (str.equalsIgnoreCase(goal))
                        return true;
                }
                return false;
    }
}