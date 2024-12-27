import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhishingDetectorGUI {
    private PhishingDetector detector;

    public PhishingDetectorGUI() throws Exception {
        detector = new PhishingDetector();
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        // Create the frame
        JFrame frame = new JFrame("Phishing Detection Tool");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        // Create input panel
        JPanel inputPanel = new JPanel();
        JLabel urlLabel = new JLabel("Enter URL:");
        JTextField urlTextField = new JTextField(20);
        JButton classifyButton = new JButton("Classify");
        inputPanel.add(urlLabel);
        inputPanel.add(urlTextField);
        inputPanel.add(classifyButton);

        // Create output panel
        JPanel outputPanel = new JPanel();
        JLabel resultLabel = new JLabel("Result: ");
        outputPanel.add(resultLabel);

        // Add panels to frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(outputPanel, BorderLayout.CENTER);

        // Add action listener to the button
        classifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = urlTextField.getText();
                try {
                    String result = detector.classify(url);
                    resultLabel.setText("Result: " + result);
                } catch (Exception ex) {
                    resultLabel.setText("Error: " + ex.getMessage());
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new PhishingDetectorGUI();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
