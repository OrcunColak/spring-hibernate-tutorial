package com.colak.springhibernatetutorial.service;

import com.colak.springhibernatetutorial.jpa.EntityWithoutSeq;
import com.colak.springhibernatetutorial.repository.EntityWithoutSeqRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class EntityWithoutSeqService {

    private final EntityWithoutSeqRepository repository;
    private final Random random = new Random();

    public boolean saveAll() {
        List<EntityWithoutSeq> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            list.add(EntityWithoutSeq.builder().value(String.valueOf(random.nextInt())).build());
        }
        repository.saveAll(list);
        return true;
    }
}
