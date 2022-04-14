package com.dio.service;


import com.dio.entity.Statement;
import com.dio.entity.User;

import java.util.List;

public interface StatementService {

    List<Statement> findAllByUser(final User user);

    default User findUser(final Statement statement) {
        return statement.getUser();
    }
}
