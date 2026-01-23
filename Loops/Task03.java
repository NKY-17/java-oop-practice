/*
Write a java program that takes 10 inputs from the user in a loop, and displays the sum, average, minimum and maximum of those numbers.

Sample Input:
1 
4 
2 
9 
2 
-4 
3 
-1 
0 
1
Sample Output:
Sum = 17
Minimum = -4
Maximum = 9
Average = 1.7
Sample Input:
23 
2 
-4 
0 
8 
12 
34 
-11 
53 
21
Sample Output:
Sum = 138
Minimum = -11
Maximum = 53
Average = 13.8
*/
Code:
import java.util.Scanner;
public class task1{
  public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int sum=0;
   double avg=0;
  int min=0;
  int max=0;
  for(int i=0;i<10;i++){
    int x=sc.nextInt();
    if(x<min){
      min=x;
    }
    else if(x>max){
      max=x;
    }
    sum+=x;
  }
 System.out.println("Sum= "+sum);
  avg=sum/10.0;
       System.out.println("Minimum= "+min);
     System.out.println("Maximum= "+max);
     System.out.println("Average= "+avg);
  }
}


