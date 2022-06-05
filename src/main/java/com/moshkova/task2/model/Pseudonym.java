package com.moshkova.task2.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "pseudonym")
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Pseudonym extends AbstractPersistable<Integer> {

    @Column(name = "original", nullable = false, unique = true)
    @Size(min = 2, max = 1120)
    private String original;

    private String link;

    private Integer count;
}
