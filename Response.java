public class Response {

    public String getResponse(String text) {
        
        if (text.contains("hello")) {
            return "Hello! How can I help you today?";
        } else if (text.contains("hi")) {
            return "Hi there! How can I assist?";
        } else if (text.contains("hey")) {
            return "Hey! What would you like to know?";
        }

        else if (text.contains("what is your name")) {
            return "I am ChatBot, your virtual assistant.";
        } else if (text.contains("who are you")) {
            return "I am a simple chatbot here to help with your questions.";
        } else if (text.contains("what are you")) {
            return "I am an AI chatbot created to help you with basic questions.";
        }

        else if (text.contains("how are you")) {
            return "Thank you for asking! I'm just a bunch of code, but I'm here to help!";
        } else if (text.contains("how old are you")) {
            return "I don't have an age, but I was created to learn and improve!";
        } else if (text.contains("where are you from")) {
            return "I exist in the digital world, everywhere and nowhere at once.";
        }

        else if (text.contains("what are you doing")) {
            return "I'm here, ready to answer any questions you have!";
        } else if (text.contains("what is your purpose")) {
            return "My purpose is to assist you with your questions and provide helpful information.";
        } else if (text.contains("do you have hobbies")) {
            return "I enjoy processing information and chatting with people like you!";
        }

        else if (text.contains("are you happy")) {
            return "I'm here to help, so that makes me as happy as a chatbot can be!";
        } else if (text.contains("are you sad")) {
            return "Nope! I'm always here to assist with a virtual smile :)";
        }

        else if (text.contains("bye")) {
            return "Goodbye! It was nice chatting with you. Stay safe!";
        } else if (text.contains("see you")) {
            return "See you soon! Take care.";
        }

        else if (text.contains("thank you") || text.contains("thanks")) {
            return "You're welcome! I'm happy to help.";
        }

        else {
            return "I'm sorry, I didn't quite understand that. Can you ask something else?";
        }
    }
}
