package adventofcode;

import org.example.adventofcode.RockPaperScissorsTournament;
import org.junit.Test;

import java.io.IOException;

public class RockPaperScissorsTournamentTest {

    RockPaperScissorsTournament rockPaperScissorsTournament = new RockPaperScissorsTournament();

    @Test
    public void howManyPointsIWon() throws IOException {
        rockPaperScissorsTournament.readVictoriesAndCount();
    }
}
