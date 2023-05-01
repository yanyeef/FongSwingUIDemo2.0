import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainGUIWindow extends JFrame implements ActionListener, KeyListener {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton button2;
    private JTextArea myTextArea;
    private JButton button1;
    private JLabel Label1;

    public MainGUIWindow(){
        createUIComponents();
    }

    public void createUIComponents(){
        setContentPane(mainPanel);
        setTitle("My GUI");
        setSize(300, 400);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myTextArea.setLineWrap(true);
        button2.addActionListener(this);
        button1.addActionListener(this);
        textField1.addKeyListener(this);

        mainPanel = new JPanel();
        Label1 = new JLabel("Welcome to my GUI");
        mainPanel.add(Label1);
        textField1 = new JTextField();
        mainPanel.add(textField1);
        myTextArea = new JTextArea();
        mainPanel.add(myTextArea);
        button2 = new JButton("Send");
        mainPanel.add(button2);
        button1 = new JButton("Click me for a good time!");
        mainPanel.add(button1);
        mainPanel.setLayout(new GridLayout(3,1));
        add(mainPanel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source instanceof JButton){
            JButton button = (JButton) source;
            String text = button.getText();

            if(text.equals("Send")){
                myTextArea.append("button 1 clicked");
            } else {
                myTextArea.append("button 2 clicked");
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e){

    }
    @Override
    public void keyPressed(KeyEvent e){
    }
    @Override
    public void keyReleased(KeyEvent e){
    }

}
