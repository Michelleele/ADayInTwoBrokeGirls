public class Intro {
    private String [] maxSetLines = {
            "Oh great, fresh meat. You must be the new \"unpaid intern\" Han hired to do the jobs we hate.",
            //user can choose what to respond
            "Yeah, because nothing screams survival like someone who still thinks the word \"networking\" belongs in a diner."
    };
    private String [] carolineSetLines = {
            "I'm Caroline. If Max scares you, don't worry, I'm here to make sure you survive your first day. Stick with me, and you'll do fine",
    };
    private String [] hanSetLines = {
            "Hello everyone! Ah there's my new intern. You see Max, I finally have someone that actually works in here!",
            "Alrighty then, take your time and explore the place and just try to familiarize yourself. I'll be in my office if you need anything.",
    };
    private String [] earlSetLines = {
            "Honey, around here, survival is all about keeping your head down and your sass up."
            //user can choose what to respond
    };

    private String [][] userIntroLines = {
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
    private String [] maxResponses = {
            "Oh look, an eager beaver. Don't worry, we'll break you in soon enough.",
            "Whoa. First day and already throwing shade? I think I might actually like you.",
            "You'll see. Think of it as a crash course in life's disappointment."
    };

    //corresponding Oleg replies to user
    private String [] olegResponces = {
            "Okay? that's easy. Just add a wink and a smirk. Like this ---- Okaaaaay!",
            "Practicing alone? That's no fun. Next time, call me.",
            "The customers can handle it. Han? Not so much. But it's fun to try."
    };

}
