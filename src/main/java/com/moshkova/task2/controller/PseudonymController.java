package com.moshkova.task2.controller;


import com.moshkova.task2.model.Pseudonym;
import com.moshkova.task2.repository.PseudonymRepository;
import com.moshkova.task2.service.PseudonymService;
import com.moshkova.task2.to.PseudonymRank;
import com.moshkova.task2.to.PseudonymTo;
import lombok.AllArgsConstructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@AllArgsConstructor
public class PseudonymController {
    private static final Logger log = LoggerFactory.getLogger(PseudonymController.class);
    @Autowired
    private final PseudonymService pseudonymService;
    @Autowired
    private final PseudonymRepository pseudonymRepository;

    @PostMapping(value = "/generate", consumes = MediaType.APPLICATION_JSON_VALUE)
    public PseudonymTo generate(@RequestBody Pseudonym website) {
        log.info("get in Post /generate {} ", website.getOriginal());
        return new PseudonymTo(pseudonymService.save(website.getOriginal()).getLink());
    }

    @GetMapping("/l/{shotName}")
    public ResponseEntity<Void> redirect(@PathVariable String shotName) {
        return (ResponseEntity.status(HttpStatus.FOUND).location(URI.create(pseudonymService.getLongName("/l/" + shotName)))).build();
    }

    @GetMapping(value = "/stats/l/{shotName}", produces = MediaType.APPLICATION_JSON_VALUE)

    public PseudonymRank getStatistic(@PathVariable String shotName) {
        return (pseudonymRepository.getRank("/l/" + shotName).get(0));
    }

}
