package com.colak.springhibernatetutorial.repository;

import com.colak.springhibernatetutorial.jpa.EntityWithSeq;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityWithSeqRepository extends JpaRepository<EntityWithSeq, Long> {}
