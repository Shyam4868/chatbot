import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class chatbot extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextArea chatArea = new JTextArea();
    private JTextField chatField = new JTextField();                                  
    private JButton sendButton = new JButton();
    private JLabel sendLabel = new JLabel();

    public chatbot() {
        JFrame frame = new JFrame(); 
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);                      
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setTitle("ChatBot");

        
        frame.add(chatArea);
        chatArea.setSize(300,310);
        chatArea.setLocation(1, 1);
        chatArea.setBackground(Color.WHITE);
        
        
        frame.add(chatField);
        chatField.setSize(300,20);
        chatField.setLocation(1,320);

    
        frame.add(sendButton);
        sendLabel.setText("SEND");
        sendButton.add(sendLabel);
        sendButton.setSize(400,20);
        sendButton.setLocation(300,320);

        sendButton.addActionListener(new Action(chatArea, chatField));
    }
}
