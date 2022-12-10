package adventofcode;

import org.example.adventofcode.RucksackReorganization;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

public class RucksackReorganizationTest {
    RucksackReorganization rucksackReorganization = new RucksackReorganization();

    @Test
    public void sumOfThePriorities() throws IOException, URISyntaxException {
        rucksackReorganization.sumOfThePriorities();
    }

    @Test public void sumOfTheGroupPriorities() throws IOException, URISyntaxException {
        rucksackReorganization.sumOfTheGroupPriorities();
    }
}
