package com.colak.springhibernatetutorial.service;

import com.colak.springhibernatetutorial.jpa.EntityWithSeq;
import com.colak.springhibernatetutorial.repository.EntityWithSeqRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class EntityWithSeqService {

    private final EntityWithSeqRepository repository;
    private final Random random = new Random();

    public boolean saveAll() {
        List<EntityWithSeq> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            list.add(EntityWithSeq.builder().value(String.valueOf(random.nextInt())).build());
        }
        repository.saveAll(list);
        return true;
    }
}
