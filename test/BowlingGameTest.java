import org.junit.Assert;
import org.junit.Test;

public class BowlingGameTest {
    @Test
    public void should_return_0_when_scoring_given_every_roll_is_0() {
        BowlingGame bowlingGame = new BowlingGame();
        for (int rollIndex = 0; rollIndex < 20; rollIndex++) {
            bowlingGame.roll(0);
        }

        int score = bowlingGame.score();

        Assert.assertEquals(0, score);
    }
}
