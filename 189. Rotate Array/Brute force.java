class Solution {
    public void rotate(int[] arr, int k) 
    {
        int len = arr.length ;
        k = k % len ; 
        for (int i = 1 ; i <= k ; i++)
        {
            int last = arr[len-1] ;
            for (int j = len-1 ; j > 0 ; j-- )
            {
                arr[j] = arr[j-1];
            }
            arr[0] = last ; 
        }
        return  ;
    }
}
