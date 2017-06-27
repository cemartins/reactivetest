package org.juffrou.test.reactive.service;

import org.juffrou.test.reactive.model.NotificationData;

/**
 * Created by cemartins on 2706//17.
 */
public interface NotificationService {

    void initiateNotification(NotificationData notificationData)
            throws InterruptedException;


}
