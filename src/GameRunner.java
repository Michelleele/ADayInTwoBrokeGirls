
public class GameRunner {
    Methods method = new Methods();
    TipJar tipsJar = new TipJar();
    public int successCount = 0;

    public void makeAndPrintSetSelection(String [][] userLines, String characterName, String [][] characterResponses, int eventNum) throws InterruptedException  {
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println(method.listChoices(userLines, eventNum));
        System.out.print(method.enterSelection);
        System.out.println("---------------------------------------------------------------------------------------------\n\nYou: " + method.getUserChoice(userLines, eventNum));
        System.out.println();
        Thread.sleep(2000);
        System.out.println(characterName + method.getCharacterResponse(characterResponses, eventNum));
        System.out.println();
    }

    public void printLines(String [] lines) throws InterruptedException  {
        for (int x = 0; x < lines.length; x++) {
            System.out.println(lines[x]);
            System.out.println();
            Thread.sleep(2000);
        }
    }

    public void actOne(int actNum, String [] customerSetLines, int problemNum, String [][] userResponses, String [][] chararcterResponse, String [] outcomes, String [][] customerOutcome) throws InterruptedException {
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("\nTable " + actNum + ": \n");
        System.out.print(method.userGreetingCustomer);
        printLines(customerSetLines);
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println(method.listChoices(userResponses, 0));
        System.out.print(method.enterSelection);
        System.out.println("---------------------------------------------------------------------------------------------\n\nYou: " + method.getUserChoice(userResponses, problemNum));
        System.out.println();
        for (int x = 1; x >= userResponses.length; x++) {
            if (method.userInput == x - 1) {
                System.out.println(method.randomResponse(chararcterResponse, x - 1, 1));
                System.out.println();
                Thread.sleep(2000);
            }
        }
        int outcomeIndex = (int) (Math.random() * 2);
        System.out.println(outcomes[outcomeIndex]);
        System.out.println();
        Thread.sleep(2000);
        if (outcomeIndex == 0) {
            for (int x = 0; x < outcomes.length - 1; x++) {
                System.out.println(customerOutcome[0][x]);
                System.out.println();
                Thread.sleep(2000);
            }
        }
        else {
            successCount ++;
            int random = (int) (Math.random() * 2 ) + 1;
            for (int x = 0; x < outcomes.length - 1; x++) {
                System.out.println(customerOutcome[random][x]);
                System.out.println();
                Thread.sleep(2000);
            }
        }
        System.out.println("You walked back to where Caroline and Max are standing");
        System.out.println();
        Thread.sleep(2000);
        int randomInt = (int) (Math.random() * 5);
        System.out.print("Caroline: ");
        if (outcomeIndex == 0) {
            System.out.println(method.carolineEncouragements[0][randomInt]);
        }
        else {
            System.out.println(method.carolineEncouragements[1][randomInt]);
        }
        System.out.println();
        Thread.sleep(2000);
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println(tipsJar.updateTip(outcomeIndex));
        Thread.sleep(2000);
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println();
        Thread.sleep(2000);

    }

    public void actTwo(int actNum, String [] customerSetLines, int problemNum, String [][] userResponses, String [][] chararcterResponse, String [] outcomes, String [][] customerOutcome) throws InterruptedException {
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("\nTable " + actNum + ": \n");
        printLines(customerSetLines);
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println(method.listChoices(userResponses, 0));
        System.out.print(method.enterSelection);
        System.out.println("---------------------------------------------------------------------------------------------\n\nYou: " + method.getUserChoice(userResponses, problemNum));
        System.out.println();
        for (int x = 1; x >= userResponses.length; x++) {
            if (method.userInput == x - 1) {
                System.out.println(method.randomResponse(chararcterResponse, x - 1, 1));
                System.out.println();
                Thread.sleep(2000);
            }
        }
        int outcomeIndex = (int) (Math.random() * 2);
        System.out.println(outcomes[outcomeIndex]);
        System.out.println();
        Thread.sleep(2000);
        if (outcomeIndex == 0) {
            for (int x = 0; x < outcomes.length - 1; x++) {
                System.out.println(customerOutcome[0][x]);
                System.out.println();
                Thread.sleep(2000);
            }
        }
        else {
            int random = (int) (Math.random() * 2 ) + 1;
            for (int x = 0; x < outcomes.length - 1; x++) {
                System.out.println(customerOutcome[random][x]);
                System.out.println();
                Thread.sleep(2000);
            }
        }
        System.out.println("You walked back to where Caroline and Max are standing");
        System.out.println();
        Thread.sleep(2000);
        int randomInt = (int) (Math.random() * 5);
        System.out.print("Caroline: ");
        System.out.println(method.carolineEncouragements[0][randomInt]);
        System.out.println();
        Thread.sleep(2000);
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println(tipsJar.updateTip(false));
        Thread.sleep(2000);
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println();
        Thread.sleep(2000);

    }

    public static void main(String[] args) throws InterruptedException {
        Intro intro = new Intro();
        GameRunner runner = new GameRunner();
        TableOne tableOne = new TableOne();
        TableTwo tableTwo = new TableTwo();
        TableThree tableThree = new TableThree();
        TipJar tipsJar = new TipJar();
        Ending ending = new Ending();


        runner.printLines(intro.setScene);
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println(intro.introSelections[0]);
        runner.makeAndPrintSetSelection(intro.userIntroLines, "Max: ", intro.maxResponses, 0);
        runner.printLines(intro.setLines);
        System.out.println(intro.introSelections[1]);
        runner.makeAndPrintSetSelection(intro.userIntroLines, "Oleg: ", intro.olegResponses, 1);

        runner.printLines(tableOne.introduction);
        runner.actOne(1, tableOne.customerSetLines, 0, tableOne.userResponses, tableOne.maxLines, tableOne.outcomes, tableOne.customerOutcome);

        runner.printLines(tableTwo.introduction);
        runner.actTwo(2, tableTwo.customerSetLines, 0, tableTwo.userResponses, tableTwo.maxLines, tableTwo.outcomes, tableTwo.customerOutcome);

        runner.printLines(tableThree.introduction);
        runner.actOne(3, tableThree.customerSetLines, 0, tableThree.userResponses, tableThree.maxLines, tableThree.outcomes, tableThree.customerOutcome);

        System.out.println("Congratulations! You completed your first shift at the diner!");
        System.out.println();
        if (runner.successCount == 0) {
            runner.printLines(ending.bad);
        }
        else if(runner.successCount == 1) {
            runner.printLines(ending.mid);
        }
        else {
            runner.printLines(ending.perfect);
        }
    }
}
