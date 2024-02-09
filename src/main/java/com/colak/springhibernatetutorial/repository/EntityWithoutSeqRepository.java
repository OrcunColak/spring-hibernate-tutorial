package com.colak.springhibernatetutorial.repository;

import com.colak.springhibernatetutorial.jpa.EntityWithoutSeq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityWithoutSeqRepository extends JpaRepository<EntityWithoutSeq, Long> {}
