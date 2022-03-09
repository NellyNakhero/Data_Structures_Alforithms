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
public class Intruction {
    static int NUMBER =3;
    public static void main (String args[]){
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<NUMBER; i++){
            sb.append("NYU \n");
        }
        System.out.println(sb);
        
        
        LinkedList<Integer> numbers = new LinkedList<>();
        LinkedList<Integer> twice_numbers = new LinkedList<>();
        // populateList(numbers, size);
        numbers.add(1);
        for (int num : numbers ){
            twice_numbers.addLast(num*2);
        }
        System.out.println(twice_numbers.size());
        
    }     
}
