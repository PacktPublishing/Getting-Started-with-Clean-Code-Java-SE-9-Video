package message.provider.console;

import message.service.MessageService;

import java.util.logging.Logger;

/**
 * Author: mohamed Taman
 * Packt publishing 2018
 */

public class MessageServiceProvider {

    private static Logger logger = Logger.getLogger(MessageServiceProvider.class.getName());

    public static MessageService provider() {

        return new ConsoleMessageServiceImpl();
    }

    private static class ConsoleMessageServiceImpl implements MessageService {

        @Override
        public void showMessage(String message) {

            logger.info("Message to the console: "+ message);
        }
    }
}
