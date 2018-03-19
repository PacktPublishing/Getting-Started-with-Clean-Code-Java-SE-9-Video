package eg.com.taman.ui;

import message.service.MessageService;

import java.util.List;

/**
 * Author: mohamed Taman
 * Packt publishing 2018
 */
public class ServiceApplication {

    public static void main(String[] args) {

        List<MessageService> msgServices = MessageService.getInstances();

        msgServices.forEach(msgService ->  msgService.showMessage("Hello Services world!"));
    }
}
