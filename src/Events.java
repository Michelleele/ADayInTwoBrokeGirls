public class Events {
    //total of 4 events, subtopics: characters involved, scene, problem
    private String[] currentEvent;
    private String[][] npcResponses;

    Events(String[][] allEvents, int eventNum) {
        currentEvent = allEvents[eventNum - 1];
        // currentEvent[1] = problem
        // currentEvent[2] = characters
    }

    public void setCharacter(int indexNum) {
        Responses x = new Responses();
        npcResponses = x.getResponses(indexNum);
    }


}
