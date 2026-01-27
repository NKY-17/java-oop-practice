/* 
Write the driver code of  “Test2” class to generate the following output:

public class Test2{
    public static void main(String [] args){
    //Your code here    
    }
}

Design Class:

public class Circle {
  public double radius = 5;
}

Output:
Radius of the circle is 5.0
The area of the circle is 78.53981633974483
The circumference of the circle is 31.41592653589793
*/
  //Code:
public class Circle {
  public double radius = 5;
}

public class Test2{
    public static void main(String [] args){
    Circle r=new Circle();
    double a=3.142*(r.radius*r.radius);
    double c=2*3.142*r.radius;
    System.out.println("Radius of the circle is "+r.radius);
    System.out.println("Area of the circle is "+a);
    System.out.println("Circumference of the circle is "+c);
    }
}

