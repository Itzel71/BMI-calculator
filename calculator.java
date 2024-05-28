
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();

        double bmi = calculateBMI(weight, height);

        System.out.printf("Your BMI: %.2f%n", bmi);
        System.out.println("result: " + getBMICategory(bmi));
        sc.close();

    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24) {
            return "Normal weight";
        } else if (bmi >= 24 && bmi < 27) {
            return "Overweight";
        } else if (bmi >=27 && bmi <= 30){
            return "Mild obesity";
        }else if (bmi >= 30 && bmi < 35) {
        	return "Moderate obesity";
        }else {
        	return "Severe obesity"; 
        }
    }
}
