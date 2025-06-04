class Solution {
    public boolean check(int[] nums) 
    {
        int breaks = 0 ;
        int n = nums.length ;
        for (int i = 0 ; i < n-1 ; i++)
        {
            if (nums[i] > nums[i+1])
            {
                breaks++ ;
            }
        }
        if(nums[0] < nums[n-1])
        {
            breaks ++ ;
        }
        if(breaks <= 1)
        {
            return true ;
        }
        else
        {
            return false ;
        }
    }
}
