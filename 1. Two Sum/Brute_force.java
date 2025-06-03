class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int res[] = new int[2] ;
        for (int i = 0 ; i < nums.length ; i ++)
        {
            for(int j = 0 ; j < nums.length ; j++)
            {
                if(i == j)
                {
                    continue ;
                }
                if (nums[i] + nums[j] == target)
                {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res ; 
    }
}


/*
class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int res[] = new int[2] ;
        for (int i = 0 ; i < nums.length ; i ++)
        {
            for(int j = i+1 ; j < nums.length ; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res ; 
    }
}

*/
