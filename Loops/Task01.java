/*
Task 1

a) Using while loops, write a java code to display/print the following serieses:
2, 6, 10, 14, 18, 22, 26, 30, 34, 38, 42, 46, 50
(Hint: Identify the start, end, and common increment)

b) 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105, 120
(Hint: at each iteration, the increment amount also increases)
*/

//Code:

a)
public class task1{
  public static void main(String[]args){
                 int x=2;
             while(x<=50){
               if(x==50){
                  System.out.print(x);
                  break;
               }else{
             System.out.print(x+" , ");
               x+=4;
         }
      }
    }
}

b)
public class task1{
  public static void main(String[]args){
                 int x=1;
                 int y=2;
             while(x<=120){
               if(x==120){
                  System.out.print(x);
                  break;
               }else{
             System.out.print(x+" , ");
               x+=y;
         }
               y++;
      }
    }
}
