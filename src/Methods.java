import java.util.Scanner;
public class Methods {
    Scanner kyx = new Scanner(System.in);
    int userInput;

    public String getSetLine(String [] lines, int indexNum) {
        return lines[indexNum];
    }

    public String randomResponse(String[][] lines, int questionNum, int numOfChoices) {
        int x = (int) (Math.random() * (numOfChoices + 1));
        return lines[questionNum][x];
    }

    public String getUserChoice(String [][] choices, int questionNum) {
        userInput = kyx.nextInt();
        userInput --;
        return choices[questionNum][userInput];
    }

    public String getCharacterResponse(String [] responses) {
        return responses[userInput];
    }

    public String listChoices(String [][] possibleResponses, int questionIndex) {
        String temp = "";
        for (int x = 0; x < possibleResponses[questionIndex].length; x++) {
            temp += (x + 1) + ") " + possibleResponses[questionIndex][x] + "\n";
        }
        return temp;
    }
}
