public class Intro {
    private String [] maxSetLines = {
            "Oh great, fresh meat. You must be the new \"unpaid intern\" Han hired to do the jobs we hate.",
            "Or no other options. Which one is it?"
    };
    private String [] carolineSetLines = {
            "How sweet! And brave. I wouldn't be here right now if my entire life doesn't depend on it. What's you're name? ",
            "Good Luck!"
    };
    private String [] hanSetLines = {
            "Hello everyone! Ah there's my new intern. You see Max, I finally have someone that actually works in here!",
            "Alrighty then, take your time and explore the place and just try to familiarize yourself. I'll be in my office if you need anything.",
    };
    private String [] earlSetLines = {
            "Honey, around here, survival is all about keeping your head down and your sass up."
    };

    private String [][][] maxPossibleLines = {

            {
                    {
                        "Should I just bring them a cup of actual dishwater and see if they know the difference?",  "Where do they think they are, the Palace of Versailles?"
                    }, // two possible max response to the first set of customers

                    {
                        ""
                    },

                    {

                    }

            },

            {

            }

    };


    public String getLine(int index, String [] lines) {
        return lines[index];
    }

    public String getRandomResponse(int eventIndex, String [][] possibleLines) {
        return possibleLines[eventIndex][(int) (Math.random() * 2)];
    }

}
