package com.dio.controller;

import com.dio.view.IConta;

import javax.swing.*;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    private String tipo;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns(String tipo) {
        this.tipo = tipo;

          JOptionPane.showMessageDialog(null,
                "Extrato " +tipo+
                        "\n Titular: "+this.cliente.getNome()+
                        "\n Agência: "+this.agencia+
                        "\n Número: "+this.numero+
                        "\n Saldo: "+this.saldo,

                "BANCO DIGITAL JAVA OO", JOptionPane.WARNING_MESSAGE);

    }

}