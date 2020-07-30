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
        initBowlingGamePouredNum(0, 20);

        int score = bowlingGame.score();

        Assert.assertEquals(0, score);
    }

    @Test
    public void should_return_correct_score_when_scoring_given_every_roll_is_3() {
        initBowlingGamePouredNum(3, 20);

        int score = bowlingGame.score();

        Assert.assertEquals(60, score);
    }

    @Test
    public void should_return_correct_score_when_scoring_given_rolls_contains_a_strike() {
        bowlingGame.roll(10);
        initBowlingGamePouredNum(3, 18);

        int score = bowlingGame.score();

        Assert.assertEquals(70, score);
    }

    @Test
    public void should_return_correct_score_when_scoring_given_rolls_contains_a_spare() {
        bowlingGame.roll(4);
        bowlingGame.roll(6);
        initBowlingGamePouredNum(3, 18);

        int score = bowlingGame.score();

        Assert.assertEquals(67, score);
    }

    private void initBowlingGamePouredNum(int pouredNumber, int index) {
        for (int rollIndex = 0; rollIndex < index; rollIndex++) {
            bowlingGame.roll(pouredNumber);
        }
    }
}
