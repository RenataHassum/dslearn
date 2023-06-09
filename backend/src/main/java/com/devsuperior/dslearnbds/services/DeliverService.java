package com.devsuperior.dslearnbds.services;

import com.devsuperior.dslearnbds.dtos.DeliverRevisionDto;
import com.devsuperior.dslearnbds.entities.Deliver;
import com.devsuperior.dslearnbds.repositories.DeliverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliverService {

    @Autowired
    private DeliverRepository repository;

    @PreAuthorize("hasAnyRole('ADMIN', 'INSTRUCTOR')")
    @Transactional
    public void saveRevision(Long id, DeliverRevisionDto dto) {
        Deliver deliver = repository.getReferenceById(id);
        deliver.setStatus(dto.getStatus());
        deliver.setFeedback(dto.getFeedback());
        deliver.setCorrectCount(dto.getCorrectCount());
        repository.save(deliver);
    }
}
