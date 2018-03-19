package message.provider.swing;

import message.service.MessageService;

import javax.swing.*;

/**
 * Author: mohamed Taman
 * Packt publishing 2018
 */

public class MessageServiceProvider {

    public static MessageService provider() {
        return new SwingMessageServiceImpl();
    }

    private static class SwingMessageServiceImpl implements MessageService {

        @Override
        public void showMessage(String message) {

            JOptionPane.showMessageDialog(null, message);
        }
    }
}
