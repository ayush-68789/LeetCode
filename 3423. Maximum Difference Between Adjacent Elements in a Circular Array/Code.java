class Solution {
    public int maxAdjacentDistance(int[] arr) 
    {
        int max = 0 ; 
        int n = arr.length ; 
        for (int i = 0 ; i < n ; i++ )
        {
            int diff = 0 ; 
            diff = Math.abs(arr[i] - arr[(i+1) % n]) ;
            max = Math.max(diff,max) ;
        }

        return max ;
    }
}
