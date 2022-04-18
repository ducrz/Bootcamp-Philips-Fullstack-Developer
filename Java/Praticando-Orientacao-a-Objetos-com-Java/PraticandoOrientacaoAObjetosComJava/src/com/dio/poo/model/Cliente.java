package com.dio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{

    public String numCartao;
    private List<Endereco> enderecos;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }





    public void adicionaEndereco(Endereco endereco){
        if(endereco == null){
            throw new NullPointerException("Endereço não pode ser nulo");
        }
        if(endereco.cep == null){
            throw new NullPointerException("CEP não pode ser nulo");
        }
        getEnderecos().add(endereco);
    }

    private  List<Endereco> getEnderecos() {
        if(enderecos == null){
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }


}
