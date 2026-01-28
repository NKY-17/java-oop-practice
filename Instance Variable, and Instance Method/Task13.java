/*
Implement the “MobilePhone” class with necessary properties to produce the given output for the provided driver code.

Driver Class:

public class MobilePhoneTester{
  public static void main(String args []){
    MobilePhone m1 = new MobilePhone();
    MobilePhone m2 = new MobilePhone();
    m1.setContactCapacity(5);
    m2.setContactCapacity(100);
    m1.details();
    System.out.println("1----------------");
    m1.addContact("John", 9866);
    m1.addContact("Maria", 7865);
    System.out.println("2----------------");
    m1.makeCall(9866);
    System.out.println("3----------------");
    m1.addContact("Henry", 2365);
    System.out.println("4----------------");
    m1.makeCall(7552);
    m1.makeCall(2365);
    System.out.println("5----------------");
    m1.addContact("Gomes", 4589);
    m1.addContact("Antony", 8421);
    m1.addContact("Tony", 5789);
    System.out.println("6----------------");
    m1.details();
  }
}
Output:
Total Contacts: 0
Contact List:
1----------------
The contact of John is added.
The contact of Maria is added.
2----------------
Calling John . . .
3----------------
The contact of Henry is added.
4----------------
Calling 7552 . . .
Calling Henry . . .
5----------------
The contact of Gomes is added.
The contact of Antony is added.
Storage Full!!
6----------------
Total Contacts: 5
Contact List:
John:9866
Maria:7865
Henry:2365
Gomes:4589
Antony:8421

*/

//Code:
public class MobilePhone{
public int contacts;
public int capacity;
public String [] list;
public int [] num;
public void setContactCapacity(int x){
capacity=x;
list=new String[x];
num=new int[x];
}
public void details(){
System.out.println("Total Contacts: "+contacts);
System.out.println("Contact List: ");
for(int i=0;i<contacts;i++){
  System.out.println(list[i]+" : "+num[i]);
}
}
public void addContact(String x,int y){
  if(contacts<capacity){
    list[contacts]=x;
    num[contacts]=y;
    System.out.println("The contact of "+x+" is added.");
    contacts++;
  }else{
  System.out.println("Storage full!!");
  }
  }
public void makeCall(int n){
  for(int i=0;i<contacts;i++){
    if(num[i]==n){
     System.out.println("Calling "+list[i]+" . . .");
     return;
      }
  }
     System.out.println("Calling "+n+" . . ."); 
   }
}



