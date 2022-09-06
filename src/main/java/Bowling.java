public class Bowling {

    public int calculateGameScore(String gameScore) {
        return 0;
    }

    public int scoreCalculus(String pins) {
        String[] frame = pins.split("");
        int sum = 0;
        for( String number : frame ){
            if (number.equals("X")) {
                return 10;
            }
            if (number.equals("-"))
                continue;
            sum += Integer.parseInt(number);
        }

        return sum;
    }
}
