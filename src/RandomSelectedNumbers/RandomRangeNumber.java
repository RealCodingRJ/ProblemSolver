package RandomSelectedNumbers;

import java.util.Random;

public class RandomRangeNumber {
    public static Random r = new Random();

    public static int Numbers(int a, int b) {
        return r.nextInt(a, b);
    }
}
