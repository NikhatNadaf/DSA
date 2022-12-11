/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author Admin
 */
public class maximumOccuredInteger 
{
    public static int maxOccured(int L[], int R[], int n)
    {
        int[] freq=new int[1000001];
        for(int i=0;i<n;i++)
        {
            freq[L[i]]++;
            freq[R[i]+1]--;
        }
        int res=0;
        for(int i=1;i<100000;i++)
        {
            freq[i]=freq[i-1]+freq[i];
            if(freq[i]>freq[res])
            {
                res=i;
            }
        }
        return res;
        
        
        
    }
    //TC:O(N+MAXX)
    //SP:O(MAXX)
    public static void main(String[] args) {
        int[] left={1,5,9,13,21};
        int[] right={15,8,12,20,30};
        System.out.println(maxOccured(left, right,5));
        
    }
}