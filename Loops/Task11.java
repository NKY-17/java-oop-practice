/*
Write a java programs to print the following patterns

a)Square pattern

Sample Input: 5
Sample Output:
*****
*****
*****
*****
*****

b)Triangle pattern

Sample Input: 5
Sample Output:
*
**
***
****
*****
*/
Code:
a)
import java.util.Scanner;
public class task11a{
  public static void main(String[]args){
Scanner sc=new Scanner(System.in); 
int x=sc.nextInt();
for(int i=1;i<=x;i++){
  for(int j=1;j<=x;j++){
    System.out.print("*");
  }
  System.out.println();
}
  }
}
b)
import java.util.Scanner;
public class task11b{
  public static void main(String[]args){
Scanner sc=new Scanner(System.in); 
int x=sc.nextInt();
for(int i=1;i<=x;i++){
  for(int j=1;j<=i;j++){
    System.out.print("*");
  }
  System.out.println();
}
  }
}


