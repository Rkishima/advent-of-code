package org.example.adventofcode;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

public class RucksackReorganization {
    Map<Character, Integer> alphabeticMap;
    Character[] alphabetic = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
            't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public RucksackReorganization() {
        alphabeticMap = new HashMap<>();
        for (int i = 0; i < alphabetic.length; i++) {
            alphabeticMap.put(alphabetic[i], i + 1);
        }
    }


    public void sumOfThePriorities() throws IOException, URISyntaxException {
        int totalScore = 0;
//        File file = new File("D:\\Minhas coisas\\PROGRAMAÇÃO\\adventofcode\\rucksackReorganization.txt");
        URL url = ClassLoader.getSystemResource("rucksackReorganization.txt");
        Scanner fileScanner = new Scanner(new File(url.toURI()));

        while (fileScanner.hasNext()) {
            String rucksack = fileScanner.nextLine();
            String firstPack = StringUtils.left(rucksack, rucksack.length() / 2);
            String secondPack = StringUtils.right(rucksack, rucksack.length() / 2);

            char[] charObjectArray1 = firstPack.toCharArray();
            char[] charObjectArray2 = secondPack.toCharArray();
            Character[] firstPackCharacters = ArrayUtils.toObject(charObjectArray1);
            Character[] secondPackCharacters = ArrayUtils.toObject(charObjectArray2);

            Optional<Character> matchChar = Arrays.stream(firstPackCharacters)
                    .filter(new HashSet<>(List.of((secondPackCharacters)))::contains).findFirst();

            System.out.println(matchChar);

            totalScore += alphabeticMap.get(matchChar.get());
        }

        fileScanner.close();
    }

    public void sumOfTheGroupPriorities() throws IOException, URISyntaxException {
        int totalScore = 0;
        URL url = ClassLoader.getSystemResource("rucksackReorganization.txt");
        Scanner fileScanner = new Scanner(new File(url.toURI()));

        while (fileScanner.hasNext()) {
            String firstRucksack = fileScanner.nextLine();
            String secondRucksack = fileScanner.nextLine();
            String thirdRuckSack = fileScanner.nextLine();

            char[] charObjectArray1 = firstRucksack.toCharArray();
            char[] charObjectArray2 = secondRucksack.toCharArray();
            char[] charObjectArray3 = thirdRuckSack.toCharArray();
            Character[] firstPackCharacters = ArrayUtils.toObject(charObjectArray1);
            Character[] secondPackCharacters = ArrayUtils.toObject(charObjectArray2);
            Character[] thirdPackCharacter = ArrayUtils.toObject(charObjectArray3);

            Optional<Character> matchChar = Arrays.stream(firstPackCharacters)
                    .filter(new HashSet<>(List.of((secondPackCharacters)))::contains)
                    .filter(new HashSet<>(List.of(thirdPackCharacter))::contains).findFirst();

            totalScore += alphabeticMap.get(matchChar.get());
        }
        fileScanner.close();
        System.out.println(totalScore);
    }
}


//v
//l
//r