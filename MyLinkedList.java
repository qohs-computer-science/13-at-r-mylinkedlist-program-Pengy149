// Name: Kevin Zheng, Date: 10/28/2024, Period: 3, File Name: MyLinkedList.java 
// Description: This class is supposed to represent a MyLinkedList. When an instance of this class is created, the constructor is ran which sets the initial values of head and size. 
// For methods, there are 3 add methods to add values the user wants to the LinkedList, 3 remove methods to remove values the user wants gone from the LinkedList, 
// a toString method to output the LinkedList, a size method to output the size of the LinkedList, a get method to return a specific value in the LinkedList, 
// a set method to change a value in the LinkedList for another value the user wants, and an isEmpty method to check if the LinkedList is empty.  

public class MyLinkedList {
  private ListNode head;
  private int size;
  
  public MyLinkedList() {
    head = null;
    size = 0;
  } // end Constructor  

  public int size() {
    return size;
  } // end size 

  public boolean isEmpty() {
    if(size == 0)
      return true;
    else
      return false;
  } // end isEmpty 

  public boolean add(Object newObj) {
    ListNode temp = head;
    ListNode newHead = null;
    if(head == null) {
      head = new ListNode(newObj, null);
      size++;
      return true;
    } // end if statement 
    while (temp.getNext() != null) {
      temp = temp.getNext();
    } // end while loop 
    newHead = new ListNode(newObj, null);
    temp.setNext(newHead);
    size++;
    return true;
  } // end add 

  public boolean addFirst(Object newObj) {
    head = new ListNode(newObj, head);
    size++;
    return true;
  } // end addFirst 

  public boolean addLast(Object newObj) {
    add(newObj);
    return true;
  } // end addLast 

  public Object set(int i, Object setObj) {
    ListNode temp = head;
    if (i < 0 || i >= size())
		  throw new IndexOutOfBoundsException();
    for (int j = 0; j < size; j++) {
      if(j == i) {
        Object removed = temp.getValue();
        temp.setValue(setObj);
        return removed;
      } // end if statement 
      temp = temp.getNext();
    } // end for loop
    return "Index not found in LinkedList";
  } // end set 

  public Object get(int i) {
    ListNode temp = head;
    if (i < 0 || i >= size())
		  throw new IndexOutOfBoundsException();
    for (int j = 0; j < size; j++) {
        if(j == i) 
          return temp.getValue();
        temp = temp.getNext();
    } // end for loop
    return "No Value found at index " + i;
  } // end get 

  public Object remove(int i) {
    ListNode temp = head;
    int j = 0;
    if (i < 0 || i >= size())
      throw new IndexOutOfBoundsException();
    if(i == 0)
      return removeFirst();
    else if(i == size()-1)
      return removeLast();
    else {
      while (temp.getNext() != null) {
        if(j == i-1) {
          Object removed = temp.getNext().getValue();
          temp.setNext((temp.getNext()).getNext());
          size--;
          return removed;
        } // end if statement 
        temp = temp.getNext();
        j++;
      } // end while loop
      return "No value at index " + i;
    } // end else 
  } // end remove 

  public Object removeFirst() {
    if(head == null) 
      return null;
    Object first = head.getValue();
    if(size == 1) {
      first = head.getValue();
      head = null;
      size--;
      return first; 
    } // end if statement
    head = new ListNode((head.getNext()).getValue(), (head.getNext()).getNext());
    size--;
    return first;
  } // end removeFirst 

  public Object removeLast() {
    ListNode temp = head;
    ListNode newHead = null;
    Object removed;

    if(head == null) 
      return null;
    else if (size == 1) {
      removed = temp.getValue();
      head = null;
      size--;
      return removed;
    } // end else if statement 
    else if (size == 2) {
      removed = temp.getNext().getValue();
      head = new ListNode(temp.getValue(), null);
      size--;
      return removed;
    } // end else if statement 
    while (temp.getNext().getNext().getNext() != null) 
      temp = temp.getNext();
    removed = temp.getNext().getNext().getValue();
    newHead = new ListNode(temp.getNext().getValue(), null);
    temp.setNext(newHead);
    size--;
    return removed;
  } // end removeLast

  public String toString() {
    String output = "";
    int position = 1;
    ListNode temp = head;
    while (temp != null) {
        output = output + (position + ": " + temp.getValue() + "\n");
        temp = temp.getNext();
        position++;
    } // end while loop 
    return output;
 } // end toString
  
  
} // end class 
