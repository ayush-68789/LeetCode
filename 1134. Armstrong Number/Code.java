import java.util.Scanner ;
class Main 
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in) ;
        int num = sc.nextInt() ;
        int sum = 0 ; 
        int count = 0 ;
        int temp1 = num ;
        int temp2 = num ; 
        while(num > 0 )
        {
            num = num / 10 ;
            count ++ ;
        }
        
        
        while(temp1 > 0)
        {
            int rem = temp1 % 10 ; 
            sum += Math.pow(rem,count);
            temp1 = temp1 / 10 ;
        }
        
        if (temp2 == sum)
        {
            System.out.printf("Armstrong number : %d",sum);
        }
        else
        {
            System.out.print("NOT Armstrong");
        }
    }
}
