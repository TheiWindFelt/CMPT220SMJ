//file: RandomMonth.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 2
//Due February 9th
//version: 1.0

import java.util.Random;

public class RandomMonth {
  public static void main (String[] args) {
  
    //Generates random int between 1 and 12
    int random = (int)(Math.random() * 12 + 1);
    
	//Displays the month based on conditions met.
    if (random == 1)
      System.out.print("January!");
    else if (random == 2)
	  System.out.print("February!");
    else if (random == 3)
	  System.out.print("March!");
    else if (random == 4)
	  System.out.print("April!");
    else if (random == 5)
	  System.out.print("May!");
    else if (random == 6)
	  System.out.print("June!");
    else if (random == 7)
	  System.out.print("July!");
    else if (random == 8)
	  System.out.print("August!");
    else if (random == 9)
	  System.out.print("September!");
    else if (random == 10)
	  System.out.print("October!");
    else if (random == 11)
	  System.out.print("November!");
    else if (random == 12)
	  System.out.print("December!");
 }
}