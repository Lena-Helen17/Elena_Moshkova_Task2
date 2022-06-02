package com.moshkova.task2.repository;

import com.moshkova.task2.model.Pseudonym;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class PseudonymRepo implements PseudonymRepository{
    @Override
    public List<Pseudonym> findAll() {
        return null;
    }

    @Override
    public List<Pseudonym> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Pseudonym> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Pseudonym> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Pseudonym entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Pseudonym> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Pseudonym> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Pseudonym> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Pseudonym> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Pseudonym> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Pseudonym> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Pseudonym> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Pseudonym getOne(Integer integer) {
        return null;
    }

    @Override
    public Pseudonym getById(Integer integer) {
        return null;
    }

    @Override
    public Pseudonym getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Pseudonym> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Pseudonym> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Pseudonym> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Pseudonym> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Pseudonym> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Pseudonym> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Pseudonym, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
