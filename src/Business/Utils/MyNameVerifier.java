package Business.Utils;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Ankur
 */
public class MyNameVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        String pattern = "^[a-zA-Z0-9\\s]*$";
        if (text.length() > 0) {
            if (text.toLowerCase().startsWith(" ") || text.length() == 0
                    || text.toLowerCase().startsWith(".")
                    || text.toLowerCase().startsWith(",")
                    || text.matches(pattern) != true) {     //|| text.matches(pattern) != true
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Please enter valid string. Special characters are not allowed", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                input.setBackground(Color.white);
                return true;
            }
        }
        else
        {
            input.setBackground(Color.red);
            return false;
        }
    }
}
