/*
Design the Reader class in such a way so that the following code provides the expected output.
A reader will have a name, capacity to read and an array of books they are reading.
The initial capacity of a reader will be 0. The initial name will be “New user”.
A new array is created every time a reader’s capacity is increased, which replaces the initial array.

Driver Code:

public class Reader_tester {
   public static void main(String[] args){
       Reader r1 = new Reader();
       Reader r2 = new Reader();
       
       r1.createReader("Messi", 2);
       r2.createReader("Ronaldo", 5);
       
       System.out.println("1 ==========");
       r1.readerInfo();
       
       System.out.println("2 ==========");
       r2.addBook("Java");
       r2.addBook("Python");
       r2.addBook("C++");
       r2.readerInfo();
       
       System.out.println("3 ==========");
       r1.addBook("C#");
       r1.addBook("Rust");
       r1.addBook("GoLang");
       
       System.out.println("4 ==========");
       r1.increaseCapacity(5);
       r1.addBook("Python");
       
       System.out.println("5 ==========");
       r1.readerInfo();
   }
}
Expected Output:

1 ==========
Name: Messi
Capacity: 2
Books: 
No books added yet
2 ==========
Name: Ronaldo
Capacity: 5
Books: 
Book 1: Java
Book 2: Python
Book 3: C++
3 ==========
No more space for new book
4 ==========
Messi's capacity increased to 5
5 ==========
Name: Messi
Capacity: 5
Books: 
Book 1: C#
Book 2: Rust
Book 3: Python

  */

//Code:
public class Reader{
  public String name="New user";
  public int capacity=0;
  public String [] books=new String[0];
    int c=0;
    public void createReader(String n,int num){
    name=n;
    capacity=num;
    books=new String[capacity];
    }
    public void readerInfo(){
    System.out.println("Name: "+name);
    System.out.println("Capacity: "+capacity);
    System.out.println("Books:");
    if(c==0){
      System.out.println("No books added yet");
    }else{
      for(int i=0;i<c;i++){
        System.out.println("Book "+(i+1)+" : "+books[i]);
    }
    }
    }
  public void addBook(String x){
    if(capacity>c){
      books[c]=x;
      c++;
    }
    else{
     System.out.println("No more space for new book");
    }
  }
  public void increaseCapacity(int z){
    capacity=z;
    //books=new String[z];
    System.out.println(name+"'s capacity increased to "+z);
 String newarray[]=new String[capacity];
 for(int j=0;j<c;j++){
   newarray[j]=books[j];
 }
 books=newarray;
  }
     }
       
