/*
Complete the following Cart class to generate the given output from the tester code:
A cart will have a cart number which will be assigned in create_cart() method.
Each cart can hold up to 3 items (at max).
Each cart must have two arrays to store items and their respective prices.
The items inside a cart will be added in addItem() method only if the cart items do not exceed 3.
The giveDiscount() method saves the discount given to that cart object and updates the price accordingly.

Driver Code:

public class Tester6{
   public static void main(String [] args){
       Cart c1 = new Cart (); 
       Cart c2 = new Cart ();
       Cart c3 = new Cart ();

       c1.create_cart(1);
       c2.create_cart(2);
       c3.create_cart(3);
       System.out.println("====1====");
       c1.addItem("Table", 3900.5);
       c1.addItem("Chair", 1400.76);
       c1.addItem("Television", 5400.87);
       c1.addItem("Refrigerator", 5000);

       System.out.println("====2====");
       c2.addItem("Stove",439.90);
       
       System.out.println(""====3===="");
       c3.addItem("Chair",1400.5);
       c3.addItem("Chair",3400);
       
       System.out.println(""====4===="");
       c1.cartDetails();
       
       System.out.println(""====5===="");
       c2.cartDetails();
       
       System.out.println(""====6===="");
       c3.cartDetails();
       c1.giveDiscount(10);
       
       System.out.println(""====7===="");
       c1.cartDetails();
   }
}
Expected Output:
  
====1====
Table added to cart 1.
You have 1 item(s) in your cart now.
Chair added to cart 1.
You have 2 item(s) in your cart now.
Television added to cart 1.
You have 3 item(s) in your cart now.
You already have 3 items on your cart
====2====
Stove added to cart 2.
You have 1 item(s) in your cart now.
====3====
Chair added to cart 3.
You have 1 item(s) in your cart now.
Chair added to cart 3.
You have 2 item(s) in your cart now.
====4====
Your cart(c1) : 
Table - 3900.5
Chair - 1400.76
Television - 5400.87
Discount Applied: 0.0%
Total price: 10702.130000000001
====5====
Your cart(c2) : 
Stove - 439.9
Discount Applied: 0.0%
Total price: 439.9
====6====
Your cart(c3) : 
Chair - 1400.5
Chair - 3400.0
Discount Applied: 0.0%
Total price: 4800.5
====7====
Your cart(c1) : 
Table - 3900.5
Chair - 1400.76
Television - 5400.87
Discount Applied: 10.0%
Total price: 9631.917000000001
  */
//Code:
public class Cart{
 int c=0;
 int count=0;
 public String [] item=new String[3];
 public double[] price=new double[3];
 public double discount=0.0;
 double sum=0.0;
  public void create_cart(int x){
    c=x;
  }
  public void addItem(String y,double z){
    if(count<3){
       System.out.println(y+" added to cart "+c);
        item[count]=y;
      price[count]=z;
     count++;
       System.out.println("You have "+count+" item(s) in your cart now.");
    // count++;
    }else{
      System.out.println("You already have "+count+" items on your cart");
    }
}
  public void cartDetails(){
    System.out.println("Your cart(c"+c+") :");
    for(int i=0;i<count;i++){
      sum+=price[i];
      System.out.println(item[i]+" - "+price[i]);
    }
    System.out.println("Discount Applied: "+discount+"%");
    if(discount>0.0){
    sum-=sum*(discount/100);
    }
    System.out.println("Total price: "+sum);
    sum=0;
  }
  public void giveDiscount(double d){
    discount=d;
  }
}



