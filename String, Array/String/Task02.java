/*
Task - 02: Write a Java program that takes a string input in small letters from the user and prints the previous alphabet in sequence for each alphabet found in the input.

Sample Input:
wxyz
Output:
vwxy
Sample Input:
thecow
Output:
sgdbnv
Sample Input:
abcd
Output:
zabc

*/
//Code:
import java.util.Scanner;
public class task2{
public static void main(String[]args){
Scanner sc=new Scanner(System.in); 
String x=sc.nextLine();
for(int i=0;i<x.length();i++){
  char c=x.charAt(i);
  if(c=='a'){
    c='z';
    System.out.print(c);
  }else{
  int y=(int)c;
  char c1=(char)(y-1);
  System.out.print(c1);
  }
}
}
}

