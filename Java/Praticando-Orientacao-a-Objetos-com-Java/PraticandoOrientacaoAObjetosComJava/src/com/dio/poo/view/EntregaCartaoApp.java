package com.dio.poo.view;

import com.dio.poo.model.Cliente;
import com.dio.poo.model.Endereco;

import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.cep="00000000";
        //Dados do endereço

        Cliente cliente = new Cliente();
        //Dados do Cliente

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!");
        } catch (Exception e){
            System.err.println("Houve um erro ao adicionar o endereço!"+e.getMessage());
        }
    }
}
