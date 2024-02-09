package com.colak.springhibernatetutorial.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EntityWithSeqServiceTest {

    @Autowired
    private EntityWithSeqService entityWithSeqService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaveAll() {
        boolean result = entityWithSeqService.saveAll();
        Assertions.assertEquals(true, result);
    }
}
