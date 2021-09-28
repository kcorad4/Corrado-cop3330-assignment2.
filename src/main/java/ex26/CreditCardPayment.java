package ex26;

import java.util.*;
import java.math.*;

public class CreditCardPayment {

    public static double timeToPayOff(int b, double apr, int p)
    {
        apr = apr / 365;

        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + b / p * (1 - Math.pow(1 + apr, 30))) / Math.log(1 + apr));

    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //get data
        System.out.println("what is your balance?:");
        int b = sc.nextInt();
        System.out.println("what is the APR on your card? (as a percent):");
        double apr = sc.nextDouble();

        apr = apr/100;

        System.out.println("what is the monthly payment you can make?:");
        int p = sc.nextInt();


        double months = timeToPayOff(b, apr, p);

        System.out.println("it will take you " + months +" months to pay off");



    }//end main




}//end class
