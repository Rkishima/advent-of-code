package org.example.adventofcode;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RockPaperScissorsTournament {
    /*
    A = pedra
    B = papel
    C = tesoura

    X = pedra
    Y = papel
    Z = tesoura
     */

    public int gameStrategy1(String game) throws IOException {
        int score = 0;
        if (game.equals("A X")) {
//            System.out.println("Draw with rock");
            return score = 3 + 1;
        } else if (game.equals("A Y")) {
//            System.out.println("Win with paper");
            return score = 6 + 2;
        } else if (game.equals("A Z")) {
//            System.out.println("Lost with scissors");
            return score = 0 + 3;
        } else if (game.equals("B X")) {
//            System.out.println("Lost with rock");
            return score = 0 + 1;
        } else if (game.equals("B Y")) {
//            System.out.println("Draw with paper");
            return score = 3 + 2;
        } else if (game.equals("B Z")) {
//            System.out.println("Win with scissors");
            return score = 6 + 3;
        } else if (game.equals("C X")) {
//            System.out.println("Win with rock");
            return score = 6 + 1;
        } else if (game.equals("C Y")) {
//            System.out.println("Lost with paper");
            return score = 0 + 2;
        } else if (game.equals("C Z")) {
//            System.out.println("Draw with scissors");
            return score = 3 + 3;
        }
        return score;
    }

    public int gameStrategy2(String game) throws IOException {
        int score = 0;
        if (game.equals("A X")) {
//            System.out.println("Need to lose against rock");
            return score = 0 + 3;
        } else if (game.equals("A Y")) {
//            System.out.println("Need to draw against rock");
            return score = 3 + 1;
        } else if (game.equals("A Z")) {
//            System.out.println("Need to win against rock");
            return score = 6 + 2;
        } else if (game.equals("B X")) {
//            System.out.println("Need to lose against paper");
            return score = 0 + 1;
        } else if (game.equals("B Y")) {
//            System.out.println("Need to draw against paper");
            return score = 3 + 2;
        } else if (game.equals("B Z")) {
//            System.out.println("Need to win against paper");
            return score = 6 + 3;
        } else if (game.equals("C X")) {
//            System.out.println("Need to lose against scissors");
            return score = 0 + 2;
        } else if (game.equals("C Y")) {
//            System.out.println("Need to draw against scissors");
            return score = 3 + 3;
        } else if (game.equals("C Z")) {
//            System.out.println("Need to win against scissors");
            return score = 6 + 1;
        }
        return score;
    }


    public void readVictoriesAndCount() throws IOException {
        int totalScore = 0;
        File file = new File("D:\\Minhas coisas\\PROGRAMAÇÃO\\adventofcode\\inputRockPaperScissorsTournament.txt");
        Scanner fileScanner = new Scanner(new File(file.toURI()));

        while (fileScanner.hasNext()) {
            String game = fileScanner.nextLine();
            totalScore += (gameStrategy2(game));
        }
        fileScanner.close();
        System.out.println(totalScore);
    }
}
