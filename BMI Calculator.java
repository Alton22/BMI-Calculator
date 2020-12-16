import java.util.Scanner;


class main {

public static void main(String [] args){
Scanner scan= new Scanner(System.in);

System.out.println("Enter your weight in pounds");
double w = scan.nextDouble();

System.out.println("Enter your height in inches");
double h = scan.nextDouble();


double bmi= (w/(h*h)*703.0);

System.out.println("Your BMI is " + bmi);

if (bmi < 18.5){
System.out.println("Underweight");
}

else if (bmi >= 18.5 && bmi < 25){
System.out.println("Normal weight");
}

else if (bmi >= 25 && bmi < 30){
System.out.println("Overweight");
}

else {
System.out.println("Obese");
}

}

}