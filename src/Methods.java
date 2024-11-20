import java.util.Scanner;
public class Methods {
    Scanner kyx = new Scanner(System.in);
    public int userInput;
    public String enterSelection = "Enter the number of your chosen response (1, 2 or 3): ";
    public String userGreetingCustomer = "You: Hey guys! What can I get you?\n\n";

    public String [][] carolineEncouragements = {
            {
                "Okay you messed up, but look at it this way -- rock bottom means there's no way but up!",
                "Everyone stumbles their first time, just make sure you stumble fabulously." ,
                "Mistakes are just lessons wrapped in bad decisions. Unwrap and move on!",
                "You're here to learn, not to be perfect. Well, unless you're me --- kidding!",
                "At least you didn't burn the place down. Baby steps!"
            },
            {
                "See? A little effort and a lot of charm go a long way!",
                "You made someone's day --- and probably saved mine. You're a star!",
                "I'm calling it now: employee of the month is so within your reach.",
                "That was smooth! Are you sure this is your first day?",
                "You keep this up, and you'll be running the place in no time. "
            }
    };

    public String randomResponse(String[][] lines, int questionNum, int indexNum) {
        int x = (int) (Math.random() * (indexNum + 1));
        return lines[questionNum][x];
    }

    public String getUserChoice(String [][] choices, int questionNum) {
        userInput = kyx.nextInt();
        userInput --;
        return choices[questionNum][userInput];
    }

    public String getCharacterResponse(String [][] responses, int questionNum) {
        return responses[questionNum][userInput];
    }

    public String listChoices(String [][] possibleResponses, int questionIndex) {
        String temp = "";
        for (int x = 0; x < possibleResponses[questionIndex].length; x++) {
            temp += (x + 1) + ") " + possibleResponses[questionIndex][x] + "\n";
        }
        return temp;
    }
}
