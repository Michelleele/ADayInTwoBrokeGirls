import java.util.Scanner;
public class GameRunner {
    Intro intro = new Intro();
    Methods method = new Methods();
    public void makeAndPrintSelection(String [][] events, String [][] userLines, String characterName, String [][] characterResponses, int eventNum) {
        System.out.println(events[eventNum][0]);
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

    public static void main(String[] args) throws InterruptedException {
        Scanner kyx = new Scanner(System.in);
        Methods method = new Methods();
        Intro intro = new Intro();
        GameRunner runner = new GameRunner();

        for (int x = 0; x < intro.setScene.length; x ++) {
            System.out.println(intro.setScene[x]);
            //Thread.sleep(2000);
        }
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println();

        runner.makeAndPrintSelection(intro.introEvents, intro.userIntroLines, "Max: ", intro.maxResponses, 0);
        for (int x = 0; x < intro.setLines.length; x++) {
            System.out.println(intro.setLines[x]);
            System.out.println();
            //Thread.sleep(2000);
        }
        runner.makeAndPrintSelection(intro.introEvents,intro.userIntroLines, "Oleg: ", intro.olegResponses, 1);

    }
}
