import java.util.Scanner;

public class CalcFinalGrade {
  public static void main(String[] args) {
    double midterm;
    double finalExam;
    double project;	
	double hwlabs;
	
    System.out.print("Put your four rubric percentages. Please put spaces. (:");
    Scanner input=new Scanner(System.in); 
   
    midterm = input.nextDouble(); 
	finalExam = input.nextDouble(); 
	project = input.nextDouble(); 
	hwlabs = input.nextDouble(); 
	
	double finalgrade = ((midterm + finalExam + project + hwlabs) / 400)*100; 
	
    System.out.println("Your finalgrade is "+ finalgrade+"%");
  }
}