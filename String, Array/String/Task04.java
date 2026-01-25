/*
Write a Java program that will ask the user to input a word in small letters where each of its alphabets is unique and has not been entered before by the user. If the user does input a word that consists of duplicate alphabets, the program should reject the user’s input and ask for another word. 

Sample Input: fahim
Output: You entered fahim.
Sample Input:
farah
akbor
Output:
“a” has been counted 2 times in the word “farah”.
Please enter another word.
You entered akbor.
Sample Input:
alanna
ronan
john
Output:
“a” has been counted 3 times in the word “alanna”.
“n” has been counted 2 times in the word “alanna”.
Please enter another word.
“n” has been counted 2 times in the word “ronan”.
Please enter another word.
You entered john.

*/

//Code:
import java.util.Scanner;
public class task4{
public static void main(String[]args){
Scanner sc=new Scanner(System.in); 
int count=1;
       System.out.println("Words to be in taken in small letters");
  String a=sc.nextLine();
      for(int i=0;i<a.length();i++){
char c=a.charAt(i);
for(int j=i+1;j<a.length();j++){
  char c1=a.charAt(j);
  if(c==c1){
        count++;
     System.out.println(c+" has been counted "+count+" in the word "+a);
         }
       }
           }
     if(count<=1){
     System.out.println("You have entered "+a);
       }else{
         System.out.println("Please enter another word");
    String x=sc.nextLine();
      System.out.println("You have entered "+x);
    count=1;
    }
  }
}
