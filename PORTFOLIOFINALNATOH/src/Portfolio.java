import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

        public class Portfolio extends JFrame {
        private JPanel contentPane; // Declare a private instance variable of JPanel type

        public static void main(String[] args) {
        Portfolio frame = new Portfolio(); // Create an instance of the Portfolio class
        frame.setVisible(true); // Set the frame to be visible
    }

        public Portfolio() {
        setTitle("Portfolio"); // Set the title of the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define the close operation when the frame is closed
        setBounds(100, 100, 1200, 720); // Set the position and size of the frame
        setLocationRelativeTo(null); // Center the frame on the screen
        contentPane = new JPanel(); // Create a new JPanel
        setContentPane(contentPane); // Set the content pane of the frame to the JPanel

        // Creating "About Me" button
        JButton aboutme = new JButton("About Me"); // Create a button with the text "About Me"
        aboutme.setBounds(803, 377, 162, 70); // Set the position and size of the button
        aboutme.setForeground(Color.WHITE); // Set the text color to white
        aboutme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { // Add an action listener to the button
                AboutMe AM = new AboutMe(); // Create an instance of the AboutMe class
                AM.setVisible(true); // Set the AboutMe frame to be visible
                dispose(); // Close the current frame
            }
        });
        aboutme.setOpaque(false); // Set the button to be transparent
        aboutme.setContentAreaFilled(false); // Set the content area of the "AboutMe" button to be transparent
        aboutme.setBackground(new Color(0, 0, 0, 0)); // Set the background color to transparent
        aboutme.setBorder(null); // Remove the button border
        aboutme.setFocusPainted(false); // Disable the default click highlight
        contentPane.add(aboutme); // Add the button to the content pane

        // Creating "Works" button
        JButton Works = new JButton("Works"); // Create a button with the text "Works"
        Works.setBounds(975, 377, 162, 70); // Set the position and size of the button
        Works.setForeground(Color.WHITE); // Set the text color to white
        Works.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { // Add an action listener to the button
                Works W = new Works(); // Create an instance of the Works class
                W.setVisible(true); // Set the Works frame to be visible
                dispose(); // Close the current frame
            }
        });
        Works.setOpaque(false); // Set the button to be transparent
        Works.setContentAreaFilled(false); // Set the content area of the "Works" button to be transparent
        Works.setBackground(new Color(0, 0, 0, 0)); // Set the background color to transparent
        Works.setBorder(null); // Remove the button border
        Works.setFocusPainted(false); // Disable the default click highlight
        contentPane.add(Works); // Add the button to the content pane

        // Creating "Contacts" button
        JButton Info = new JButton("Contacts"); // Create a button with the text "Contacts"
        Info.setBounds(637, 377, 162, 70); // Set the position and size of the button
        Info.setForeground(Color.WHITE); // Set the text color to white
        Info.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { // Add an action listener to the button
                Contacts C = new Contacts(); // Create an instance of the Contacts class
                C.setVisible(true); // Set the Contacts frame to be visible
                dispose(); // Close the current frame
            }
        });
        Info.setOpaque(false);  // Set the button to be transparent
        Info.setContentAreaFilled(false); // Set the content area of the "Info" button to be transparent
        Info.setBackground(new Color(0, 0, 0, 0)); // Set the background color to transparent
        Info.setBorder(null); // Remove the button border
        Info.setFocusPainted(false); // Disable the default click highlight
        contentPane.add(Info); // Add the button to the content pane

        // Creating and configuring the background image label
        JLabel NewLabel = new JLabel("Backround"); // Create a new label with text "Backround"
        NewLabel.setBounds(0, 0, 1184, 720); // Set the position and size of the label
        ImageIcon icon = new ImageIcon("backround 1.png"); // Create an ImageIcon with the specified image file
        Image img = icon.getImage(); // Get the Image object from the ImageIcon
        Image scaledImg = img.getScaledInstance(1184, 720, Image.SCALE_SMOOTH); // Scale the image to the desired size
        ImageIcon scaledIcon = new ImageIcon(scaledImg); // Create a new ImageIcon with the scaled image
        NewLabel.setIcon(scaledIcon); // Set the icon of the label to the scaled image
        contentPane.add(NewLabel); // Add the label to the content pane
        contentPane.setLayout(null); // Set the layout manager of the content pane to null
    }
}