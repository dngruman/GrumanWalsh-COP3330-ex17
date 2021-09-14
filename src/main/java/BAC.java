/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Deirdre Gruman-Walsh
 */
import java.util.Scanner;

public class BAC {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int gender, ounce, weight, hr;
        float r;
        double BAC;

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        gender = user_input.nextInt();
        System.out.print("How many ounces of alcohol did you have ? ");
        ounce = user_input.nextInt();
        System.out.print("What is your weight, in pounds? ");
        weight = user_input.nextInt();
        System.out.print("How many hours has it been since yours last drink? ");
        hr = user_input.nextInt();


        if (gender == 1) {
        r = (float) 0.73;
    }
        else{
        r = (float) 0.66;
    }

    BAC = (ounce * 5.14 / weight * r) - (0.015 * hr);

        System.out.println("Your BAC is " +String.format("%.6f", BAC));
        if (BAC < 0.08) {
        System.out.println("It is legal for you to drive.");
    }
        else{
        System.out.println("It is illegal for you to drive.");
    }
}
}
