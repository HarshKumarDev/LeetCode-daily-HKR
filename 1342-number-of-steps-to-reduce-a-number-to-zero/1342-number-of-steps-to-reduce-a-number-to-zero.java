class Solution {
    public int numberOfSteps(int num) 
    {
        return find(num,0);
    }
    public int find (int num, int steps)
    {
        if (num==0)
            return steps;
        if (num%2==0)
            num=num/2;
        else
            num=num-1;
        steps++;
        return find(num,steps);
    }
}