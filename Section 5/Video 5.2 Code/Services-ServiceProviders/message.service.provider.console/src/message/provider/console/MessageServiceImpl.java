package message.provider.console;

import message.service.MessageService;

import java.util.logging.Logger;

/**
 * Author: mohamed Taman
 * Packt publishing 2018
 */
public class MessageServiceImpl implements MessageService {


    private Logger logger = Logger.getLogger(MessageServiceImpl.class.getName());

    @Override
    public void showMessage(String message) {

        logger.info(message);
    }
}
