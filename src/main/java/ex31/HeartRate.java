package ex31;

import java.util.Scanner;

public class HeartRate {

    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc=new Scanner(System.in);

        int restingHR,age;
        System.out.println("What is the resting heart rate?:");
        restingHR = sc.nextInt();
        System.out.println("What is the age?:");
        age = sc.nextInt();

        System.out.println("Resting Pulse: " + restingHR + " Age: " + age);

        double intensity = 55;
        System.out.println("Intensity | Rate ");
        System.out.println("------------------------");

        while(intensity<96)
        {
            double Target = (((220 - age) - restingHR) * (intensity/100) + restingHR);
            System.out.println(intensity+"% | "+Target +"bpm");
            intensity+=5;
        }

    }//end main

}//end class
