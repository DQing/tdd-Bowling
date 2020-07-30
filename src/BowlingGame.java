import java.util.ArrayList;

public class BowlingGame {
    ArrayList<Integer> pouredNumbers = new ArrayList<>();

    public void roll(int pouredNumber) {
        pouredNumbers.add(pouredNumber);
    }

    public int score() {
        return pouredNumbers.stream().mapToInt(num -> num).sum();
    }
}
