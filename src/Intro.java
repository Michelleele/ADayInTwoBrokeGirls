import java.util.Scanner;
public class Intro {
    Scanner kyx = new Scanner(System.in);
    private int userInput;
    public String[] setScene = {
            "Welcome to a day in the life of the 2 Broke Girls!",
            "You found yourself as a first day trainee at the Williamsburg Diner of the viral TV show 2 Broke Girls.",
            "Your goal is to survive your first day at the diner and take care of the customers.",
            "When being asked to make selection, please enter one of the choice numbers.",
            "And of course, since it is the Williamsburg Diner, its okay to not be professional!"
    };

    public String [] setLines = {
            "Caroline: I'm Caroline. If Max scares you, don't worry, I'm here to make sure you survive your first day. Stick with me, and you'll do fine",
            "Max: Yeah, because nothing screams survival like someone who still thinks the word \"networking\" belongs in a diner.",
            "Han: Hello everyone! Ah there's my new intern. You see Max, I finally have someone that actually works in here!",
            "You: Hi Han! I'm just introducing myself to Caroline and Max right now.",
            "Han: Alrighty then, take your time and explore the place and just try to familiarize yourself. I'll be in my office if you need anything.",
    };

    public String [] introSelections = {
            "Max: Oh great, fresh meat. You must be the new \"unpaid intern\" Han hired to do the jobs we hate.",
            "Earl: Honey, around here, survival is all about keeping your head down and your sass up."
            //user can choose what to respond
    };

    public String [][] userIntroLines = {
            //user possible responses for max
            {
                "I'm here to work. What's the first task?",
                "Well, someone's gotta pick up the slack around here, right?",
                "So, what exactly did I sign up for?"
            },
            //possible user responses for Earl
            {
                "Sass up? Uhhhhh..... what's the sassiest way to say okay?",
                "Great. I've been practicing my sass in front of the mirror for years",
                "Good advice Earl, should I sass the customers or just the boss",
            }
    };

    //corresponding Max replies to user
    public String [][] maxResponses = {
            {
                    "Max: Oh look, an eager beaver. Don't worry, we'll break you in soon enough.",
                    "Max: Whoa. First day and already throwing shade? I think I might actually like you.",
                    "Max: You'll see. Think of it as a crash course in life's disappointment."
            }
    };

    //corresponding Oleg replies to user
    public String [][] olegResponses = {
            {},
            {
                    "Okay? that's easy. Just add a wink and a smirk. Like this ---- Okaaaaay!",
                    "Practicing alone? That's no fun. Next time, call me.",
                    "The customers can handle it. Han? Not so much. But it's fun to try."
            }
    };

}
