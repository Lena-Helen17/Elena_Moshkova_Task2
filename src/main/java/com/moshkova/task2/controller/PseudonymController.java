package com.moshkova.task2.controller;


import com.moshkova.task2.model.Pseudonym;
import com.moshkova.task2.repository.PseudonymRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@AllArgsConstructor
@Slf4j
public class PseudonymController {

    private final PseudonymRepo pseudonymRepository = new PseudonymRepo();

    @PostMapping(value = "/generate", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Pseudonym> generate(Pseudonym website) {

        return ResponseEntity.created(URI.create("/I/web")).body(website);
    }
}
