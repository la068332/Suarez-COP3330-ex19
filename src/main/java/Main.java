import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your height in inches?");
        double height = scanner.nextDouble();
        System.out.println("What is your weight in pounds?");
        double weight = scanner.nextDouble();
        double bmi = (weight / (height * height)) * 703.0;
        System.out.println("Your BMI is "+(String.format("%.2f", bmi)));
        if(bmi < 18.5){
            System.out.println("You are underweight" +
                    ". You should see your doctor.");
        }
        else if(bmi > 25){
            System.out.println("You are overweight. " +
                    "You should see your doctor.");
        }
        else{
            System.out.println("You are within the ideal weight range.");
        }

    }
}
