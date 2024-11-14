public class Responses {
    public String [][][] responses = {
            // Max responses[0]
            {
                    {"Unless you're bringing me cash, cupcakes, or a ticket out of here, I'm not sure what we have to talk about", "Look, unless you're here to solve all of my problems or clean the dishes, I'm not interested. And trust me, both are equally impossible."},
                    //greetings responses[0][0]

                    {"Oh look what we got here. Another lost soul to grace me with their presence. Can I help you, or are you just here to lower my expectations further?"},
                    //When max first sees main responses[0][1]

                    {"Then what better place to be than in this dumpster?", ""}
                    //sassy max responses[0][3]

            },

            // Han responses[1]
            {
                    {"Good morning! Ready to make some serious tips today?",},
                    //greetings responses[1][0]
                    {"Fine. I'll let you girls have the window but under one condition. The window can not be open for business during your shifts!"},
                    //responses during event one, responses[1][1]
                    {"My name is on the list, Han Lee!", "I am the manager here!"},
                    //angry Han responses[1][2]
                    {}
            },

            // Caroline responses[2]
            {
                    {"Max what a great idea! A cupcake walk-up window, you're a genius!"}
            }
};
    public String [][] getResponses(int indexNum) {
        return responses[indexNum];
    }

}
