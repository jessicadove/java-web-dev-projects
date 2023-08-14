package main.java.org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double circleArea = Circle.getArea(radius);
        if ((radius <= 0) || (radius.isNan() == true) || (radius.isEmpty() == true)) {
            System.out.println("Error. Please enter a numeric value.");
        } else {
            System.out.println("The area of a circle with a radius of " + radius + " is: " + circleArea);
        }
        input.close();
    }
}


