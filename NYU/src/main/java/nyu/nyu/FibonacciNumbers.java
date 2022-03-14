/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyu.nyu;

/**
 *
 * @author nelly
 */
public class FibonacciNumbers {
    //this code on appears so much simpler but When we try to compute the 40th 
    //Fibonacci number: Th code takes 463 milliseconds
    public static long fibonacci1(long num){
        //base case
        if(num == 0){
            return 0;
        }
        else if (num == 1){
            return 1;
        }
        //recursive case
        else{
            return (fibonacci1(num-1) + fibonacci1(num-2));
        }
    }
    
    //this code on appears so much complex but When we try to compute the 40th 
    //Fibonacci number: Th code takes 0.008 milliseconds
    public static long fibonacci2(long num){
        //base case
        if(num == 0){
            return 0;
        }
        else if (num == 1){
            return 1;
        }
        else{
            long temp1 = 0;
            long temp2 = 1;
            long result = 0;
            int counter = 2;
            
            while(counter <= num){
                result = temp1 + temp2;
                
                temp1 = temp2;
                temp2 = result;
                
                counter++;
            }
            return result;
        }
    }
    
    //main method
    public static void main(String args[]){
        System.out.println("fib(3) = " + fibonacci2(3));
        
        System.out.println("fib(3) = " + fibonacci1(3));
        
    }
    
}
