package com.moshkova.task2.repository;

import com.moshkova.task2.model.Pseudonym;
import com.moshkova.task2.to.PseudonymRank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface PseudonymRepository extends JpaRepository<Pseudonym, Integer> {

    List<Pseudonym> findByOriginal(String longName);

    boolean existsByOriginal(String original);

    @Modifying
    @Query("UPDATE Pseudonym p SET p.count = :count WHERE p.id = :id")
    void updateById(Integer id, int count);

    List<Pseudonym> findByLink(String shortName);

    @Query(
            value = "Select p.original, p.link, p.count, DENSE_RANK() over (order by p.count desc) rank from Pseudonym p where link = :shortName",
            nativeQuery = true
    )  //этот запрос не работает((( не знаю почему
    List<PseudonymRank> getRank(String shortName);
}
