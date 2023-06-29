package org.example;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Weight (lb) / Height (in)^2 * 703 calculation for BMI
        Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        double BMI =0.00;
        double totalHeight= 0.00;
        double totalWeight = 0.00;
        int userChoice = 0;

        do{

            System.out.println("------------------------------------------");
            System.out.println("|   welcome to the BMI calculator        |");
            System.out.println("|   TO begin please make choice below    |");
            System.out.println("|                ^_^                     |");
            System.out.println("------------------------------------------");

            System.out.println("Are you Male or Female? (1)Male || (2)Female: ");
            int gender = input.nextInt();

            System.out.println("What unit of measurement would you like? (1)lbs || (2)kilos ");
            int typeOfWeight = input.nextInt();
            switch (typeOfWeight){
                case 1:
                    System.out.println("Enter your weight in lbs:");
                    totalWeight = input.nextDouble();
                    break;

                case 2:
                    System.out.println("Enter your weight in kilos");
                    double weightKilos = input.nextDouble();
                    totalWeight = weightKilos * 2.2;
                    break;
            }

            System.out.println("What format would you like to input height in? (1)feet/inches || (2)inches|| (3)meters");
            int typeOfHeight = input.nextInt();
            switch (typeOfHeight){
                case 1:
                    System.out.println("Enter height in feet -- (inches entered next)");
                    int heightFeet = input.nextInt();
                    System.out.println("Enter inches");
                    int inches = input.nextInt();
                    totalHeight = (heightFeet * 12) + inches;
                    break;

                case 2:
                    System.out.println("Enter height in Inches:");
                    totalHeight = input.nextInt();
                    break;

                case 3:
                    System.out.println("Enter height in Meters:");
                    double heightMeter = input.nextDouble();
                    totalHeight = heightMeter * 0.0254;
                    break;
            }
            if(gender == 1) {
                BMI = totalWeight / Math.pow(totalHeight, 2) * 703;
                System.out.println("Your BMI is " + df.format(BMI));
                if(BMI < 15){
                    System.out.println("You are very severely underweight");
                } else if(BMI >= 15 && BMI <=16){
                    System.out.println("You are severely underweight");
                } else if(BMI >=16 && BMI <= 18.5){
                    System.out.println("You are underweight");
                } else if(BMI > 18.5 && BMI <= 25){
                    System.out.println("You are normal, healthy weight");
                } else if(BMI > 25 && BMI <= 30){
                    System.out.println("You are overweight");
                } else if(BMI > 30 && BMI <= 35){
                    System.out.println("You are moderately obese");
                } else if(BMI > 35 && BMI <=40){
                     System.out.println("You are severely obese");
                } else{
                     System.out.println("You are extremely obese");
                }

            }else if(gender == 2){
                BMI = totalWeight / Math.pow(totalHeight, 2) * 703;
                System.out.println("Your BMI is " + df.format(BMI));
                if(BMI < 15){
                    System.out.println("You are very severely underweight");
                } else if(BMI >= 15 && BMI <=16){
                    System.out.println("You are severely underweight");
                } else if(BMI >=16 && BMI <= 18.5){
                    System.out.println("You are underweight");
                } else if(BMI > 18.5 && BMI <= 25){
                    System.out.println("You are normal, healthy weight");
                } else if(BMI > 25 && BMI <= 30){
                    System.out.println("You are overweight");
                } else if(BMI > 30 && BMI <= 35){
                    System.out.println("You are moderately obese");
                } else if(BMI > 35 && BMI <=40){
                    System.out.println("You are severely obese");
                } else{
                    System.out.println("You are extremely obese");
                }
            }
            System.out.println("");
            System.out.println("Thank you ^_^         ");
            System.out.println("Choose (1) to restart ");
            System.out.println("Choose (2) to exit    ");
            userChoice = input.nextInt();

        }while(userChoice != 2);




//        double bmi = weight/ Math.pow(totalHeightInches, 2) * 703;
//        DecimalFormat df = new DecimalFormat("0.00");
//        System.out.println("Your BMI is " + df.format(bmi));
//
//        if(bmi < 15){
//            System.out.println("You are very severely underweight");
//        } else if(bmi >= 15 && bmi <=16){
//            System.out.println("You are severely underweight");
//        } else if(bmi >=16 && bmi <= 18.5){
//            System.out.println("You are underweight");
//        } else if(bmi > 18.5 && bmi <= 25){
//            System.out.println("You are normal, healthy weight");
//        } else if(bmi > 25 && bmi <= 30){
//            System.out.println("You are overweight");
//        } else if(bmi > 30 && bmi <= 35){
//            System.out.println("You are moderately obese");
//        } else if(bmi > 35 && bmi <=40){
//            System.out.println("You are severely obese");
//        } else{
//            System.out.println("You are extremely obese");
//        }
        //Other considerations F vs M, Unit Conversions with feet or metric, could I import a text file with BMI chart && USER friendly GUI
    }
}