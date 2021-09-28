package ex29;

import java.util.Scanner;

public class HandlingBadInput {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        while(true)
        {
            try
            {
                System.out.print("What is the rate of return? "); //ask interest rate
                int r=Integer.parseInt(sc.next()); //read r
                System.out.println("It will take "+(72/r)+" years to double your initial investment.");
                flag=true; //if exception not raised,set flag to true
            }
            catch(NumberFormatException e) //catch invalid number exception
            {
                System.out.println("Sorry. That's not a valid input");
            }
            catch(ArithmeticException e) //catch division by error exception
            {
                System.out.println("Sorry. That's not a valid input");
            }
            if(flag) //if exception not raised
            {
                break;
            }

        }
    }



}
