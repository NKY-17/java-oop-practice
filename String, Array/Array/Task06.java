/*
Write a program that asks the user how many numbers to take. Then takes that many numbers in an array and prints the median value. 
[How to Find the Median Value: http://www.mathsisfun.com/median.html]

Sample Input
5
10
50
40
20
30
Sample Output:
The median is 30.

Explanation: 30 falls in middle 10, 20, 30, 40, 50
Sample Input:
4
30
10
40
20
Sample Output:
The median is 25.

Explanation: (20+30)/2=25 (average of two middle values from 10, 20, 30, 40.

*/
//Code;
import java.util.Scanner;
public class task6{
public static void main(String[]args){
Scanner sc=new Scanner(System.in); 
System.out.println("Numbers to take");
  int N=sc.nextInt();
  int [] a=new int[N];
for(int i=0;i<a.length;i++){
 a[i]=sc.nextInt();
 }
for(int i=0;i<a.length-1;i++){
  for(int j=0;j<a.length-i-1;j++){
    if(a[j]>a[j+1]){
      int x=a[j];
      a[j]=a[j+1];
      a[j+1]=x;
    }
  }
  }
if(N%2==0){
  int c=(a[(N/2)-1]+a[(N/2)])/2;
  System.out.println("The median is "+c);
}
else{
  int c=(a[((int)N/2)]);
      System.out.println("The median is "+c);
}
}
}
