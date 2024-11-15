public class MainCharacter {
    private String name;

    MainCharacter(String name) {
        this.name = name;
    }

    private String [][][]  mainCharResponses = {
            {
                    {
                        "Can I try? I've always wanted to do this.", "I don't think its a good idea. Han might get mad at us. "
                    }, //if max responds using index 0, then user may choose to respond using one of the following

                    {
                        "", "You know what they say, customer is always right. "
                    }
            }
    };


}
