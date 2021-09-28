package ex33;

import java.util.Scanner;
import java.util.Random;

public class MagicEightBall {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] responses = {"Yes","No","Maybe","Ask again later"};
        Random random = new Random();

        //get question
        System.out.println("What's your question?");
        String question = sc.nextLine();//get the question

        int randomResponseIndex = random.nextInt(responses.length);
        String response = responses[randomResponseIndex];

        System.out.println();
        System.out.println(response);//print the response
        System.out.println();
    }

}
