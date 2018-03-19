package message.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * Author: mohamed Taman
 * Packt publishing 2018
 */

public interface MessageService {

    static List<MessageService> getInstances() {

        ServiceLoader<MessageService> services = ServiceLoader.load(MessageService.class);

        List<MessageService> spiList = new ArrayList<>();

        services.iterator().forEachRemaining(spiList::add);

        System.out.printf("We have %d Service Providers loaded. %n%n", spiList.size());

        return spiList;
    }

    void showMessage(String message);
}
