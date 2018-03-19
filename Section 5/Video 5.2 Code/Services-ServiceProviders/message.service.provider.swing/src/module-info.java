import message.service.MessageService;

/**
 * Author: mohamed Taman
 * Packt publishing 2018
 */
module message.service.provider.swing {

    requires message.service.api;

    requires javafx.swing;

    provides MessageService with message.provider.swing.MessageServiceImpl;

}