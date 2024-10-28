// Name: Kevin Zheng, Date: 10/28/2024, Period: 3, File Name: MyLLTester.java 
// Description: The purpose of this java file is to test all of the methods of the MyLinkedList Class. 

public class MyLLTester {
  public static void main(String [] args)
  {
    MyLinkedList tester = new MyLinkedList();
    System.out.println("Size of Linked List: " + tester.size());
    System.out.println("Is the LinkedList empty? " + tester.isEmpty());
    System.out.println(tester.toString());

    System.out.println("Is the word added to LinkedList? " + tester.add("hello"));
    System.out.println("Is the word added to LinkedList? " + tester.add("penguin"));
    System.out.println("Is the word added to LinkedList? " + tester.add("Kevin"));
    System.out.println("Is the word added to LinkedList? " + tester.addLast("I like chickens"));
    System.out.println("Is the word added to LinkedList? " + tester.addLast("Deja Vu"));
    System.out.println("Is the word added to LinkedList? " + tester.addFirst("Great Escape"));
    System.out.println("Is the word added to LinkedList? " + tester.addLast("Ivan the IDK"));
    System.out.println("Is the word added to LinkedList? " + tester.add("To be or not to be"));
    System.out.println("Is the word added to LinkedList? " + tester.addFirst("stuff"));
    System.out.println("Is the word added to LinkedList? " + tester.addLast("things"));
    System.out.println(tester.toString());
    System.out.println("Size of Linked List: " + tester.size());
    
    System.out.println("Value at index 0 or position 1: " + tester.get(0));
    System.out.println("Value at index 9 or position 10: " + tester.get(9));
    System.out.println("Value at index 4 or position 5: " + tester.get(4));

    System.out.println("Old value at index 0 or position 1: " + tester.set(0, "Burger King"));
    System.out.println("Old value at index 9 or position 10: " + tester.set(9, "McDonalds"));
    System.out.println("Old value at index 4 or position 5: " + tester.set(4, "Minecraft"));
    System.out.println(tester.toString());
    System.out.println("Size of Linked List: " + tester.size());

    System.out.println(tester.removeFirst());
    System.out.println(tester.toString());
    System.out.println("Size of Linked List: " + tester.size());

    System.out.println(tester.removeLast());
    System.out.println(tester.toString());
    System.out.println("Size of Linked List: " + tester.size());

    System.out.println(tester.remove(6));
    System.out.println(tester.toString());
    System.out.println("Size of Linked List: " + tester.size());


    System.out.println("Is the word added to LinkedList? " + tester.add("gaming"));
    System.out.println("Is the word added to LinkedList? " + tester.addFirst("Angry Birds"));
    System.out.println("Is the word added to LinkedList? " + tester.addLast("Geometry Dash"));
    System.out.println(tester.toString());
    System.out.println("Size of Linked List: " + tester.size());
    System.out.println("Is the LinkedList empty? " + tester.isEmpty());

    System.out.println("Value at index 0 or position 1: " + tester.get(0));
    System.out.println("Value at index 9 or position 10: " + tester.get(9));
    System.out.println("Value at index 4 or position 5: " + tester.get(4));

    System.out.println("Old value at index 0 or position 1: " + tester.set(0, "Burger King"));
    System.out.println("Old value at index 9 or position 10: " + tester.set(9, "McDonalds"));
    System.out.println("Old value at index 4 or position 5: " + tester.set(4, "Minecraft"));

    System.out.println(tester.toString());
    System.out.println("Size of Linked List: " + tester.size());
    System.out.println("Is the LinkedList empty? " + tester.isEmpty());

  } // end main
  
} // end class
