/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyu.nyu;

/**
 *
 * @author nelly
 */
public class CharacterRecurssion {
    
  static  String reverseRec ( String str) {
    if (str.length() == 0 )
     return str;
    else {
      int last = str.length()-1;
     return str.charAt(last) +
          reverseRec( str.substring(0,last) ) ;
        }
    }
    
    static String reverse ( String str) {
     if (str == null )
       return null;
     return reverseRec( str );
    }

    public static void main(String args[]){
        String v = reverse(null);
        System.out.println(v);
    }
}
