/*Task - 01: Write a Java program that will take one string input from the user. Then check and print whether it is a palindrome. 

Sample Input:
Java
Output: Not a palindrome
Sample Input:
madam
Output: Palindrome

*/
//Code:
import java.util.Scanner;
public class task1{
public static void main(String[]args){
Scanner sc=new Scanner(System.in); 
String s="";
String s1="";
String x=sc.nextLine();
for(int i=0;i<x.length();i++){
  char c=x.charAt(i);
  s+=c;
}
for(int j=x.length()-1;j>=0;j--){
char c1=x.charAt(j);
s1+=c1;
}
if(s.equals(s1)){
  System.out.println("Palindrome");
}
else{
  System.out.println("Not a Palindrome");
}
}
}
