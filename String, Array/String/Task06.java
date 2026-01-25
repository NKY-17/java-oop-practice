/*
 Given a string, create and print a new string with all the consecutive duplicates removed. 

Sample Input: ABBCCCCCBBAB
Output: ABCBAB
Sample Input: AAABBBBCDDBBECE
Output: ABCDBECE
*/
//Code:
import java.util.Scanner;
public class task6{
public static void main(String[]args){
Scanner sc=new Scanner(System.in); 
String x=sc.nextLine();
String z="";
for(int i=0;i<x.length();i++){
 char c=x.charAt(i);
      if(i==0||c!= x.charAt(i-1)){
        z+=c;
      }
}
System.out.print(z);
}
}
