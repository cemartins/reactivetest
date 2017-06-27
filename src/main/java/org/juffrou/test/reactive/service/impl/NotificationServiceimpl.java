package org.juffrou.test.reactive.service.impl;

import org.juffrou.test.reactive.model.NotificationData;
import org.juffrou.test.reactive.service.NotificationService;
import org.springframework.stereotype.Service;

/**
 * Created by cemartins on 2706//17.
 */
@Service
public class NotificationServiceimpl implements NotificationService {

    @Override
    public void initiateNotification(NotificationData notificationData)
            throws InterruptedException {

        System.out.println("Notification service started for "
                + "Notification ID: " + notificationData.getId());

        Thread.sleep(5000);

        System.out.println("Notification service ended for "
                + "Notification ID: " + notificationData.getId());
    }
}
