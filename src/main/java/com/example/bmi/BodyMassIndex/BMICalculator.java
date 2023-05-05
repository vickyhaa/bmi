package com.example.bmi.BodyMassIndex;


public class BMICalculator {

    public double calculateBMI(double weight, double height) {

        double result =  weight / (height * height);
        System.out.printf("BMI: %.2f\n", result);
        return result;
    }

}
