import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends JFrame {
    
    JLabel clockLabel;

    DigitalClock() {
        setTitle("Digital Clock");
        setSize(300, 150);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        clockLabel = new JLabel();
        clockLabel.setFont(new Font("Verdana", Font.BOLD, 30));
        clockLabel.setForeground(Color.BLUE);
        add(clockLabel);

        // Timer to update every second (1000ms)
        Timer timer = new Timer(1000, e -> updateClock());
        timer.start();

        updateClock();  // initial display
        setVisible(true);
    }

    void updateClock() {
        // Format: Hour:Minute:Second AM/PM
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
        String currentTime = sdf.format(new Date());
        clockLabel.setText(currentTime);
    }

    public static void main(String[] args) {
        new DigitalClock();
    }
}
