import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;

public class PhoneNumberValidationExample {

    private static final String PHONE_NUMBER_PATTERN = "^\\d{3}-\\d{3}-\\d{4}$"; // Example pattern: XXX-XXX-XXXX

    public static void main(String[] args) {
        JFrame frame = new JFrame("Phone Number Validation Example");
        JTextField phoneNumberField = new JTextField(12);
        JLabel validationLabel = new JLabel();

        phoneNumberField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String phoneNumber = phoneNumberField.getText().trim();
                boolean isValid = validatePhoneNumber(phoneNumber);
                validationLabel.setText(isValid ? "Valid phone number" : "Invalid phone number");
            }
        });

        frame.getContentPane().add(phoneNumberField);
        frame.getContentPane().add(validationLabel);
        frame.setLayout(new java.awt.FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private static boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
        return pattern.matcher(phoneNumber).matches();
    }
}