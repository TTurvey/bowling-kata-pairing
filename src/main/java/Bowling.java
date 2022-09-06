public class Bowling {

    public int calculateGameScore(String gameScore) {
        return 0;
    }

    public int scoreCalculus(String pins) {
        if (pins.equals("-"))
            return 0;

        return Integer.parseInt(pins);
    }
}
