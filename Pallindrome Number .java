
class Solution {
    public boolean isPalindrome(int x) 
    {
        int rev = 0 ;
        int temp = x ;
        while (x>0)
        {
            int sum = x % 10 ;
            rev = rev * 10 + sum ;
            x = x /10 ;
        }
        if (rev == temp)
        {
            return true ;
        }
        else 
        {
            return false ; 
        }
    }
}
