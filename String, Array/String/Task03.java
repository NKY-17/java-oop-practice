/*
Write a Java program that will ask the user to input a string (containing exactly one word). Then your job is to print subsequent substring of the input string.

Sample Input:
BANGLA
Output:
B
BA
BAN
BANG
BANGL
BANGLA
Sample Inout:
DREAM
Output:
D
DR
DRE
DREA
DREAM

*/
//Code:
import java.util.Scanner;
public class task3{
public static void main(String[]args){
Scanner sc=new Scanner(System.in); 
String x=sc.nextLine();
for(int i=0;i<x.length();i++){
  for(int j=0;j<=i;j++){
    System.out.print(x.charAt(j));
  }
  System.out.println();
}
}
}
