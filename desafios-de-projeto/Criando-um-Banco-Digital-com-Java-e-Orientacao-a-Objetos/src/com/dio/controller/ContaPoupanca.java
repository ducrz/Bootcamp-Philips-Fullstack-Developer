package com.dio.controller;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        super.imprimirInfosComuns("Poupança");
    }
}