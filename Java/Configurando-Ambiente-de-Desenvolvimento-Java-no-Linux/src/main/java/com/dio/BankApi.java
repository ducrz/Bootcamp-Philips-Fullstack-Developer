package com.dio;

import com.dio.entity.Statement;
import com.dio.entity.User;
import com.dio.service.StatementService;
import com.dio.service.StatementServiceImpl;

import java.util.UUID;

public class BankApi{
	public static void main(String[] args){
	
		final User userA = new User(UUID.randomUUID(), "Usuário 1");
		final User userB = new User(UUID.randomUUID(), "Usuário 2");
		
		final StatementService statementService = new StatementServiceImpl(userA, userB);
		 
		statementService.findAllByUser(userA).forEach(System.out::println);
		statementService.findAllByUser(userB).forEach(System.out::println); 

		List<Statement> statementUSerA  = statementService.findAllByUser(userA);

		//Usando Default Method
		for(Statement statement : statementUserA){
			System.out.println(statementService.findUser(statement.getName()));
		}

		//Usando Lambda
		statementUSerA.forEach(statement) -> {
			System.out.println(statementService.findUser(statement.getName());
		});

		statementUSerA.forEach(statement -> System.out.println(statementService.findUser(statement).getName()));


		//Usando Method Rerences

		statementUserA.forEach(System.out::println);







	}

}
