// Reverse Array
import java.util.*;
class ArrayReverse
{
  public static void main(String[] args)
   { 
Scanner sc =new Scanner(System.in);

     int arr[] = new int[5];
System.out.println("Enter array elements");
for(int i=0; i<5 ; i++)
{
  arr[i]=sc.nextInt();
}
     
     int len = arr.length;
System.out.println(len);

     for(int i=len-1; i>=0; i--)
       {
         System.out.print(" "+arr[i]);
       }
    }
}   