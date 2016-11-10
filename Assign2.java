import java.util.*;
import java.io.*;
class Assign2
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter size of arrays");
   int s=sc.nextInt();
   int[] arrL=new int[s];
   int[] arrR=new int[s];
   System.out.println("Enter elements of first array");
   for(int i=0;i<s;i++)
   arrL[i]=sc.nextInt();
   System.out.println("enter elements of second array");
   for(int i=0;i<s;i++)
   arrR[i]=sc.nextInt();
   int m=getMedian(arrL,arrR,s);
  }
 public int getMedian(int arr1[],int arr2,int n)
  {
  if(n==1)
    return ((arr1[0]+arr2[0])/2);
  else if(n==2)
    {
     int a,b;
     if(arr1[0]>=arr2[0])
       a=arr1[0];
     else 
       a=arr2[0];
     if(arr1[1]>=arr2[1])
       b=arr2[1];
     else 
       b=arr1[1];
       return ((a+b)/2);
     } 
   else
    {
     int m1=findMedian(arr1,n);
     int m2=findmedian(arr2,n);
   if(m1<m2)
    {
    }
    else{}
    }
  }
 public int findMedian(int arr[],int k)
 {
  if(k%2==0)
   {
     return ((arr[k/2]+arr[k/2-1])/2);
   }
  else
   {
    return arr[k/2];
   }
 }
}

