import message.provider.swing.MessageServiceProvider;

/**
 * Author: mohamed Taman
 * Packt publishing 2018
 */

module message.service.provider.swing {

    requires message.service.api;

    requires javafx.swing;

    provides message.service.MessageService with MessageServiceProvider;

}