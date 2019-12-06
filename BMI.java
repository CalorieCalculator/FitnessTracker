import java.util.Scanner;

public class BMI {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  double weight = 0.0;
  double height = 0.0;
  double bmi = 0.0;
  
  System.out.print("Enter your weight in pounds: ");
  weight = input.nextInt();
  
  System.out.print("Enter your height(inches): ");
  height = input.nextInt();
  
  bmi = ((weight*703)/(height*height));
  
  System.out.printf("Your BMI is %f", bmi);
  
  System.out.println(" BMI VALUES");
  if (bmi<18.5){
  System.out.println("Underweight: Under 18.5");
  }
  else if (18.5<=bmi||bmi<24.9){
  System.out.println("Normal: 18.5-24.9");
  }
  else if (25<=bmi||bmi<29.9){
  System.out.println("Overweight: 25-29.9");
  }
  else 
  System.out.println("Obese: 30 or over");
 }

}