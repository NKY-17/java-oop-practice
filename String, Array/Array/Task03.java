/*
Write a Java program that asks the user for the length of an array and then creates an integer array of that length by taking inputs from the user. Then, reverse the original array without creating any new array and print it. [In-place reverse]

Sample Input:
Enter the length of the array: 5
7
-31
344
97
100
Sample Output:
100 97 344 -31 7
*/

//Code:
import java.util.Scanner;
public class task3{
public static void main(String[]args){
Scanner sc=new Scanner(System.in); 
System.out.println("Enter the length of the array: ");
int N=sc.nextInt();
int [] a=new int[N];
for(int i=0;i<N;i++){
 a[i]=sc.nextInt();
 }
for(int i=N-1;i>=0;i--){
System.out.print(a[i]+" ");
}
}
}
