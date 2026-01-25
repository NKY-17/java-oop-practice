/*
Write a Java program that will take an integer number N from the user and create an integer array by taking N numbers from the user. Print how many times each number appears in the array. 
Sample Input:
N = 5
6
15
14
15
6
Sample Output:
6 - 2 times
15 - 2 times
14 - 1 times
Sample Input:
N = 6
-5
10
14
10
-7
10
Sample Output:
-5 - 1 times
10 - 3 times
14 - 1 times
-7 - 1 times
*/
//code:

 import java.util.Scanner;
public class task4{
  public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int c=0;
System.out.println("N= ");
int N=sc.nextInt();
int a[]=new int[N];
for(int i=0;i<a.length;i++){
  a[i]=sc.nextInt();
}
for(int i=0;i<N;i++){
    for(int j=0;j<N;j++){
      if(a[j]==a[i]){
        c++;
      }
    }
System.out.println(a[i]+" - "+c+" times");
c=0;
}
   }
}
