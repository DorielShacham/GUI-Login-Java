//GUIDE for all code here - https://beginnersbook.com/2015/07/java-swing-tutorial/
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //for success Button.


public class GUI implements ActionListener {
    //Add all imports here because we @Override them later outside the main class
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    private static JLabel fail;
    public static void main(String[] args) {

        JPanel panel = new JPanel(); //Back
        JFrame frame = new JFrame(); //Front
        frame.setSize(400, 400); //size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //(Close option)
        frame.add(panel); //Panel on the frame - box

        panel.setLayout(null); //Rows & Columns
//User info
        userLabel = new JLabel("User"); //Label on the invisible Panel
        userLabel.setBounds(10, 20, 80, 25); //Follow link on top to see Good locations to place Box - label/panel
        panel.add(userLabel); //add label(User) to panel

        userText = new JTextField(20); //Import JTextField for User input in box - (20) is the length of text field
        userText.setBounds(100, 20, 165, 25); //Follow link on top to see good locations to place text box
        panel.add(userText); //Adding userText box



//Password info
        passwordLabel = new JLabel("Password"); //Label on the invisible Panel
        passwordLabel.setBounds(10, 50, 80, 25); //Follow link on top to see Good locations to place Box - label/panel
        panel.add(passwordLabel); //add label(password) to panel

        passwordText = new JPasswordField(20); //Import JPasswordField for Password input in box - (20) is the lenght of text field(JPassowrdField gives **** at the box)
        passwordText.setBounds(100, 50, 165, 25); //Follow link on top to see good locations to place text box
        panel.add(passwordText); //Adding userText box




//Button
        button = new JButton("Log in"); //Import JButton for clickable object
        button.setBounds(10, 80, 80, 25); //JButton location
        button.addActionListener(new GUI()); //Implement ActionLister In order to get message response
        panel.add(button); //Add visibility




//success
        success = new JLabel("");//Import JLabel for success log in If data correct
        success.setBounds(10, 110, 300, 25); //Location of "Success" message CURRENTLY INVISIBLE
        panel.add(success); // Actual add of JLabel success




//fail
        fail = new JLabel(""); //Import JLabel for fail log in if data not correct
        fail.setBounds(10, 140, 300, 25); //Location of "Success" message CURRENTLY INVISIBLE
        panel.add(fail);


        frame.setVisible(true); //We make it visible (true)
    }

    @Override //Adding Lister is required because we want to get a response from the button ----> success
    public void actionPerformed(ActionEvent e) {
        //Here you write the response you want to get when someone click the Log In button
        String user = userText.getText(); //Get input from user
        String password = passwordText.getText(); //Get input from user password
        System.out.println(user + ", " + password); //View in terminal full details

        if(user.equals("Doriel") && password.equals("Shacham123")){ //if input correct then we print message
            success.setText("Log in successful!");
        }
        else{
            System.out.println("Wrong details entered check again");
            fail.setText(("Wrong details entered check again"));
        }
    }
}
