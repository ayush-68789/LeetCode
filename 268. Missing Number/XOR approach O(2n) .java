class Solution 
{
    public int missingNumber(int[] arr) 
    {
        int XOR1 = 0 ; 
        for(int i = 0 ; i <= arr.length ; i++)
        {
            XOR1 = XOR1 ^ i ; 
        }

        int XOR2 = 0 ;
        for(int i = 0 ; i < arr.length ; i++)
        {
            XOR2 = XOR2 ^ arr[i] ;
        }
        return (XOR1 ^ XOR2) ; 
    }
}
