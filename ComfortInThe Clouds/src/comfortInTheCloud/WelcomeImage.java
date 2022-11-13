package comfortInTheCloud;

import javax.swing.*;
import java.awt.*;


public class WelcomeImage extends JFrame {

    JFrame frame;
    JLabel displayField;
    ImageIcon image;

    public WelcomeImage() {
        frame = new JFrame("Options");


        try {
            image = new ImageIcon(getClass().getResource("../assets/welcomePageBkd.jpg"));
            displayField = new JLabel(image);
            frame.add(displayField);

        } catch (Exception e) {
            System.out.println("Image Cannot be Found!");

        }

       // frame.setUndecorated(true);   //Here The code Enables, If we want to open the program in its highest frame
                                        // But cannot Exit the application with the top left bar

        frame.pack();
        frame.setVisible(true);

    }


}
