/*
 Write a Java program that asks the user the length of an array (N) then takes N number of integers as elements for the array as input. First, remove the consecutive duplicate elements from the original array to form a new array. Then print the number of elements removed from the original array. 

Sample Input:
N = 8
Please enter the elements of the array:
5
2
1
1
2
3
3
3
Sample Output:
New Array : 5 2 1 2 3
Removed elements : 3 
*/

//Code:
import java.util.Scanner;
public class task5{
  public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int c=0;
int d=0;
System.out.println("N: ");
int N=sc.nextInt();
int a[]=new int[N];
for(int i=0;i<a.length;i++){
  a[i]=sc.nextInt();
}
for(int i=0;i<N;i++){
  if(a[i]==a[i+1]){
    c++;
    for(int j=i+1;j<N-1;j++){
      a[j]=a[j+1];
    }
    N--;
    }
}
System.out.println("new array");
for(int i=0;i<a.length;i++){
  if(a[i]==a[i+1]){
    d++;
    if(d==1){
      System.out.print(a[i]);
    break;
  }
  }
System.out.print(a[i]+" ");
}
System.out.println();
System.out.println("Removed: "+c);
  }
}
