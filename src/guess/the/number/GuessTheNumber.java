/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guess.the.number;

import java.util.Scanner;

/**
 *
 * @author Frebby
 */
public class GuessTheNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int trials = 3;
        int score = 0;
        while (trials > 0) {
            int guess = scanner.nextInt();

            int random = (int) (Math.random() * 3 + 1);

            if (guess == random) {

                System.out.println("Guessed correctly! Your input was " + guess
                        + " and random number is " + random);
                ++score;
                trials = 3;
            } else {
                System.out.println("Guessed incorrectly! Your input was " + guess
                        + " and random number is " + random);
            }
            --trials;
            System.out.println(trials + " trials left");
        }
    }

}
