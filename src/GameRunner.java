import java.util.Scanner;

public class GameRunner {
    Methods method = new Methods();
    Ending end = new Ending();
    Scanner kyx = new Scanner(System.in);
    double totalTips = 0.00;
    int successCount = 0;

    public void printLines(String [] lines) throws InterruptedException  {
        for (int x = 0; x < lines.length; x++) {
            System.out.println(lines[x]);
            System.out.println();
            Thread.sleep(2000);
        }
    }

    public void printChoices(String [] userResponse) throws InterruptedException {
        for (int x = 1; x <= userResponse.length; x ++) {
            System.out.println(x + ") " + userResponse[x - 1]);
            Thread.sleep(2000);
        }
    }

    public int validateResponses(String [] userResponse) throws InterruptedException {
        System.out.println("---------------------------------------------------------------------------------------------");
        while (true) {
            System.out.print("Enter the number of your chosen response (1, 2, or 3): ");
            try {
                int userInput = Integer.parseInt(kyx.nextLine());
                if (userInput == 1 || userInput == 2 || userInput == 3) {
                    System.out.println("---------------------------------------------------------------------------------------------");
                    System.out.println();
                    Thread.sleep(2000);
                    System.out.println("You: " + method.getResponse(userResponse, userInput - 1));
                    return userInput;
                }
                else {
                    System.out.println("Invalid response. Please enter 1, 2 or 3.");
                    System.out.println();
                    Thread.sleep(2000);
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid response. Please enter 1, 2 or 3.");
                System.out.println();
                Thread.sleep(2000);
            }
        }
    }

    public void askQuestion(String characterLine, String [] userResponses, String [] characterResponses) throws InterruptedException{
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println();
        Thread.sleep(2000);
        System.out.println(characterLine);
        System.out.println();
        Thread.sleep(2000);
        System.out.println("---------------------------------------------------------------------------------------------");
        Thread.sleep(2000);
        printChoices(userResponses);
        Thread.sleep(2000);
        int userInput = validateResponses(userResponses);
        System.out.println();
        Thread.sleep(2000);
        System.out.println(method.getResponse(characterResponses, userInput - 1));
    }

    public void askQuestion(String [] characterLine, String [] userResponses, String [][] characterResponses) throws InterruptedException{
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println();
        Thread.sleep(2000);
        printLines(characterLine);
        System.out.println("---------------------------------------------------------------------------------------------");
        Thread.sleep(2000);
        printChoices(userResponses);
        Thread.sleep(2000);
        int userInput = validateResponses(userResponses);
        System.out.println();
        Thread.sleep(2000);
        System.out.println(method.randomResponse(characterResponses[userInput - 1]));
        System.out.println();
        Thread.sleep(2000);
    }

    public void tips(int index) throws InterruptedException {
        double tips = 0;
        if (index != 0) {
            tips = (Math.random() * 10) + 1;
            tips = Math.round(tips * 100.0) / 100.0;
            successCount ++;
        }
        totalTips += tips;
        System.out.println("The customer tipped you $" + tips + ". Your made $" + totalTips + " in tips today. ");
        System.out.println();
        Thread.sleep(2000);
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println();
        Thread.sleep(2000);
    }


    public void randomOutcome(String [] outcomes, String [][] customerOutcomes) throws InterruptedException{
        String outcome = method.randomResponse(outcomes);
        System.out.println(outcome);
        System.out.println();
        Thread.sleep(2000);
        int index = -1;
        for (int x = 0; x < outcomes.length - 1; x ++) {
            if (outcome.equals(outcomes[x])) {
                index = x;
            }
        }
        if (index == 0) {
            printLines(customerOutcomes[0]);
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.println();
            Thread.sleep(2000);
            System.out.println("You walked back to where Max and Caroline was standing.");
            System.out.println();
            Thread.sleep(2000);
            System.out.println("Caroline : " + method.randomResponse(method.carolineEncouragements[0]));
        }
        else {
            printLines(customerOutcomes[method.random1Or2()]);
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.println();
            Thread.sleep(2000);
            System.out.println("You walked back to where Max and Caroline was standing.");
            System.out.println();
            Thread.sleep(2000);
            System.out.println("Caroline : " + method.randomResponse(method.carolineEncouragements[1]));
        }
        System.out.println();
        Thread.sleep(2000);
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println();
        Thread.sleep(2000);
        tips(index);
    }

    public void clockOut() throws InterruptedException{
        System.out.println("Congratulations! You have finished your first shift at the diner!");
        System.out.println();
        Thread.sleep(2000);
        if (successCount == 0 || successCount == 1) {
            printLines(end.bad);
        }
        else if (successCount == 2 || successCount == 3) {
            printLines(end.mid);
        }
        else {
            printLines(end.perfect);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Intro intro = new Intro();
        GameRunner runner = new GameRunner();
        TableOne tableOne = new TableOne();
        TableTwo tableTwo = new TableTwo();
        TableThree tableThree = new TableThree();
        TableFour tableFour = new TableFour();
        TableFive tableFive = new TableFive();

        runner.printLines(intro.setScene);
        runner.askQuestion(intro.introSelections[0], intro.userIntroLines[0], intro.maxResponses[0]);
        System.out.println();
        runner.printLines(intro.setLines);
        runner.askQuestion(intro.introSelections[1], intro.userIntroLines[1], intro.olegResponses[0]);

        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println();
        runner.printLines(tableOne.introduction);
        runner.askQuestion(tableOne.customerSetLines, tableOne.userResponses[0], tableOne.maxLines);
        runner.randomOutcome(tableOne.outcomes, tableOne.customerOutcome);

        runner.printLines(tableTwo.introduction);
        runner.askQuestion(tableTwo.customerSetLines, tableTwo.userResponses[0], tableTwo.maxLines);
        runner.randomOutcome(tableTwo.outcomes, tableTwo.customerOutcome);

        runner.printLines(tableThree.introduction);
        runner.askQuestion(tableThree.customerSetLines, tableThree.userResponses[0], tableThree.maxLines);
        runner.randomOutcome(tableThree.outcomes, tableThree.customerOutcome);

        runner.printLines(tableFour.introduction);
        runner.askQuestion(tableFour.customerSetLines, tableFour.userResponses[0], tableFour.maxLines);
        runner.randomOutcome(tableFour.outcomes, tableFour.customerOutcome);

        runner.printLines(tableFive.introduction);
        runner.askQuestion(tableFive.customerSetLines, tableFive.userResponses[0], tableFive.maxLines);
        runner.randomOutcome(tableFive.outcomes, tableFive.customerOutcome);

        runner.clockOut();
    }
}
