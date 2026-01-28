/*
Implement the “Shelf” class with necessary properties, so that the given output is produced for the provided driver code.

Driver Class:

public class ShelfTester{
  public static void main(String [] args){
    Shelf shelf = new Shelf();
    shelf.showDetails();
    System.out.println("1---------------");
    shelf.addBooks(3);
    System.out.println("2---------------");
    shelf.capacity = 7;
    shelf.addBooks(3);
    System.out.println("3---------------");
    shelf.showDetails();
    System.out.println("4---------------");
    shelf.addBooks(5);
    shelf.showDetails();
    shelf.capacity += 4;
    System.out.println("6---------------");
    shelf.addBooks(5);
    shelf.showDetails();
  }
}
Output:
Shelf capacity: 0
Number of books: 0
1---------------
Zero capacity. Cannot add books.
2---------------
3 books added to shelf
3---------------
Shelf capacity: 7
Number of books: 3
4---------------
Exceeds capacity
Shelf capacity: 7
Number of books: 3
6---------------
5 books added to shelf
Shelf capacity: 11
Number of books: 8
*/
//Code:
public class Shelf{
public int capacity;
public int numbooks;
int c=0;
public void showDetails(){
  System.out.println("Shelf capacity: "+capacity);
  System.out.println("Number of books: "+numbooks);
}
public void addBooks(int x){
  c=x+numbooks;
      if(capacity==0){
    System.out.println("Zero capacity. Cannot add books.");
  }else if(c<=capacity){
    System.out.println(x+" books added to shelf");
    numbooks+=x;
   }else{
    System.out.println("Exceed capacity");
   }
}
}




