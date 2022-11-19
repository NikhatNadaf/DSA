
import java.util.Scanner;


public class digitsInFactorial 
{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        long fact=1;
        for(int i=1;i<=a;i++)
        {
            fact *=i;
        } //TC O(n)
        System.out.println("factorial of "+a+" is "+fact);
        long digits=0;
        while(fact!=0)
        {
            digits+=1;
            fact/=10;
        }// TC O(nuOfDigits)
        System.out.println("Digits: "+digits);
    }
    
}
