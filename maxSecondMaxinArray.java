/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class maxSecondMaxinArray 
{
    //should return maximum and second maximum element from the array 
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        int max=Integer.MIN_VALUE;
        int sMax=Integer.MIN_VALUE;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<sizeOfArray;i++)
        {
            if(arr[i]>max)
            {
                sMax=max;
                max=arr[i];
            }
            else if((arr[i]>sMax) && (arr[i]<max))
            {
                sMax=arr[i];
            }
        }
        if(sMax==Integer.MIN_VALUE)
        {
            sMax=-1; //If no second max exists, then the second max will be -1
        }
        ans.add(max);
        ans.add(sMax);
        return ans;
    }
    public static void main(String[] args) 
    {
        int[] a={10,10,10,10,10};
        int n=a.length;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        ans=largestAndSecondLargest(n,a);
        //TC:O(N)
        System.out.println(ans);
        
        
    }
}
       
    

