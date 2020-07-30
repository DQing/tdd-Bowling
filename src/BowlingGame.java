import java.util.ArrayList;

public class BowlingGame {
    ArrayList<Integer> pouredNumbers = new ArrayList<>();

    public void roll(int pouredNumber) {
        pouredNumbers.add(pouredNumber);
    }

    public int score() {
        int score = 0;
        int rollIndex = 0;
        for (int roll = 0; roll < 10; roll++) {

            if (isStrike(rollIndex)) {
                score = getStrikeScore(score, rollIndex);
                rollIndex++;
            } else if (isSpare(rollIndex)) {
                score = getSpareScore(score, rollIndex);
                rollIndex += 2;
            } else {
                score += pouredNumbers.get(rollIndex);
                score += pouredNumbers.get(rollIndex + 1);
                rollIndex += 2;
            }
        }
        return score;
    }

    private int getSpareScore(int score, int rollIndex) {
        score += 10;
        score += pouredNumbers.get(rollIndex + 2);
        return score;
    }

    private boolean isSpare(int rollIndex) {
        return pouredNumbers.get(rollIndex) + pouredNumbers.get(rollIndex + 1) == 10;
    }

    private int getStrikeScore(int score, int rollIndex) {
        score += 10;
        score += pouredNumbers.get(rollIndex + 1);
        score += pouredNumbers.get(rollIndex + 2);
        return score;
    }

    private boolean isStrike(int rollIndex) {
        return pouredNumbers.get(rollIndex) == 10;
    }
}
