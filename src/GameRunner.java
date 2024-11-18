import java.util.Scanner;
public class GameRunner {
    public static void main(String[] args) {
        Scanner kyx = new Scanner(System.in);

        Methods method = new Methods();
        Intro intro = new Intro();

        System.out.println();
        System.out.println("Max: " + method.getSetLine(intro.maxSetLines, 0));
        System.out.println();
        System.out.println(method.listChoices(intro.userIntroLines, 0));


    }
}
