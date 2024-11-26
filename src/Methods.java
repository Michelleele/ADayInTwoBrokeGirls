
public class Methods {

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

    public String randomResponse(String[] lines) {
        int x = (int) (Math.random() * (lines.length));
        return lines[x];
    }

    public int random1Or2() {
        return (int) (Math.random() * 2) + 1;
    }

    public String getResponse(String [] responses, int indexNum) {
        return responses[indexNum];
    }

}
