/*
Write a program that reads 5 numbers into an array and prints the smallest and largest number and their location in the array.

Sample Input:
7
13
2
10
6
Sample Output:
The largest number 13 was found at location 1.
The smallest number 2 was found at location 2.
Sample Input:
2
4
-5
12
3
Sample Output:
The largest number 12 was found at location 3.
The smallest number -5 was found at location 2.
*/

//Code:
import java.util.Scanner;
public class task2{
public static void main(String[]args){
Scanner sc=new Scanner(System.in); 
int [] a=new int[5];
for(int i=0;i<5;i++){
 a[i]=sc.nextInt();
 }
int min=a[0];
int max=0;
int minindex=0;
int maxindex=0;
for(int i=0;i<a.length;i++){
   if(a[i]>max){
    max=a[i];
    maxindex=i;
  }
   else if(a[i]<min){
     min=a[i];
     minindex=i;
   }
}
System.out.println("The largest number "+max+" was found at "+maxindex);
System.out.println("The smallest number "+min+" was found at "+minindex);
}
}
