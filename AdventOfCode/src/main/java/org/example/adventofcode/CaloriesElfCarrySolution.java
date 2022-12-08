package org.example.adventofcode;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CaloriesElfCarrySolution {

    public int readCaloriesAndCount() throws IOException {
        File file = new File("D:\\Minhas coisas\\PROGRAMAÇÃO\\adventofcode\\inputCalories.txt");
        Scanner fileScanner = new Scanner(new File(file.toURI()));
        ArrayList<Integer> sumList = new ArrayList<Integer>();
        Integer sum = 0;

        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            if (line.equals("")){
                sumList.add(sum);
                sum = 0;
            }

            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNext()) {
                String calories = lineScanner.next();
                int num = Integer.parseInt(calories);
                sum += num;
            }
            lineScanner.close();
        }
        sumList.add(sum);
        fileScanner.close();

        return Collections.max(sumList);
    }

    public int topThreeElf() throws IOException {
        File file = new File("D:\\Minhas coisas\\PROGRAMAÇÃO\\adventofcode\\inputCalories.txt");
        Scanner fileScanner = new Scanner(new File(file.toURI()));
        ArrayList<Integer> sumList = new ArrayList<Integer>();
        Integer sum = 0;

        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            if (line.equals("")){
                sumList.add(sum);
                sum = 0;
            }

            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNext()) {
                String calories = lineScanner.next();
                int num = Integer.parseInt(calories);
                sum += num;
            }
            lineScanner.close();
        }
        sumList.add(sum);
        fileScanner.close();

        int sumOfTop3=0;
        for (int i=0; i < 3;i++){
            int topElfCalories = Collections.max(sumList);
            sumOfTop3 += topElfCalories;
            sumList.removeAll(Collections.singleton(Collections.max(sumList)));
        }

        return sumOfTop3;
    }
}
