/*
Write the Java code of a program that takes an integer from the user, and prints the integer it is a multiple of either 2 or 5 but not both. If the number is a multiple of 2 and 5 both, then print "Multiple of 2 and 5 both". For all other numbers, the program prints "Not a multiple we want".
For example, 2, 4, 5, 6, 8, 12, 14, 15, 16, 18, 22 … i.e. this includes multiples of 2 only and multiples of 5 only, NOT multiples of 2 and 5 both or other numbers. 
hint(1): we may use the modulus (%) operator for checking the divisibility
hint(2): we can consider the number to be an integer

Sample Input :6
Output: 6
Sample Input: 15
Output: 15
Sample Input: 10
Output: Multiple of 2 and 5 both
Sample Input: 17
Output: Not a multiple we want
*/
Code:
import java.util.Scanner;
public class task10{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
             int x=sc.nextInt();
               if(x%2==0 && x%5==0){
    System.out.println("Multiple of 2 and 5 both");
      }
       else if(x%2==0){
        System.out.println(x);
      }
       else if(x%5==0){
      System.out.println(x);
       }
 else{
         System.out.println("Not a multiple we want");
}
  }
}
