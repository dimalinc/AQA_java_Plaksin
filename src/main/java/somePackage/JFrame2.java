package somePackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




    public class JFrame2 extends JFrame {

        public static final String nameToPass = "Вячеслав";
        public static final String buttonText = "Go";
        public static final String inputLabelText = "Enter name please";
        public static final String outputLabelText = "System message";
        public static final String titleCaption = "Vyacheslavs' Check";

        public JButton button1 = new JButton(buttonText);
        public JLabel inputLabel = new JLabel(inputLabelText);
        public JLabel outputLabel = new JLabel(outputLabelText);
        public JTextField input = new JTextField("", 3);
        public JTextField output = new JTextField("", 3);

        public JFrame2() {
            super(titleCaption);
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
                        output.setText(Task2.vyacheslavCheck(input.getText()));
                    } catch (Exception except) {
                        output.setText(inputLabelText);
                    }
                    input.setText(null);
                }
            }


        }


    }

