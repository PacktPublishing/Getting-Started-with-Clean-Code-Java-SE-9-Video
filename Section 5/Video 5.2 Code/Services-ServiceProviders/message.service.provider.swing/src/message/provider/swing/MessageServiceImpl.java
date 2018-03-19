package message.provider.swing;

import message.service.MessageService;
import javax.swing.JOptionPane;

/**
 * Author: mohamed Taman
 * Packt publishing 2018
 */
public class MessageServiceImpl implements MessageService {


    @Override
    public void showMessage(String message) {

        JOptionPane.showMessageDialog(null, message);
    }
}
