class Solution 
{
    public int missingNumber(int[] arr) 
    {
        int XOR1 = 0 ;
        int XOR2 = 0 ;
        for(int i = 0 ; i < arr.length ; i++)
        {
            XOR1 = XOR1 ^ i ;
            XOR2 = XOR2 ^ arr[i] ;
        }
        XOR1 = XOR1 ^ (arr.length) ;
        return (XOR1 ^ XOR2) ; 
    }
}
