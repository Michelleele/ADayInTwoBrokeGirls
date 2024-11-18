public class Methods {

    public String getLine(String [] lines, int indexNum) {
        return lines[indexNum];
    }

    public String getLine(String[][] lines, int indexNum, int subIndexNum) {
        return lines[indexNum][subIndexNum];
    }

    public String randomResponse(String[][] lines, int indexNum, int numOfChoices) {
        int x = (int) (Math.random() * (numOfChoices + 1));
        return lines[indexNum][x];
    }
}
