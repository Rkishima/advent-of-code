package adventofcode;

import org.example.adventofcode.CaloriesElfCarrySolution;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;

public class CaloriesElfCarrySolutionTest {

    CaloriesElfCarrySolution caloriesElfCarrySolution = new CaloriesElfCarrySolution();

    @Test
    public void howMuchCaloriesElfCarrying() throws IOException {
        System.out.println(caloriesElfCarrySolution.readCaloriesAndCount());
    }

    @Test
    public void howMuchCaloriesTheTopThreeElfCarrying() throws IOException {
        System.out.println(caloriesElfCarrySolution.topThreeElf());
    }
}
