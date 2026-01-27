/*
Design the CellPhone class so that the main method of tester class can produce the following output:

Tester Class:
public class Tester9{
  public static void main(String[]args){
     CellPhone phone1 = new CellPhone();
     phone1.printDetails();
     phone1.model ="Nokia 1100";
     System.out.println("1##################");
     phone1.storeContact("Joy - 01834");
     System.out.println("===================");
     phone1.printDetails();
     System.out.println("2##################");
     phone1.storeContact("Toya - 01334");
     phone1.storeContact("Aayan - 01135");
     System.out.println("===================");
     phone1.printDetails();
     System.out.println("3##################");
     phone1.storeContact("Sani - 01441");
     System.out.println("===================");
     phone1.printDetails();  
  }
}
Output:
Phone Model unknown
Contacts Stored 0
1##################
Contact Stored
===================
Phone Model Nokia 1100
Contacts Stored 1
Stored Contacts:
Joy - 01834
2##################
Contact Stored
Contact Stored
===================
Phone Model Nokia 1100
Contacts Stored 3
Stored Contacts:
Joy - 01834
Toya - 01334
Aayan - 01135
3##################
Memory full. New contact can't be stored.
===================
Phone Model Nokia 1100
Contacts Stored 3
Stored Contacts:
Joy - 01834
Toya - 01334
Aayan - 01135

*/

//Code:

public class CellPhone{
  public String model="unknown";
  public int c;
  public String storedcontact[]=new String[3];
    public void printDetails(){
      System.out.println("Phone Mode1 "+model);  
  System.out.println("Contacts Stored "+c);
      if(c>0 && c<=3){
        System.out.println("Stored contacts: ");
      for(int i=0;i<c;i++){
       String contact=storedcontact[i];
              System.out.println(contact);
          }
        }
            }
    public void storeContact(String s){
          if(c>=3){
       System.out.println("Memory full.New contact can't be stored");       
    }
           else if(c<3 && c>=0){
      System.out.println("Contact Stored");
          storedcontact[c]=s;
          c++;
    }
}
}

public class Tester9{
  public static void main(String[]args){
     CellPhone phone1 = new CellPhone();
     phone1.printDetails();
     phone1.model ="Nokia 1100";
     System.out.println("1##################");
     phone1.storeContact("Joy - 01834");
     phone1.printDetails();
     System.out.println("2##################");
     phone1.storeContact("Toya - 01334");
     phone1.storeContact("Aayan - 01135");
     phone1.printDetails();
     System.out.println("3##################");
     phone1.storeContact("Sani - 01441");
     phone1.printDetails();  
  }
}
 
