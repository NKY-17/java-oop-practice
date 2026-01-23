/* Write a Java program declaring two integer variables and initializing them. Your task is to swap the values of these two variables. You must complete it using two different approaches.
By Creating a third variable.
Without creating any other variables.*/

Code:
public class task2{
  public static void main(String[]args){
       int x=4;
        int y=2;
        int z=x;
        x=y;
        y=z;
        System.out.println(x);
         System.out.println(y);
  }
}

public class task2{
  public static void main(String[]args){
       int x=4;
        int y=2;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x);
         System.out.println(y);
  }
}
