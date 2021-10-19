import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = null;

        for (int i = 1; !StdIn.isEmpty(); i++) {
            String word = StdIn.readString();
            if (i == 1) {
                champion = word;
                continue;
            }

            if (StdRandom.bernoulli(1.0 / (double) i)) {
                champion = word;
            }
        }
        StdOut.println(champion);
    }
}