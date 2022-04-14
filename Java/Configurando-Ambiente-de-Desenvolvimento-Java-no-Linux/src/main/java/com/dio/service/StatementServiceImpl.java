package com.dio.service;

import com.dio.entity.User;
import com.dio.repository.StatementRepository;

public class StatementServiceImpl implements StatementService{

    private final StatementRepository statementRepository;

    public StatementServiceImpl() {
    }


    publlic StatementServiceImpl(final User userA, final User userB){
        this.statementRepository = new StatementRepository(userA, userB);
    }

    public List<Statement> findAllByUser(final User user){
        return statementRepository.findAllByUser(user);
    }
}
