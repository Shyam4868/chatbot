import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Action implements ActionListener {
    
    private JTextArea chatArea;
    private JTextField chatField;
    private Response responseGenerator;

    public Action(JTextArea chatArea, JTextField chatField) {
        this.chatArea = chatArea;
        this.chatField = chatField;
        this.responseGenerator = new Response();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userText = chatField.getText().toLowerCase();
        chatArea.setForeground(Color.RED);
        chatArea.append("You--> " + userText + "\n");
        chatField.setText("");

        // Get response from ResponseGenerator
        String botResponse = responseGenerator.getResponse(userText);
        chatArea.append("ChatBot--> " + botResponse + "\n");
    }
}
