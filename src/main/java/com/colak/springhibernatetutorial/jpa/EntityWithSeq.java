package com.colak.springhibernatetutorial.jpa;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "entity_with_seq")

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EntityWithSeq {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EWS_SEQ")
    @SequenceGenerator(name = "EWS_SEQ", sequenceName = "sequence_table", allocationSize = 100)
    private Long id;

    private String value;
}
