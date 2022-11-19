
import java.util.ArrayList;
import java.util.Scanner;


public class QuadraticRoots
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        int r=(int) Math.sqrt((b*b)-4*a*c);
        int root1=(-b + r) / (2*a);
        int r1=(int) Math.sqrt((b*b)-4*a*c);
        int root2=(-b -r1) / (2*a);
        list.add(root1);
        list.add(root2);
        System.out.println(list);
    }
    
}
