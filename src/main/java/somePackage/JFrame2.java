package somePackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




    public class JFrame2 extends JFrame {

        public static final String nameToPass = "Вячеслав";

        public JButton button1 = new JButton("GO");
        public JLabel inputLabel = new JLabel("Enter name please");
        public JLabel outputLabel = new JLabel("System message");
        public JTextField input = new JTextField("", 3);
        public JTextField output = new JTextField("", 3);

        public JFrame2() {
            super("Vyacheslavs' Check");
            {
                this.setBounds(250, 100, 600, 300);

                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                Container container = this.getContentPane();
                this.getContentPane().setBackground(Color.yellow);
                container.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

                container.add(inputLabel);
                container.add(input);
                container.add(outputLabel);
                container.add(output);
                container.add(button1);
                button1.addActionListener(new inputField());
            }
        }

        public class inputField implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button1) {
                    try {
                        output.setText(vyacheslavCheck(input.getText()));
                    } catch (Exception except) {
                        output.setText("Please enter name here");
                    }
                    input.setText(null);
                }
            }

            public String vyacheslavCheck(String name) {

                if (name.equals(nameToPass)) {
                    name = "Привет, Вячеслав";
                } else {
                    name = "Нет такого имени";
                }
                return name;
            }
        }


    }

