package lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatWindow extends JFrame {


    public ChatWindow(){
        setTitle("Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);

        JPanel panel1 = new JPanel();
        final JTextArea area = new JTextArea(20, 20);
        area.setEnabled(false);
        area.setFont(new Font("Dialog", Font.BOLD, 15));
        panel1.add(area);

        JPanel panel2 = new JPanel();
        JButton button = new JButton("Send message");
        button.setFocusable(false);
        panel2.add(button);
        final JTextField smallField = new JTextField(15);
        smallField.setFocusable(true);
        panel2.add(smallField);

        add(panel2, BorderLayout.SOUTH);
        add(panel1, BorderLayout.CENTER);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!smallField.getText().equals("")) {
                    area.append(smallField.getText() + "\n");
                    smallField.setText("");
                }
            }
        });

        JRootPane rootPane = this.getRootPane();
        rootPane.setDefaultButton(button);

        setVisible(true);

    }
}
