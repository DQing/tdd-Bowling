import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {
    private BowlingGame bowlingGame;

    @Before
    public void setup() {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void should_return_0_when_scoring_given_every_roll_is_0() {
        initBowlingGamePouredNum(0);

        int score = bowlingGame.score();

        Assert.assertEquals(0, score);
    }

    @Test
    public void should_return_correct_score_when_scoring_given_every_roll_is_3() {
        initBowlingGamePouredNum(3);

        int score = bowlingGame.score();

        Assert.assertEquals(60, score);
    }

    private void initBowlingGamePouredNum(int pouredNumber) {
        for (int rollIndex = 0; rollIndex < 20; rollIndex++) {
            bowlingGame.roll(pouredNumber);
        }
    }
}
