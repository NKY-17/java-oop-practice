/*
Task 3
Write a Java program that displays the 2 rightmost digits of your student ID in reverse order. For example, if your student id is 23221454, you need to print 4, and then 5.

Sample Input: 23221454
Output:
4
5
*/
Code:
public class task3{
  public static void main(String[]args){
       int id=23221454;
       int x=id%100;
       int y=x%10;
       int z=x/10;
         System.out.println(y);
          System.out.println(z);
  }
}

