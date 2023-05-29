import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

        public class Contacts extends Portfolio {
        private JPanel contentPane; // Declare a private instance variable of JPanel type

        // Setting up the Contacts frame
        public Contacts() {
        setTitle("Contacts"); // Set the title of the frame
        contentPane = new JPanel(); // Create a new JPanel
        setContentPane(contentPane); // Set the content pane of the frame to the JPanel

        // Creating "Return" button
        JButton Return = new JButton(""); // Create a button without text
        Return.setBounds(0, 0, 128, 53); // Set the position and size of the button
        Return.setOpaque(false); // Set the button to be transparent
        Return.setContentAreaFilled(false);  // Set the content area of the "return" button to be transparent
        Return.setBackground(new Color(0, 0, 0, 0)); // Set the background color to transparent
        Return.setBorder(null); // Remove the button border
        Return.setFocusPainted(false); // Disable the default click highlight
        Return.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { // Add an action listener to the button
                Portfolio P = new Portfolio(); // Create an instance of the Portfolio class
                P.setVisible(true); // Set the Portfolio frame to be visible
                dispose(); // Close the current frame
            }
        });
        contentPane.add(Return); // Add the button to the content pane

        // Creating and configuring the background image label
        JLabel NewLabel = new JLabel("Backround"); // Create a new label with text "Backround"
        ImageIcon icon = new ImageIcon("backround 4.png"); // Create an ImageIcon with the specified image file
        NewLabel.setBounds(0, 0, 1184, 720); // Set the position and size of the label
        Image img = icon.getImage(); // Get the Image object from the ImageIcon
        Image scaledImg = img.getScaledInstance(1184, 720, Image.SCALE_SMOOTH); // Scale the image to the desired size
        ImageIcon scaledIcon = new ImageIcon(scaledImg); // Create a new ImageIcon with the scaled image
        NewLabel.setIcon(scaledIcon); // Set the icon of the label to the scaled image
        contentPane.add(NewLabel); // Add the label to the content pane
        contentPane.setLayout(null); // Set the layout manager of the content pane to null
    }
}