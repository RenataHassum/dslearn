package com.devsuperior.dslearnbds.services;

import com.devsuperior.dslearnbds.dtos.NotificationDto;
import com.devsuperior.dslearnbds.entities.Notification;
import com.devsuperior.dslearnbds.entities.User;
import com.devsuperior.dslearnbds.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NotificationService {

    @Autowired
    NotificationRepository repository;

    @Autowired
    AuthService authService;

//    @Transactional(readOnly = true)
//    public Page<NotificationDto> notificationsForCurrentUser(Pageable pageable) {
//        User user = authService.authenticated();
//        Page<Notification> page = repository.findByUser(user, pageable);
//        return page.map(x -> new NotificationDto(x));
//    }

    @Transactional(readOnly = true)
    public Page<NotificationDto> notificationsForCurrentUser(boolean unreadOnly, Pageable pageable) {
        User user = authService.authenticated();
        Page<Notification> page = repository.find(user, unreadOnly, pageable);
        return page.map(x -> new NotificationDto(x));
    }
}


