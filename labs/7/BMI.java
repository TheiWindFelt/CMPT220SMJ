//file: BMI.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: Lab 7
//Due April 27th
//version: 1.0

public class BMI {
	
  private String name;	
  private int age;
  private double weight;
  private double height;
  private double feet;
  private double inches;
  public static final double KIL_PER_POUND = 0.45359237;
  public static final double MET_PER_INCH = 0.0254;
  public static final double INCH_PER_FOOT = 12;
  
  public BMI(String name, int age, double weight, double height){
    this.name = name;
	this.age = age;
	this.weight = weight;
	this.height = height;
  }
  
  public BMI(String name, double weight, double height){
    this(name, 19, weight, height);
  }
  
  public BMI (String name, int age, double weight, double feet, double inches) {
    this(name, age, weight, inches + feet * 12);
  }
  //Get bmi with height and weight calculations
  public double getBMI() {
    double bmi = weight * KIL_PER_POUND / 
	  ((height * MET_PER_INCH) * (height * MET_PER_INCH));
	return Math.round(bmi * 100) / 100.0;
  }
  //Prints status based on bmi
  public String getStatus() {
    double bmi = getBMI();
	if (bmi < 18.5)
      return "Underweight";
    else if (bmi < 25)
	  return "Normal";
    else if (bmi < 30)
      return "Overweight";
    else
      return "Obese";
  }
  
  //Setters & Getters
  public String getName(){
    return name;
  }
  public void setName(String name){
	this.name = name;
  }
  public int getAge(){
	return age;
  }
  public void setAge(int age){
	this.age = age;
  }
  public double getWeight(){
	return weight;
  }
  public void setWeight(double weight){
	this.weight = weight;
  }
  public double getHeight(){
	return height;
  }
  public void setHeight(double height){
	this.height = height;
  }
  public double getInches(){
	return inches;
  }
  public void setInches(double inches){
	this.inches = inches;
  }
  public double getFeet(){
	return feet;
  }
  public void setFeet(double feet){
	this.feet = feet;
  }
}
