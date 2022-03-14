/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyu.nyu;

/**
 *
 * @author nelly
 */
public class JosephusProblem {
     static int josephus(int n, int k)
    {
        if (n == 1)
            return 1;
        else
            /* The position returned by josephus(n - 1, k)
            is adjusted because the recursive call
            josephus(n - 1, k) considers the original
            position k%n + 1 as position 1 */
            return (josephus(n - 1, k) + k - 1) % n + 1;
    }
 
    // Driver Program to test above function
    public static void main(String[] args)
    {
        int n = 14;
        int k = 2;
        System.out.println("The winning place is "
                           + josephus(n, k));
    }
    
}

// This code is contributed by Prerna Saini
