package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Weight (lb) / Height (in)^2 * 703 calculation for BMI

        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double weight = input.nextDouble();

        System.out.println("Enter height in feet -- (inches entered next)");
        int heightFeet = input.nextInt();

        System.out.println("Enter inches: ");
        int inches = input.nextInt();

        int totalHeightInches = (heightFeet * 12) + inches;

        double bmi = weight/ Math.pow(totalHeightInches, 2) * 703;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Your BMI is " + df.format(bmi));

        if(bmi < 15){
            System.out.println("You are very severely underweight");
        } else if(bmi >= 15 && bmi <=16){
            System.out.println("You are severely underweight");
        } else if(bmi >=16 && bmi <= 18.5){
            System.out.println("You are underweight");
        } else if(bmi > 18.5 && bmi <= 25){
            System.out.println("You are normal, healthy weight");
        } else if(bmi > 25 && bmi <= 30){
            System.out.println("You are overweight");
        } else if(bmi > 30 && bmi <= 35){
            System.out.println("You are moderately obese");
        } else if(bmi > 35 && bmi <=40){
            System.out.println("You are severely obese");
        } else{
            System.out.println("You are extremely obese");
        }
        //Other considerations F vs M, Unit Conversions with feet or metric, could I import a text file with BMI chart && USER friendly GUI
    }
}