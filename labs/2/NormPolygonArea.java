//file: NormPolygonArea.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 2
//Due February 9th
//version: 1.0

import java.util.Scanner;
 
public class NormPolygonArea {
  public static void main(String[] args) {
 
   Scanner input = new Scanner(System.in);
   
   //User inputs for what the program prints.
   System.out.print("Enter the number of sides ");
   double n = input.nextDouble();
   
   System.out.print("Enter the length of the side ");
   double s = input.nextDouble();
   
   //Computes the polygon area based on user input
   double area = n * Math.pow(s, 2) / (4 * Math.tan(Math.PI / n));
 
   System.out.println("The polygon area is " + area);
  }
}