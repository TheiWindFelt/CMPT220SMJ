//file: RectProgram.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: Lab 6
//Due April 20th
//version: 1.0 

public class RectProgram {
  public static void main (String[] args) {
	  
	//Creates an array of Rectangles with size of 2
    Rectangle[] newrects = new Rectangle[2];
	
	//The rectangles in the arrays are assigned width and height values
    newrects[0] = new Rectangle (4, 40);
    newrects[1] = new Rectangle (3.5, 35.9);
	
    //Displays attributes of the two triangles
    System.out.println("\n Rectangle 1");
      System.out.println("Width:     " + newrects[0].getWidth());
      System.out.println("Height:    " + newrects[0].getHeight());
	  System.out.println("Area:      " + newrects[0].getArea());
	  System.out.println("Perimeter: " + newrects[0].getPerimeter());

	System.out.println("\n Rectangle 2");
	  System.out.println("Width:     " + newrects[1].getWidth());
	  System.out.println("Height:    " + newrects[1].getHeight());
	  System.out.println("Area:      " + newrects[1].getArea());
	  System.out.println("Perimeter: " + newrects[1].getPerimeter());
  }
}
