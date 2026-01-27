/*
Design the “ImaginaryNumber” to generate the output given below:

Tester Class: 
public class Tester6{
  public static void main(String [] args){
     ImaginaryNumber num1 = new ImaginaryNumber();
     num1.printNumber();
     System.out.println("1********");
     num1.realPart=3;
     num1.imaginaryPart=7;
     num1.printNumber();
     System.out.println("2********");
     ImaginaryNumber num2 = new ImaginaryNumber();
     num2.realPart=1;
     num2.imaginaryPart=9;
     num2.printNumber();
    }
}
Output:
0 + 0i
1********
3 + 7i
2********
1 + 9i
*/

//Code:
public class ImaginaryNumber{
  public int realPart;
  public int imaginaryPart;
  public void printNumber(){
    System.out.println(realPart+" + "+imaginaryPart+"i");
  }
}

public class Tester6{
  public static void main(String [] args){
     ImaginaryNumber num1 = new ImaginaryNumber();
     num1.printNumber();
     System.out.println("1********");
     num1.realPart=3;
     num1.imaginaryPart=7;
     num1.printNumber();
     System.out.println("2********");
     ImaginaryNumber num2 = new ImaginaryNumber();
     num2.realPart=1;
     num2.imaginaryPart=9;
     num2.printNumber();
    }
}
