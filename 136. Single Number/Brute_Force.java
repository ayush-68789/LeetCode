# T.C. - O(N2) 
  
class Solution {
    public int singleNumber(int[] nums) 
    {
        int num = 0 ; 
        int result  = 0 ;
        for ( int i = 0 ; i < nums.length ; i++)
        {
            num = nums[i] ;
            int count = 0 ;
            for(int j = 0 ;j < nums.length ; j++)
            {
                if(nums[j] == num )
                {
                    count++ ;
                }
            }
            if (count == 1)
            {
                result = num ;
            }
        }   
        return result ;
    }
}

