/*
Write a Java program that will take an integer number N from the user and create an integer array by taking N numbers from the user. Then take another number from the user and create a new array by removing that number from the input array. Finally, print the new array.

Sample Input:
N = 5
23
100
0
56
-34
Remove Element = 100
Sample Output:
Input array: 
23 100 0 56 -34
New array:
23 0 56 -34
Sample Input:
N = 4
-5
10
2
-7
Remove Element = 43
Sample Output:
Input array: 
-5 10 2 -7
Element not found

*/
//Code:
import java.util.Scanner;
public class task1{
public static void main(String[]args){
Scanner sc=new Scanner(System.in); 
int N=sc.nextInt();
int [] a=new int[N];
for(int i=0;i<N;i++){
 a[i]=sc.nextInt();
 }
System.out.println("Enter the element which needs to be removed");
int r=sc.nextInt();
for(int i=0;i<N;i++){
  if(a[i]==r){
    continue;
  }
System.out.print(a[i]+" ");
}
}
}
