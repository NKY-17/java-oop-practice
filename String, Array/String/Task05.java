/*
Write a Java program that takes TWO string inputs (containing exactly one word in each string) from the user. Concatenate those two strings with a single space in between them. Generate a number which is the sum of all the letters in that concatenated string where A = 65, Z = 90, a = 97, and z = 122. Your task is to print that concatenated string and the number generated from that string.

Sample Input
Hello123
Wo%%rld
Output:
Hello123 Wo%%rld
1020
Sample Input:
Ja12-va
CHOWD+HURY
Output:
Ja12-va CHOWD+ HURY
1087
*/

//Code:
import java.util.Scanner;
public class task5{
public static void main(String[]args){
Scanner sc=new Scanner(System.in); 
String x=sc.nextLine();
String y=sc.nextLine();
int s=0;
int s1=0;
  System.out.println(x+" "+y);
for(int i=0;i<x.length();i++){
int c=(int)(x.charAt(i));
if(c>='a' && c<='z'||c>='A' && c<='Z'){
s+=c;
}
}
for(int j=0;j<y.length();j++){
  int c1=(int)(y.charAt(j));
  if(c1>='a' && c1<='z'||c1>='A' && c1<='Z'){
s+=c1;
}
 }
System.out.println(s+s1);
}
}
