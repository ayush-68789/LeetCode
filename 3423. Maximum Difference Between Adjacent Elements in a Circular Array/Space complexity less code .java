class Solution {
    public int maxAdjacentDistance(int[] arr) 
    {
        int max = 0 ; 
        int n = arr.length ; 
        for (int i = 0 ; i < n ; i++ )
        { 
            max = Math.max(Math.abs(arr[i] - arr[(i+1) % n]) , max ) ;
        }
        return max ;
    }
}
