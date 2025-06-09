class Solution 
{
    public int missingNumber(int[] arr) 
    {
        int len = arr.length ;
        int sum_actual = len * (len + 1 ) / 2 ;
        int sum_given = 0 ;
        for(int i = 0 ; i < len ; i++)
        {
            sum_given += arr[i] ; 
        } 

        return (sum_actual-sum_given) ;
    }
}
