/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyu.nyu;

import java.util.LinkedList;

/**
 *
 * @author nelly
 */
public class LinkedListJava {
    public static void main (String args[]){
        // Creating object of the class linked list
        LinkedList<String> ls = new LinkedList<>();
        
        // Adding elements to the linked list
        ls.add("Beyonce");
        ls.add("Kelly");
        ls.addFirst("Alina");
        ls.addLast("Sabrio");
        
        //print
        System.out.println(ls);
        System.out.println("==================================================");
        
        
        //Changing Elements
        ls.add(2, "Katty");
        ls.set(4, "Selena");
        
        //print
        System.out.println("changed list "+ls);
        System.out.println("==================================================");
        
        //Removing Elements
        //1. the Index Remova
        ls.remove(1);
        System.out.println("After the Index Removal" + ls);
        System.out.println("==================================================");
        
        //2. the Object Removal
        ls.remove("Selena");
        System.out.println("After the Object Removal " + ls);
        System.out.println("==================================================");
        
        
        
        //Iterating the LinkedList
        // Using the Get method and the for loop
        System.out.print("\"Iterating using for:\t\"");
        int count =0;
        for(int i =0; i<ls.size(); i++){
            System.out.print(ls.get(i) + ", ");
            count++;
        }
        System.out.println("count ==" + count);
        
        
        System.out.print("\n" + "\"Iterating using for each:\t\"");
        for(String li:ls){
            System.out.print(li +", ");
        }
        System.out.println("\n==================================================");
        
        
        
        //the code that would iterate through the list and stop at the second to last node
        System.out.print("\n" + "Iterating through the list aand stop at second last node [");
        int second_last_index = ls.size() - 1;
        count = 0;
        for(int i =0; i<ls.size(); i++){
            if(second_last_index == count){
                break;
            }
            System.out.print(ls.get(i) + ", ");
            ++count;
        }
        System.out.print("]");
        System.out.println("\n==================================================");
        
        
    }
    
}
