package org.example.adventofcode;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RucksackReorganization {
    public void sumOfThePriorities() throws IOException {
        int totalScore = 0;
        File file = new File("D:\\Minhas coisas\\PROGRAMAÇÃO\\adventofcode\\rucksackReorganization.txt");
        Scanner fileScanner = new Scanner(new File(file.toURI()));

        while (fileScanner.hasNext()) {
            String rucksack = fileScanner.nextLine();
            String firstPack = StringUtils.left(rucksack, rucksack.length() / 2);
            String secondPack = StringUtils.right(rucksack, rucksack.length() / 2);

            char[] charObjectArray1 = firstPack.toCharArray();
            char[] charObjectArray2 = secondPack.toCharArray();
            Character[] firstPackCharacters = ArrayUtils.toObject(charObjectArray1);
            Character[] secondPackCharacters = ArrayUtils.toObject(charObjectArray2);

            for (int letterOfFirstPack = 1; letterOfFirstPack < firstPackCharacters.length; letterOfFirstPack++){
                for (int letterOfSecondPack = 1; letterOfSecondPack < firstPackCharacters.length; letterOfSecondPack++){
                    if (firstPackCharacters[letterOfFirstPack].equals(secondPackCharacters[letterOfSecondPack])){
                        System.out.println(firstPackCharacters[letterOfFirstPack] + " is equals " +secondPackCharacters[letterOfSecondPack]);
                        calculateprioritie(firstPackCharacters[letterOfFirstPack]);
                    }
                }
            }
        }
        fileScanner.close();
    }

    public int calculateprioritie(Character character){

        return -1;
    }
}
