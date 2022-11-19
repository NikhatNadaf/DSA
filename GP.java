
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
class Solution
{
    
    public double termOfGP(int A,int B,int N)
    {
        double r=((double)B)/A; 
        System.out.println("r"+ r);
        double p=Math.pow(r,N-1);
        double gp=A *p ;
        return Math.floor(gp);
        //Your code here
    }

}
public class GP 
{
    public static void main(String[] args) 
    {
         Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Solution s=new Solution();
        System.out.println(s.termOfGP(a,b,c));
        
    }
    
}
