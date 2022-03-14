/*
A linked list class. Elements are of type int. 
*/

public class LinkedListA {

    //define internal Node class 
    private class Node { 
        public int data; 
        public Node next; 

        public Node (int data) {
            this.data = data;
            this.next = null; 
        }
    }
      private Node head;
    private Node tail; 
    private int size; 


    /*
    * Creates an empty list object.  
    */
    public LinkedListA() {
        head = null;
        tail = null;
    }
 /* 
    * Adds an element 'num' at the end of this list. 
    * @param num the element to be added to this list 
    */
    public void add (int num) {
         //create a new node and start the counter 
         Node n = new Node(num);
         
         if (size == 0) {     //add to an empty list   
             head = n;
             tail = n;
         } 
         else {              //add to the end of the list
             tail.next = n;
             tail = n; 
         }
         size++; 
    }

 
    /*
    * Produces string representation of this list. 
    * The string contains all elemetns stored in the list, one per line.
    * @return returns the string representation of this list 
    */
    public String toString () {
        if (head == null ) return ""; 
        String toReturn = ""; 
        Node current = head; 
        while (current != null ) {
            toReturn += current.data + " "; 
            current = current.next;
        }
        return toReturn; 
    }
      /*
     * Computes and ruturns sum all all the values stored 
     * in this list.
     * @return sum of all the values or 0 if the list is empty 
     */
     public int sum (){


         return 0;
     }



}