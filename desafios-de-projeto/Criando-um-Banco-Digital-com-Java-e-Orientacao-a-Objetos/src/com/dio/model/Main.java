package com.dio.model;

import com.dio.controller.*;
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nomeCliente ="";
        boolean selecao = true;

        Cliente cliente = new Cliente();

        String nome = null;
        nomeCliente = JOptionPane.showInputDialog(null,"Digite o nome do Cliente", "BANCO DIGITAL JAVA OO", JOptionPane.INFORMATION_MESSAGE);

        cliente.setNome(nomeCliente);

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);


        while(selecao == true){

            String[] operacoes = {"Depositar Conta Corrente", "Transferir para Poupança", "Imprimir Extrato Conta","Imprimir Extrato Poupança","Sair"};

            int operacao = JOptionPane.showOptionDialog(null, "Clique na Operação Desejada!",
                    "BANCO DIGITAL JAVA OO",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, operacoes, operacoes[0]);

            if(operacao == 0){ //Depositar valor na Conta Corrente
                cc.depositar(100);
                JOptionPane.showMessageDialog(null, "Depósito Efetuado com Sucesso", "BANCO DIGITAL JAVA OO", JOptionPane.WARNING_MESSAGE);
            }

            if(operacao == 1) { //Transferir valor para a Poupança
                cc.transferir(100, poupanca);
                JOptionPane.showMessageDialog(null, "Transferência para a Poupança Efetuada com Sucesso!", "BANCO DIGITAL JAVA OO", JOptionPane.WARNING_MESSAGE);

            }
            if(operacao == 2) { //Imprimir Extrato Conta Corrente
                cc.imprimirExtrato();

            }
            if(operacao == 3) { //Imprimir Extrato Poupança
                poupanca.imprimirExtrato();
            }
            if(operacao == 4) { //Encerrar programa
                JOptionPane.showMessageDialog(null, "Obrigado por utilizar o Banco Digital Java OO!", "BANCO DIGITAL JAVA OO", JOptionPane.WARNING_MESSAGE);
                selecao= false;
            }

        }



    }

}