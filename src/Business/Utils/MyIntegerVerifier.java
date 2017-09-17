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
public class MyIntegerVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        if (text.length() > 0) {
            try {
                int number=Integer.parseInt(text);
                if(number<0)
                {
                    input.setBackground(Color.red);
                    JOptionPane.showMessageDialog(input, "Number cannot be negative", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                input.setBackground(Color.white);
                return true;
            } catch (NumberFormatException e) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Please enter valid integer value", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            input.setBackground(Color.red);
            return false;
        }
    }
}
