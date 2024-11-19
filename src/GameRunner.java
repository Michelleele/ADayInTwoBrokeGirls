import java.util.Scanner;
public class GameRunner {
    Intro intro = new Intro();
    Methods method = new Methods();
    public void makeAndPrintSetSelection(String [][] userLines, String characterName, String [][] characterResponses, int eventNum) {
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println(method.listChoices(userLines, eventNum));
        System.out.print(method.enterSelection);
        System.out.println("---------------------------------------------------------------------------------------------\n\nYou: " + method.getUserChoice(userLines, eventNum));
        System.out.println();
        //Thread.sleep(2000);
        System.out.println(characterName + method.getCharacterResponse(characterResponses, eventNum));
        System.out.println();
    }

    public void printLines(String [] lines) {
        for (int x = 0; x < lines.length; x++) {
            System.out.println(lines[x]);
            System.out.println();
            //Thread.sleep(2000)
        }
    }

    public void acts(int actNum, String [] customerSetLines, int problemNum, String [][] userResponses, String [][] chararcterResponse) {
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("\nAct " + actNum + ": \n");
        System.out.println(method.userGreetingCustomer);
        printLines(customerSetLines);
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println(method.listChoices(userResponses, 0));
        System.out.println(method.enterSelection);
        System.out.println("---------------------------------------------------------------------------------------------\n\nYou: " + method.getUserChoice(userResponses, problemNum));
        System.out.println();
        for (int x = 1; x >= userResponses.length; x++) {
            if (method.userInput == x - 1) {
                System.out.println(method.randomResponse(chararcterResponse, x - 1, 1));
                System.out.println();
                //Thread.sleep(2000);
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Scanner kyx = new Scanner(System.in);
        Methods method = new Methods();
        Intro intro = new Intro();
        GameRunner runner = new GameRunner();
        ActOne actOne = new ActOne();

        runner.printLines(intro.setScene);
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println(intro.introSelections[0]);
        runner.makeAndPrintSetSelection(intro.userIntroLines, "Max: ", intro.maxResponses, 0);
        runner.printLines(intro.setLines);
        System.out.println(intro.introSelections[1]);
        runner.makeAndPrintSetSelection(intro.userIntroLines, "Oleg: ", intro.olegResponses, 1);

        runner.printLines(actOne.introduction);
        runner.acts(1, actOne.customerSetLines, 0, actOne.userResponses, actOne.maxLines);


    }
}
