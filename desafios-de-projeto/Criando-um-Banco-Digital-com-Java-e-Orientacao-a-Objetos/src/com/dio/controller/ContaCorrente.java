package com.dio.controller;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        super.imprimirInfosComuns("Conta Corrente");
    }

}