
import java.util.Scanner;


public class NuOfDigitsInFactoriallogarithm 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double fact=0;
        for(int i=1;i<=a;i++)
        {
            fact+= Math.log10(i);
        }
        int d=(int)fact+1;
        System.out.println(d);
        //TC O(N)
        //SC O(1)
    }
    
}
