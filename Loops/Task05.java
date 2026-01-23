/*
Write a java program that takes inputs from the user in a loop until three consecutive zeros are entered, then displays the sum, average, minimum and maximum of those numbers. You can consider the zeros in the input to be excluded in the sum / max / min / average.

Sample Input:
4 
1 
12 
54 
0 
0 
37 
4 
0 
0 
0
Sample Output:
Sum = 112        
Minimum = 1      
Maximum = 54
Average = 18.666666666666668
Sample Input:
0 
0 
0
Sample Output:
No numbers found
*/
Code:
import java.util.Scanner;
public class q5{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int s=0;
   double a=0;
   int min=1;
   int max=0;
   int zeroc=0;
   int c=0;
    for(int i=0;i>=0;i++){
      int x=sc.nextInt();
    if(x<min && x!=0){
        min=x;
      }else if(x>max){
        max=x;
      }
      if(x==0){
        zeroc++;
        if(zeroc==3){
         break;
        }
      }else{
        zeroc=0;
        s+=x;
        c++;
      }
    }
    if(c>0){
      a=s/(double)c;
      System.out.println("Sum= "+s);
      System.out.println("Minimum= "+min);
      System.out.println("Maximum= "+max);
      System.out.println("Average= "+a);
    }else{
        System.out.println("NO numbers found");
    }
   }
  }

