package com.moshkova.task2.service;

import com.moshkova.task2.error.IllegalRequestDataException;
import com.moshkova.task2.model.Pseudonym;
import com.moshkova.task2.repository.PseudonymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PseudonymService {

    @Autowired
    PseudonymRepository pseudonymRepository;

    public String getShortName(String longName) {
        String shortName = null;
        try {
            shortName = "/l/" + pseudonymRepository.count() + "2" + longName.substring(8, 15);
            return shortName;
        } catch (StringIndexOutOfBoundsException e) {
            throw new IllegalRequestDataException("Original from Post = " + longName + " not corrected");
        }
    }

    public Pseudonym save(String longName) {
        Pseudonym pseudonym;
        if (pseudonymRepository.existsByOriginal(longName)) {
            pseudonym = pseudonymRepository.findByOriginal(longName).get(0);
        } else {
            pseudonym = new Pseudonym(longName, getShortName(longName), 0);
            this.pseudonymRepository.save(pseudonym);
        }

        return pseudonym;
    }

    public String getLongName(String shortName) {
        Pseudonym pseudonym = pseudonymRepository.findByLink(shortName).get(0);
        pseudonymRepository.updateById(pseudonym.getId(), pseudonym.getCount() + 1);
        System.out.println(pseudonym.getOriginal());
        return pseudonym.getOriginal();
    }

}
