public class Bowling {

    public int calculateGameScore(String gameScore) {
        return 0;
    }

    public int scoreCalculus(String match) {
        String[] frames = match.split("[|]");

        int sum = 0;
        int doubler = 0;
        int nextDoubler = 0;
        for (String frame : frames) {
            String[] pins = frame.split("");

            int frameSum = 0;
            for( String number : pins ) {

                if (number.equals("X")) {
                    frameSum = 10;
                    nextDoubler = 2;
                    break;
                }
                if (number.equals("/")) {
                    frameSum = 10;
                    break;
                }
                if (number.equals("-"))
                    continue;

                if (doubler > 0) {
                    frameSum += Integer.parseInt(number) * 2;
                    doubler--;
                }
                else
                    frameSum += Integer.parseInt(number);
            }
            sum += frameSum;
            doubler = nextDoubler;
        }

        return sum;
    }
}
