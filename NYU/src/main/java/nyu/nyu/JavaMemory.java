/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyu.nyu;

class Circle {
// How to define a constant in Java
private final double PI = 3.14159;
// radius of circle
private double radius;

// no arg Constructor
public Circle() {
radius = 0.0;
}
// Parameterized constructor
public Circle(double r) {
radius = r;
}
//Setter (Mutator) method for radius
public void setRadius(double r) {
radius = r;
}
//Getter (Accessor) method for radius
public double getRadius() {
return radius;
}
// method to calculate and return area
public double getArea() {
return PI * radius * radius;
}
}

/**
 *
 * @author nelly
 */
public class JavaMemory {
    public static void main(String args[]){
        Circle c1 = new Circle (10);
        Circle c2 = new Circle (20);
        Circle c3 = c1;
        
        System.out.println(c1.getRadius() + "\t" + c2.getRadius() + "\t" + c3.getRadius());
        
        c1.setRadius(30);
        System.out.println(c1.getRadius() + "\t" + c2.getRadius() + "\t" + c3.getRadius());
        
        c2.setRadius(5);
        c2 = c3;
        System.out.println(c1.getRadius() + "\t" + c2.getRadius() + "\t" + c3.getRadius());
        
        c1=c2;
        c1.setRadius(15);
        System.out.println(c1.getRadius() + "\t" + c2.getRadius() + "\t" + c3.getRadius());
        
      //  System.out.println(c1.getRadius + " " + c2.getRadius + " " + c3.getRadius);
    }
    
    
}
