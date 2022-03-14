/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyu.nyu;

import java.util.*;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author nelly
 */
public class ReversDropAlgorithm {
    //reverse function
     public static int[] reverse(int a[], int n)
    {
        int[] anotherArray = new int[a.length];
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
  
        // printing the reversed array
        System.out.print("Reversed array is: [");
        for (k = 0; k < n; k++) {
            System.out.print(a[k] +", ");
            anotherArray[k] = a[k];
        }
        System.out.println("]");
        return anotherArray;
    }
     
     //drop function
      // Function to remove the element
    public static int[] drop(int[] arr, int index)
    {
 
        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0
            || index >= arr.length) {
 
            return arr;
        }
 
        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];
 
        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {
 
            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }
 
            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }
 
        // return the resultant array
        return anotherArray;
    }
     
     static void reverseDrop(int array[], String commands[]){
         int pos =0;
         int formatted_array[] = array;
         
         for(String val: commands){
             if(val.equals("R")){
                 formatted_array = reverse(array, array.length);
             }
             if(val.equals("D")){
                 formatted_array = drop(array,pos);
             }
         }
         
         System.out.print("final list {");
         for(int fvalue: formatted_array){
             System.out.print(fvalue + ", " );
         }
         System.out.println("]");
        
     }
    
     //circleci ad
     public static void main (String args[]){
         int[] arr = { 10, 20, 30, 40, 50 };
        reverse(arr, arr.length);
         System.out.println("================================================");
         
         int pos = 0;
         System.out.println("Dropped array: " + Arrays.toString(drop(arr,0)));
         System.out.println("================================================");
         
         
         String[] commands = { "D" };
         reverseDrop(arr, commands);
         
     }
}
